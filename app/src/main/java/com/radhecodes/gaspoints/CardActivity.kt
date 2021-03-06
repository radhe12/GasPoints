package com.radhecodes.gaspoints

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.EditorInfo
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardRepository
import kotlinx.android.synthetic.main.activity_card.*
import kotlinx.android.synthetic.main.points_card_toolbar.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class CardActivity : AppCompatActivity() {

    private val initialMode: Int  = 0
    private val viewMode: Int = 1
    private val editMode: Int = 2
    private var currentMode: Int? = null
    private lateinit var initialPointCard: PointCard
    lateinit var selectedPointCard: String
    private var selectedPointCardId: Long = 0
    private lateinit var pointCardRepository: PointCardRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        pointCardRepository = PointCardRepository(this)

        pc_type.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                selectedPointCard = pc_type.selectedItem.toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        ArrayAdapter.createFromResource(
            this,
            R.array.points_card_type,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            pc_type.adapter = adapter
        }

        selectedPointCardId = intent.getLongExtra("view_id", 0)
        if(selectedPointCardId == 0L)
            inInitialMode()
        else
            inViewMode(selectedPointCardId)

        edit_button.setOnClickListener {
            inEditMode()
            pc_type.requestFocus()
        }

        generate_card.setOnClickListener {
            generateButtonClicked()
        }

        barcode_text.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            var handled = false
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                generateButtonClicked()
                handled = true
            }
            handled
        })

        delete_button.setOnClickListener {
            CoroutineScope(IO).launch {
                initialPointCard.id = selectedPointCardId
                val result = pointCardRepository.deleteCardTask(initialPointCard)
                onDeleteSuccess(result)
            }
        }

        edit_button.setOnClickListener {
            if(selectedPointCardId != 0L)
                inEditMode()
        }

        back_button.setOnClickListener {
            backClick()
        }

    }

    private fun generateButtonClicked() {
        if(barcode_text.length() != 0) {
            initialPointCard = PointCard(selectedPointCard, barcode_text.text.toString())
            if(currentMode == initialMode) {
                CoroutineScope(IO).launch {
                    val id = pointCardRepository.insertCardTask(initialPointCard)
                    onInsertFinish(id)
                }
            }
            if(currentMode == editMode) {
                CoroutineScope(IO).launch {
                    initialPointCard.id = selectedPointCardId
                    val result = pointCardRepository.updateCardTask(initialPointCard)
                    onUpdateFinish(result)
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        currentMode?.let { outState.putInt("mode", it) }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        currentMode = savedInstanceState.getInt("mode")

        if(currentMode == editMode)
            inEditMode()
    }

    private fun backClick() {
        if(currentMode == viewMode || currentMode == initialMode)
            finish()
        else
            inViewMode(selectedPointCardId)
    }

    override fun onBackPressed() {
        if(currentMode == editMode)
            backClick()
        else
            super.onBackPressed()
    }

    private fun inInitialMode() {
        edit_button.visibility = GONE
        delete_button.visibility = GONE

        generate_card.text = "Generate Card"
        currentMode = initialMode
    }

    private fun inViewMode(id: Long) {

        edit_button.visibility = VISIBLE
        delete_button.visibility = VISIBLE

        barcode_text.setText("")
        edit_layout.visibility = GONE
        view_layout.visibility = VISIBLE
        getCardView(id)
        currentMode = viewMode
    }

    private fun inEditMode() {
        edit_button.visibility = GONE
        delete_button.visibility = GONE

        edit_layout.visibility = VISIBLE
        view_layout.visibility = GONE

        generate_card.text = "Update Card"
        getCardInEditView(selectedPointCardId)
        currentMode = editMode
    }

    private fun getCardView(id: Long){
        pointCardRepository.retrieveCardByIdTask(id).observe(this,
            { card ->
                if (card != null)
                    cardViewSetup(card)
            })
    }

    private fun getCardInEditView(id: Long){
        pointCardRepository.retrieveCardByIdTask(id).observe(this,
            { card ->
                if (card != null)
                    cardEditModeSetup(card)
            })
    }

    private fun cardEditModeSetup(pointCard: PointCard) {
        barcode_text.setText(pointCard.barcodeData)
        val pos = resources.getStringArray(R.array.points_card_type).indexOf(pointCard.pointCardType)
        pc_type.setSelection(pos)
    }

    private fun cardViewSetup(pointCard: PointCard) {
        initialPointCard = PointCard(pointCard.pointCardType, pointCard.barcodeData)
        card_name_view.text = pointCard.pointCardType
        card_in_view_mode.setCardBackgroundColor(getColorCode(pointCard.pointCardType))
        generateQRCode(pointCard.barcodeData)
    }

    private fun getColorCode(cardType: String) : Int {
        return when (cardType) {
            "Petro Canada" -> resources.getColor(R.color.petroColor)
            "Esso" -> resources.getColor(R.color.essoColor)
            "Shell" -> resources.getColor(R.color.shellColor)
            "Canadian Tire" -> resources.getColor(R.color.ctColor)
            "Ultramar" -> resources.getColor(R.color.ultramarColor)
            else -> resources.getColor(R.color.petroColor)
        }
    }

    private fun generateQRCode(input: String) {
        // this is a small sample use of the QRCodeEncoder class from zxing
        try {
            // generate a 150x150 QR code
            val writer = QRCodeWriter()
            val bitMatrix = writer.encode(input, BarcodeFormat.QR_CODE, 150, 150)

            val bmp = Bitmap.createBitmap(150, 150, Bitmap.Config.RGB_565)
            for (x in 0 until 150) {
                for (y in 0 until 150) {
                    bmp.setPixel(y, x, if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE)
                }
            }

            if (bmp != null) {
                barcode_view.setImageBitmap(bmp)
            }
        } catch (e: Exception) { //eek }
            Toast.makeText(this, "Not valid barcode text", Toast.LENGTH_LONG).show()
        }
    }

    private suspend fun onInsertFinish(id: Long?) {
        withContext(Main) {
            if(id != 0L) {
                Toast.makeText(this@CardActivity, "Card Added", Toast.LENGTH_LONG).show()
                barcode_text.setText("")
                if (id != null) {
                    inViewMode(id)
                    selectedPointCardId = id
                }
            }
            else
                Toast.makeText(this@CardActivity, "Something went wrong", Toast.LENGTH_LONG).show()
        }
    }

     private suspend fun onUpdateFinish(result: Int) {
             withContext(Main) {
                 if(result != -1) {
                 Toast.makeText(this@CardActivity, "Card Updated", Toast.LENGTH_LONG).show()
                 barcode_text.setText("")
                 inViewMode(selectedPointCardId)
                 }
                 else
                     Toast.makeText(this@CardActivity, "Something went wrong", Toast.LENGTH_LONG).show()
             }
     }

     private suspend fun onDeleteSuccess(result: Int) {
        withContext(Main) {
            if(result != -1) {
                Toast.makeText(this@CardActivity, "Card Deleted", Toast.LENGTH_LONG).show()
                val intent = intent
                 intent.putExtra("isDeleted", true)
                 setResult(RESULT_OK, intent)
                 finish()
             }
            else
                Toast.makeText(this@CardActivity, "Something went wrong", Toast.LENGTH_LONG).show()
        }
     }


    private suspend fun insertSuccess(id: Long?) {

    }

}
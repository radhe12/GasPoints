package com.radhecodes.gaspoints

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardRepository
import kotlinx.android.synthetic.main.activity_card.*
import kotlinx.android.synthetic.main.points_card_toolbar.*

class CardActivity : AppCompatActivity() {

    private val initialMode: Int  = 0
    private val viewMode: Int = 1
    private val editMode: Int = 2
    private var currentMode: Int? = null
    lateinit var selectedPointCard: String
    lateinit var pointCard: PointCard
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

        val id = intent.getLongExtra("view_id", 0)
        if(id == 0L)
            inInitialMode()
        else
            inViewMode(id)

        edit_button.setOnClickListener {
            inEditMode()
            pc_type.requestFocus()
        }

        generate_card.setOnClickListener {
            if(barcode_text.length() != 0) {
                pointCard = PointCard(selectedPointCard, barcode_text.text.toString())
                pointCardRepository.insertCardTask(pointCard)
            }
        }
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
        edit_view.visibility = GONE
        view_layout.visibility = VISIBLE
        getCardView(id)
        currentMode = viewMode
    }

    private fun inEditMode() {
        edit_button.visibility = GONE
        delete_button.visibility = GONE
        generate_card.text = "Update Card"
        currentMode = editMode
    }

    private fun getCardView(id: Long){
        pointCardRepository.retrieveCardByIdTask(id).observe(this,
            { card ->
                if (card != null)
                    cardViewSetup(card)
            })
    }

    private fun cardViewSetup(pointCard: PointCard) {
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


}
package com.radhecodes.gaspoints

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.radhecodes.gaspoints.adapter.CardsRecyclerAdapter
import com.radhecodes.gaspoints.model.PointCard
import com.radhecodes.gaspoints.persistence.PointCardRepository
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), CardsRecyclerAdapter.OnPointCardListener {

    private lateinit var cardAdapter: CardsRecyclerAdapter
    private lateinit var pointCardRepository: PointCardRepository
    private var pointCards: ArrayList<PointCard> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_new.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        pointCardRepository = PointCardRepository(this)
        initRecyclerView()
        getAllPointsCard()
    }

    private fun initRecyclerView(){
        card_list.apply {
            layoutManager = LinearLayoutManager(context)
            cardAdapter = CardsRecyclerAdapter(this@MainActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            adapter = cardAdapter
        }
    }

    private fun getAllPointsCard(){
        pointCardRepository.retrieveCardsTask().observe(this,
            { cards ->
                if (pointCards.size > 0) {
                    pointCards.clear()
                }
                if (cards != null) {
                    pointCards.addAll(cards)
                }
                cardAdapter.submitList(pointCards)
                cardAdapter.notifyDataSetChanged()
            })
    }

    override fun onPointCardClick(position: Int) {
        val intent = Intent(this, CardActivity::class.java)
        intent.putExtra("view_id", pointCards[position].id)
        startActivity(intent)
    }

}
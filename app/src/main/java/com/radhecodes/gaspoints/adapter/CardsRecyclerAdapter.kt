package com.radhecodes.gaspoints.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.radhecodes.gaspoints.R
import com.radhecodes.gaspoints.model.PointCard
import kotlinx.android.synthetic.main.card_list_item.view.*
import java.util.ArrayList

class CardsRecyclerAdapter(private val onPointCardListener: OnPointCardListener) : RecyclerView.Adapter<CardsRecyclerAdapter.CardViewHolder>() {

    private var items : List<PointCard> = ArrayList()

    class CardViewHolder (itemView: View, private val onPointCardListener: OnPointCardListener) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private val cardName = itemView.card_type_name
        private val cardView = itemView.list_card

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(pointCard: PointCard) {
            cardName.text = pointCard.pointCardType
            cardView.setBackgroundColor(getColorCode(pointCard.pointCardType, itemView))
        }

        private fun getColorCode(cardType: String, view: View) : Int {
            return when (cardType) {
                "Petro Canada" -> view.resources.getColor(R.color.petroColor)
                "Esso" -> view.resources.getColor(R.color.essoColor)
                "Shell" -> view.resources.getColor(R.color.shellColor)
                "Canadian Tire" -> view.resources.getColor(R.color.ctColor)
                "Ultramar" -> view.resources.getColor(R.color.ultramarColor)
                else -> view.resources.getColor(R.color.petroColor)
            }
        }

        override fun onClick(v: View?) {
            onPointCardListener.onPointCardClick(adapterPosition)
        }

    }

    interface OnPointCardListener {
        fun onPointCardClick(position: Int)
    }

    fun submitList(cards : List<PointCard>) {
        items = cards
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_list_item, parent, false),
            onPointCardListener
        )
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
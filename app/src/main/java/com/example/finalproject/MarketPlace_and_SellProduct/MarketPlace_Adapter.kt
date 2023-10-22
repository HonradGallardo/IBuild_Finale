package com.example.finalproject.MarketPlace_and_SellProduct

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R


class MarketPlace_Adapter(private val cardItems: List<MarketPlace_DataClass>) : RecyclerView.Adapter<MarketPlace_Adapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryTextView: TextView = itemView.findViewById(R.id.tv_category_input)
        val titleTextView: TextView = itemView.findViewById(R.id.tv_litstingtitle)
        val conditionTextView: TextView = itemView.findViewById(R.id.tv_condition_input)
        val priceTextView: TextView = itemView.findViewById(R.id.tv_price)
        val description: TextView = itemView.findViewById(R.id.tv_input_dscription)
        val contact: TextView = itemView.findViewById(R.id.tv_contact_input)
        val ivImage1: ImageView = itemView.findViewById(R.id.iv_image1)
        val ivImage2: ImageView = itemView.findViewById(R.id.iv_image2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.marketplace_card_view, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardItem = cardItems[position]

        holder.titleTextView.text = cardItems[position].name
        holder.priceTextView.text = cardItems[position].price.toString()
        holder.categoryTextView.text = cardItems[position].category
        holder.conditionTextView.text = cardItems[position].condition
        holder.description.text = cardItems[position].description
        holder.contact.text = cardItems[position].contact.toString()


        // Assuming CardItemData class has a property imageUris as a list of Uri
        if (cardItems[position].imageUris.isNotEmpty()) {
            holder.ivImage1.setImageURI(cardItems[position].imageUris[0])
        }

        if (cardItems[position].imageUris.size > 1) {
            holder.ivImage2.setImageURI(cardItems[position].imageUris[1])
        }
    }

    override fun getItemCount(): Int {
        return cardItems.size
    }
}

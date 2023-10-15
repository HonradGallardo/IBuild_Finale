package com.example.finalproject.Cart_Activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class Cart_Adapter constructor(private val DataClass : List<Cart_Data_Class>) : RecyclerView.Adapter<Cart_Adapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  DataClass.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemModel.text = DataClass[position].productName
        holder.itemDescription.text = DataClass[position].description
        holder.itemPrice.text = DataClass[position].price.toString()
        holder.itemImage.setImageResource(R.drawable.tecwarenexusairm2)
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val itemModel : TextView = itemView.findViewById(R.id.tv_item_model)
        val itemDescription : TextView = itemView.findViewById(R.id.item_description)
        val itemPrice : TextView = itemView.findViewById(R.id.item_price)
        val itemImage : ImageView = itemView.findViewById(R.id.item_image)


    }
}
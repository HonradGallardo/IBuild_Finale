package com.example.finalproject.Cart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class Cart_Adapter constructor(private val context: Context, private val DataClass : List<Cart_Data_Class>) : RecyclerView.Adapter<Cart_Adapter.MyViewHolder>(){

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
        holder.itemImage.setImageResource(DataClass[position].imageResource)
        holder.trashIcon.setOnClickListener{

            val productId = DataClass[position].productId

            val databaseHelper = CartDatabaseHelper(context)  // Create an instance of your database helper
            val rowsDeleted = databaseHelper.deleteCartItem(productId)

            if (rowsDeleted > 0) {
                Toast.makeText(context, "Item removed from the cart", Toast.LENGTH_SHORT).show()
                // The item was successfully removed
            } else {
                Toast.makeText(context, "Reload the Page", Toast.LENGTH_SHORT).show()
            }
        }
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val itemModel : TextView = itemView.findViewById(R.id.tv_item_model)
        val itemDescription : TextView = itemView.findViewById(R.id.item_description)
        val itemPrice : TextView = itemView.findViewById(R.id.item_price)
        val itemImage : ImageView = itemView.findViewById(R.id.item_image)
        val trashIcon : ImageView = itemView.findViewById(R.id.trashIcon)


    }
}
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

class Cart_Adapter constructor(private val context: Context, private val DataClass : MutableList<Cart_Data_Class>, private val onItemRemoved: (List<Cart_Data_Class>) -> Unit, private val cartActivity: Cart) : RecyclerView.Adapter<Cart_Adapter.MyViewHolder>(){

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
        holder.quantityNumber.text = DataClass[position].quantity.toString()


        holder.minusIcon.setOnClickListener {
            if (DataClass[position].quantity > 1) {
                DataClass[position].quantity--
                updatePrice(holder, DataClass[position])
                cartActivity.updateTotalPrice(DataClass)
            }

        }

        holder.plusIcon.setOnClickListener {
            DataClass[position].quantity++
            updatePrice(holder, DataClass[position])
            cartActivity.updateTotalPrice(DataClass)

        }

        holder.trashIcon.setOnClickListener{

            val productId = DataClass[position].productId

            val databaseHelper = CartDatabaseHelper(context)  // Create an instance of your database helper
            val rowsDeleted = databaseHelper.deleteCartItem(productId)

            if (rowsDeleted > 0) {
                // The item was successfully removed
                DataClass.removeAt(position) // Remove the item from the list
                notifyItemRemoved(position) // Notify the adapter that an item has been removed
                notifyItemRangeChanged(position, DataClass.size) // Notify the adapter that data has changed
                onItemRemoved(DataClass) // Notify the activity of the change


            } else {
                Toast.makeText(context, "Reload the Page", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updatePrice(holder: MyViewHolder, item: Cart_Data_Class) {
        holder.quantityNumber.text = item.quantity.toString()
        val totalPrice = item.price * item.quantity
        holder.itemPrice.text = totalPrice.toString()
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val itemModel : TextView = itemView.findViewById(R.id.tv_item_model)
        val itemDescription : TextView = itemView.findViewById(R.id.item_description)
        val itemPrice : TextView = itemView.findViewById(R.id.item_price)
        val itemImage : ImageView = itemView.findViewById(R.id.item_image)
        val trashIcon : ImageView = itemView.findViewById(R.id.trashIcon)
        val minusIcon : ImageView = itemView.findViewById(R.id.minus_icon)
        val plusIcon : ImageView = itemView.findViewById(R.id.plus_icon)
        val quantityNumber : TextView = itemView.findViewById(R.id.quantity_textView)


    }
}
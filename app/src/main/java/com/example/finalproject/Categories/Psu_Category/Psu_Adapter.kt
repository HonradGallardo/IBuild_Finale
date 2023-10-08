package com.example.finalproject.Categories.Psu_Category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class Psu_Adapter constructor(private val getActivity: Psu_products_holder, private val data: List<Psu_Data_Class>) :
    RecyclerView.Adapter<Psu_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_psu_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.psuModel.text = data[position].psuModelt
        holder.psuPrice.text = data[position].psuPricet
        holder.imageView.setImageResource(data[position].psuImage)

        holder.cardViewer.setOnClickListener {
            Toast.makeText(getActivity, data[position].psuModelt, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val psuModel: TextView = itemView.findViewById(R.id.Psu_Model_tv)
        val psuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Psu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Psu_image)
    }
}
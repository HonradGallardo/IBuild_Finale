package com.example.finalproject.Categories.Hdd_Category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class Hdd_Adapter constructor(private val getActivity: Hdd_products_holder, private val data: List<Hdd_Data_Class>) :
    RecyclerView.Adapter<Hdd_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_hdd_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.hddModel.text = data[position].hddModelt
        holder.hddPrice.text = data[position].hddPricet
        holder.imageView.setImageResource(data[position].hddImage)

        holder.cardViewer.setOnClickListener {
            Toast.makeText(getActivity, data[position].hddModelt, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val hddModel: TextView = itemView.findViewById(R.id.Hdd_Model_tv)
        val hddPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Hdd_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Hdd_image)
    }
}
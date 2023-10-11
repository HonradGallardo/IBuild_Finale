package com.example.finalproject.Categories.Monitor_Category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R


class Monitor_Adapter constructor(private val getActivity: Monitor_products_holder, private val data: List<Monitor_Data_Class>) :
    RecyclerView.Adapter<Monitor_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_monitor_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.monitorModel.text = data[position].monitorModelt
        holder.monitorPrice.text = data[position].monitorPricet
        holder.imageView.setImageResource(data[position].monitorImage)

        holder.cardViewer.setOnClickListener {
            Toast.makeText(getActivity, data[position].monitorModelt, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val monitorModel: TextView = itemView.findViewById(R.id.Monitor_Model_tv)
        val monitorPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Monitor_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Monitor_image)
    }
}
package com.example.finalproject.Categories.Ssd_Category

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.MoBo_Category.Mobo_Data_Class
import com.example.finalproject.R

class Ssd_Adapter constructor(private val getActivity: Ssd_products_holder, private var data: List<Ssd_Data_Class>) :
    RecyclerView.Adapter<Ssd_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_ssd_product_items, parent, false)
        return MyViewHolder(view)
    }

    fun setFilteredListCpu(ssd_prod:List<Ssd_Data_Class>){
        this.data=ssd_prod
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ssdModel.text = data[position].ssdModelt
        holder.ssdPrice.text = data[position].ssdPricet.toString()
        holder.imageView.setImageResource(data[position].ssdImage)

        holder.cardViewer.setOnClickListener {
            val selectedCpu = data[position]

            // Create an intent to start the new activity
            val intent = Intent(getActivity, selectedCpu.targetActivity)

            // Pass any additional information if needed

            // Start the new activity
            getActivity.startActivity(intent)
            getActivity.finish()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ssdModel: TextView = itemView.findViewById(R.id.Ssd_Model_tv)
        val ssdPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Ssd_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Ssd_image)
    }
}
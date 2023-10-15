package com.example.finalproject.Categories.Psu_Category

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

class Psu_Adapter constructor(private val getActivity: Psu_products_holder, private var data: List<Psu_Data_Class>) :
    RecyclerView.Adapter<Psu_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_psu_product_items, parent, false)
        return MyViewHolder(view)
    }
    fun setFilteredListCpu(psu_prod:List<Psu_Data_Class>){
        this.data=psu_prod
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.psuModel.text = data[position].psuModelt
        holder.psuPrice.text = data[position].psuPricet.toString()
        holder.imageView.setImageResource(data[position].psuImage)

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
        val psuModel: TextView = itemView.findViewById(R.id.Psu_Model_tv)
        val psuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Psu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Psu_image)
    }
}
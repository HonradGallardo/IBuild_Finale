package com.example.finalproject.Categories.Ram_Category

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

class Ram_Adapter constructor(private val getActivity: Ram_products_holder, private var data: List<Ram_Data_Class>) :
    RecyclerView.Adapter<Ram_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_ram_product_items, parent, false)
        return MyViewHolder(view)
    }

    fun setFilteredListCpu(ram_prod:List<Ram_Data_Class>){
        this.data=ram_prod
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ramModel.text = data[position].ramModelt
        holder.ramPrice.text = data[position].ramPricet.toString()
        holder.imageView.setImageResource(data[position].ramImage)

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
        val ramModel: TextView = itemView.findViewById(R.id.Ram_Model_tv)
        val ramPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Ram_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Ram_image)
    }
}
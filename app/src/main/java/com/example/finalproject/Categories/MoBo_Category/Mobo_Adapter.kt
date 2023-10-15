package com.example.finalproject.Categories.MoBo_Category

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R



class Mobo_Adapter constructor(private val getActivity: Mobo_products_holder, private var data: List<Mobo_Data_Class>) :
    RecyclerView.Adapter<Mobo_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_mobo_product_items, parent, false)
        return MyViewHolder(view)
    }

    fun setFilteredListCpu(mobo_prod:List<Mobo_Data_Class>){
        this.data=mobo_prod
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.moboModel.text = data[position].moboModelt
        holder.moboPrice.text = data[position].moboPricet.toString()
        holder.imageView.setImageResource(data[position].moboImage)

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
        val moboModel: TextView = itemView.findViewById(R.id.Mobo_Model_tv)
        val moboPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Mobo_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Mobo_image)
    }
}
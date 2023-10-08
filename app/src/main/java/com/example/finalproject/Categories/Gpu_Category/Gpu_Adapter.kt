package com.example.finalproject.Categories.Gpu_Category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder

class Gpu_Adapter constructor(private val getActivity: Gpu_products_holder, private val data: List<Gpu_Data_Class>) :
    RecyclerView.Adapter<Gpu_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_gpu_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gpuModel.text = data[position].gpuModelt
        holder.gpuPrice.text = data[position].gpuPricet
        holder.imageView.setImageResource(data[position].gpuImage)

        holder.cardViewer.setOnClickListener {
            Toast.makeText(getActivity, data[position].gpuModelt, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val gpuModel: TextView = itemView.findViewById(R.id.Gpu_Model_tv)
        val gpuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Gpu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Gpu_image)
    }
}
package com.example.finalproject.AmdBuild

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.Cpu_Category.Cpu_Adapter
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.R

class amd_build_Adapter(private val getActivity: amd_build, private var DataClass: List<amd_build_Data_Class>) :
    RecyclerView.Adapter<amd_build_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_cpu_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.cpuModel.text = DataClass[position].title
        holder.cpuPrice.text = DataClass[position].price.toString()
        holder.imageView.setImageResource(DataClass[position].images)
    }

    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val cpuModel: TextView = itemView.findViewById(R.id.Cpu_Model_tv)
        val cpuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Cpu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Cpu_image)

    }

    fun setFilteredList(DataClass: List<amd_build_Data_Class>){
        this.DataClass = DataClass
        notifyDataSetChanged()
    }


}
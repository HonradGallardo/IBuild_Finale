package com.example.finalproject.IntelBuild


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class IntelBuildAdapter(private val getActivity: IntelBuild, private var intelList: List<IntelBuildDataClass>) :
    RecyclerView.Adapter<IntelBuildAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_cpu_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.cpuModel.text = intelList[position].title
        holder.cpuPrice.text = intelList[position].price.toString()
        holder.imageView.setImageResource(intelList[position].image)
        holder.cardViewer.setOnClickListener {
            val selectedCase = intelList[position]

            val intent = Intent(getActivity, selectedCase.targetActivity)

            getActivity.startActivity(intent)
            getActivity.finish()
        }
    }

    override fun getItemCount(): Int {
        return intelList.size
    }
    fun setFilteredList(intelList: List<IntelBuildDataClass>){
        this.intelList = intelList
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cpuModel: TextView = itemView.findViewById(R.id.Cpu_Model_tv)
        val cpuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Cpu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Cpu_image)

    }
}
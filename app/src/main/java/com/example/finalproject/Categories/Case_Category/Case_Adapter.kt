package com.example.finalproject.Categories.Case_Category

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.Cpu_Category.Cpu_Adapter
import com.example.finalproject.R

class Case_Adapter constructor(private val getActivity : Case_product_holder, private var DataClass : List<Case_Data_Class>) : RecyclerView.Adapter<Case_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_cpu_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.caseModel.text = DataClass[position].caseModel
        holder.casePrice.text = DataClass[position].casePrice.toString()
        holder.imageView.setImageResource(DataClass[position].caseImage)

        holder.cardViewer.setOnClickListener{
            val selectedCase = DataClass[position]

            val intent = Intent(getActivity, selectedCase.targetActivity)

            getActivity.startActivity(intent)
            getActivity.finish()

        }
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val caseModel: TextView = itemView.findViewById(R.id.Cpu_Model_tv)
        val casePrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Cpu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Cpu_image)

    }

    fun setFilteredListCase(DataClass : List<Case_Data_Class>){
        this.DataClass = DataClass
        notifyDataSetChanged()

    }

}
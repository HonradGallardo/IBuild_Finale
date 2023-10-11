package com.example.finalproject.Adapters

import DataClass.AmdBuilderDataClass
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.AmdBuilderRecyclerView
import com.example.finalproject.AmdProcessorProducts
import com.example.finalproject.R

class amdbuilderAdapter constructor(private val getActivity: AmdProcessorProducts, private val amdProcyProduct: List<AmdBuilderDataClass>) : RecyclerView.Adapter<amdbuilderAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.amdbuilderproducts, parent, false)
        return MyViewHolder(view)


    }

    override fun getItemCount(): Int {
        return amdProcyProduct.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = amdProcyProduct[position].title
        holder.img_ryzen9.setImageResource(amdProcyProduct[position].image)
        holder.tv_r9_price.text = amdProcyProduct[position].price
        holder.tv_r9_description.text = amdProcyProduct[position].description
        holder.card_view.setOnClickListener{
            Toast.makeText(getActivity, amdProcyProduct[position].title, Toast.LENGTH_LONG).show()
        }
        holder.bt_select.setOnClickListener {
            val int = Intent(getActivity, AmdBuilderRecyclerView::class.java)
            int.putExtra("Ryzen 9 5900x", holder.title.text)
            int.putExtra("img_ryzen9", amdProcyProduct[position].image)
            int.putExtra("tv_r9_price", holder.tv_r9_price.text)
            int.putExtra("tv_r9_description", holder.tv_r9_description.text)
            getActivity.startActivity(int)
            getActivity.finish()
        }
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
         val title: TextView = itemView.findViewById(R.id.tv_r9)
         val card_view : CardView = itemView.findViewById(R.id.amd_product_layout_cardView)
         val img_ryzen9 : ImageView = itemView.findViewById(R.id.img_ryzen9)
         val tv_r9_price : TextView = itemView.findViewById(R.id.tv_r9_price)
         val tv_r9_description : TextView = itemView.findViewById(R.id.tv_r9_description)
         val bt_select : Button = itemView.findViewById(R.id.bt_select)
    }


}










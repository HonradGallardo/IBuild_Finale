package com.example.finalproject.Adapters

import DataClass.AmdMotherboardDataClass
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
import com.example.finalproject.MotherboardProducts
import com.example.finalproject.R

class AmdMotherboardAdapter constructor(private val getActivity: MotherboardProducts, private val DataClass : List<AmdMotherboardDataClass>) : RecyclerView.Adapter<AmdMotherboardAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.amd_motherboard_products_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.moboName.text = DataClass[position].moboName
        holder.tv_motherboard_description.text = DataClass[position].moboDescription
        holder.tv_motherboard_price.text = DataClass[position].moboPrice
        holder.card_view.setOnClickListener{
            Toast.makeText(getActivity, DataClass[position].moboName, Toast.LENGTH_LONG).show()
        }
        holder.img_motherboard.setImageResource(DataClass[position].moboImage)

        holder.bt_select.setOnClickListener {
            val int = Intent(getActivity, AmdBuilderRecyclerView::class.java)
            int.putExtra("moboName", holder.moboName.text)
            int.putExtra("moboImage", DataClass[position].moboImage)
            int.putExtra("moboPrice", holder.tv_motherboard_price.text)
            int.putExtra("moboDescription", holder.tv_motherboard_description.text)
            getActivity.startActivity(int)
            getActivity.finish()
        }

    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    class MyViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
        val moboName: TextView = itemView.findViewById(R.id.tv_motherboardName)
        val card_view : CardView = itemView.findViewById(R.id.amd_motherboard_product_layout_cardView)
        val img_motherboard : ImageView = itemView.findViewById(R.id.img_motherboard)
        val tv_motherboard_price : TextView = itemView.findViewById(R.id.tv_motherboard_price)
        val tv_motherboard_description : TextView = itemView.findViewById(R.id.tv_motherboard_description)
        val bt_select : Button = itemView.findViewById(R.id.bt_select_motherboard)

    }

}
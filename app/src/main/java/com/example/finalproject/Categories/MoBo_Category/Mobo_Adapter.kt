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
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Categories.Hdd_Category.Hdd_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder


class Mobo_Adapter constructor(private val getActivity: Mobo_products_holder, private val data: List<Mobo_Data_Class>) :
    RecyclerView.Adapter<Mobo_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_mobo_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.moboModel.text = data[position].moboModelt
        holder.moboPrice.text = data[position].moboPricet
        holder.imageView.setImageResource(data[position].moboImage)

        holder.cardViewer.setOnClickListener {
            if(position == 0){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            } else if(position == 1){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 2){
                val int = Intent(getActivity, Hdd_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 3){
                val int = Intent(getActivity, Ssd_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 4){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 5){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 6){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 7){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 8){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 9){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 10){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 11){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 12){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 13){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 14){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 15){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 16){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 17){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 18){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 19){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else{
                val int = Intent (getActivity, Mobo_products_holder::class.java)
                getActivity.startActivity(int)
            }
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
package com.example.finalproject.Categories.Hdd_Category

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Gpu_products_info.Gpu_no10_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no11_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no12_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no13_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no14_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no15_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no16_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no17_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no18_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no19_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no20_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no2_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no3_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no4_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no5_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no6_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no7_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no8_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no9_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no3_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no4_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no5_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no7_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no8_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Hdd_Adapter constructor(private val getActivity: Hdd_products_holder, private val data: List<Hdd_Data_Class>) :
    RecyclerView.Adapter<Hdd_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_hdd_product_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.hddModel.text = data[position].hddModelt
        holder.hddPrice.text = data[position].hddPricet
        holder.imageView.setImageResource(data[position].hddImage)

        holder.cardViewer.setOnClickListener {
            if(position == 0){
                val int = Intent(getActivity, Hdd_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            } else if(position == 1){
                val int = Intent(getActivity, Hdd_no2_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 2){
                val int = Intent(getActivity, Hdd_no3_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 3){
                val int = Intent(getActivity, Hdd_no4_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 4){
                val int = Intent(getActivity, Hdd_no5_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 5){
                val int = Intent(getActivity, Hdd_no6_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 6){
                val int = Intent(getActivity, Hdd_no7_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position == 7){
                val int = Intent(getActivity, Hdd_no8_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else{
                val int = Intent (getActivity, rvHompagee::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val hddModel: TextView = itemView.findViewById(R.id.Hdd_Model_tv)
        val hddPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Hdd_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Hdd_image)
    }
}
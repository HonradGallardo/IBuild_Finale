package com.example.finalproject.Categories.Gpu_Category

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.R
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Products.Cpu_products_info.Cpu_no10_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no11_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no12_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no13_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no14_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no15_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no16_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no17_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no18_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no19_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no20_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no2_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no3_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no4_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no5_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no6_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no7_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no8_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no9_info
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
import com.example.finalproject.rvHompagee

class Gpu_Adapter constructor(private val getActivity: Gpu_products_holder, private var data: List<Gpu_Data_Class>) :
    RecyclerView.Adapter<Gpu_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_gpu_product_items, parent, false)
        return MyViewHolder(view)
    }

    fun setFilteredListCpu(Gpu_prod:List<Gpu_Data_Class>){
        this.data=Gpu_prod
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gpuModel.text = data[position].gpuModelt
        holder.gpuPrice.text = data[position].gpuPricet.toString()
        holder.imageView.setImageResource(data[position].gpuImage)

        holder.cardViewer.setOnClickListener {
            val selectedGpu = data[position]

            // Create an intent to start the new activity
            val intent = Intent(getActivity, selectedGpu.targetActivity)

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
        val gpuModel: TextView = itemView.findViewById(R.id.Gpu_Model_tv)
        val gpuPrice: TextView = itemView.findViewById(R.id.Price_tv)
        val cardViewer: CardView = itemView.findViewById(R.id.Gpu_cardView)
        val imageView: ImageView = itemView.findViewById(R.id.Gpu_image)
    }
}
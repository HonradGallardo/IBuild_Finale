package com.example.finalproject.Categories.Cpu_Category

import android.view.LayoutInflater
import android.view.View
import android.content.Intent
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Categories.Hdd_Category.Hdd_products_holder
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder
import com.example.finalproject.R
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
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
import com.example.finalproject.rvHompagee

class Cpu_Adapter constructor(private val getActivity: Cpu_products_holder, private val data: List<Cpu_Data_Class>) :
    RecyclerView.Adapter<Cpu_Adapter.MyViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_cpu_product_items, parent, false)
            return MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.cpuModel.text = data[position].cpuModelt
            holder.cpuPrice.text = data[position].cpuPricet
            holder.imageView.setImageResource(data[position].cpuImage)

            holder.cardViewer.setOnClickListener {
                if(position == 0){
                    val int = Intent(getActivity, Cpu_no1_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                } else if(position == 1){
                    val int = Intent(getActivity, Cpu_no2_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 2){
                    val int = Intent(getActivity, Cpu_no3_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 3){
                    val int = Intent(getActivity, Cpu_no4_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 4){
                    val int = Intent(getActivity, Cpu_no5_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 5){
                    val int = Intent(getActivity, Cpu_no6_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 6){
                    val int = Intent(getActivity, Cpu_no7_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 7){
                    val int = Intent(getActivity, Cpu_no8_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 8){
                    val int = Intent(getActivity, Cpu_no9_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 9){
                    val int = Intent(getActivity, Cpu_no10_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 10){
                    val int = Intent(getActivity, Cpu_no11_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 11){
                    val int = Intent(getActivity, Cpu_no12_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 12){
                    val int = Intent(getActivity, Cpu_no13_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 13){
                    val int = Intent(getActivity, Cpu_no14_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 14){
                    val int = Intent(getActivity, Cpu_no15_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 15){
                    val int = Intent(getActivity, Cpu_no16_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 16){
                    val int = Intent(getActivity, Cpu_no17_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 17){
                    val int = Intent(getActivity, Cpu_no18_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 18){
                    val int = Intent(getActivity, Cpu_no19_info::class.java)
                    getActivity.startActivity(int)
                    getActivity.finish()
                }else if(position == 19){
                    val int = Intent(getActivity, Cpu_no20_info::class.java)
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
            val cpuModel: TextView = itemView.findViewById(R.id.Cpu_Model_tv)
            val cpuPrice: TextView = itemView.findViewById(R.id.Price_tv)
            val cardViewer: CardView = itemView.findViewById(R.id.Cpu_cardView)
            val imageView: ImageView = itemView.findViewById(R.id.Cpu_image)
        }
    }
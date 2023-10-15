package com.example.finalproject.Adapters

import DataClass.Product
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no18_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no11_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no1_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee


class RecyclerViewApater(private val getActivity: rvHompagee, private val productList: List<Product> )
    : RecyclerView.Adapter<RecyclerViewApater.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_product_layout, parent, false)

        return MyViewHolder(view)


    }

    override fun getItemCount(): Int {
        return productList.size
    }


    //DITO LALAGYAN NG FUNCTION YUNG MGA PRODUCTS
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.productImage.setImageResource(productList[position].image)
        holder.title.text = productList[position].title
        holder.price.text = productList[position].price

        holder.cardView.setOnClickListener {
            if(position==0) {
                val int = Intent(getActivity, Cpu_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==1){
                val int = Intent(getActivity, Mobo_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==2){
                val int = Intent(getActivity, Gpu_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==3){
                val int = Intent(getActivity, Ram_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==4){
                val int = Intent(getActivity, Psu_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==5){
                val int = Intent(getActivity, Hdd_no6_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==6){
                val int = Intent(getActivity, Ssd_no11_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==7){
                val int = Intent(getActivity, Monitor_no18_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==8){
                val int = Intent(getActivity, Mobo_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }else if(position==9){
                val int = Intent(getActivity, Mobo_no1_info::class.java)
                getActivity.startActivity(int)
                getActivity.finish()
            }
        }

    }


    //Everytime we add a or connect a new xml file we need to call it in the onBindViewHolder to display.
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage : ImageView = itemView.findViewById(R.id.productImage)
        val title : TextView = itemView.findViewById(R.id.tv_title)
        val price : TextView = itemView.findViewById(R.id.tv_price)
        val cardView : CardView = itemView.findViewById(R.id.cardView)


    }



}
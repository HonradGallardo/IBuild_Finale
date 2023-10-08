package Adapters

import DataClass.HomepageCategoriesDataClass
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.AmdProcessorProducts
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Categories.Hdd_Category.Hdd_products_holder
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Monitor_Category.Monitor_products_holder
import com.example.finalproject.Categories.Psu_Category.Psu_products_holder
import com.example.finalproject.Categories.Ram_Category.Ram_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class HomepageCategoriesAdapter constructor(private val getActivity: rvHompagee, private val DataClass : List<HomepageCategoriesDataClass>)
    : RecyclerView.Adapter<HomepageCategoriesAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.homepagecategorieslayout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image_categories.setImageResource(DataClass[position].Image)
        holder.image_categories.setOnClickListener {
            if(position == 0){
                val int = Intent(getActivity, Cpu_products_holder::class.java)
                getActivity.startActivity(int)
            } else if(position == 1){
                val int = Intent(getActivity, Mobo_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 2){
                val int = Intent(getActivity, Gpu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 3){
                val int = Intent(getActivity, Ram_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 4){
                val int = Intent(getActivity, Psu_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 5){
                val int = Intent(getActivity, Ssd_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 6){
                val int = Intent(getActivity, Hdd_products_holder::class.java)
                getActivity.startActivity(int)
            }else if(position == 7){
                val int = Intent(getActivity, Monitor_products_holder::class.java)
                getActivity.startActivity(int)
            }else{
                val int = Intent (getActivity, rvHompagee::class.java)
                getActivity.startActivity(int)
            }
        }
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image_categories : ImageView = itemView.findViewById(R.id.image_categories)

    }

}
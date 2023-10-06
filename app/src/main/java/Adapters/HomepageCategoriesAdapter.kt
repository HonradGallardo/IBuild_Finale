package Adapters

import DataClass.HomepageCategoriesDataClass
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
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
            Toast.makeText(getActivity, "Title", Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image_categories : ImageView = itemView.findViewById(R.id.image_categories)

    }

}
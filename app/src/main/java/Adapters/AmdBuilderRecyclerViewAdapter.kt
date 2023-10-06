package Adapters

import DataClass.AmdBuilderDataClass
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.AmdBuilderRecyclerView
import com.example.finalproject.AmdProcessorProducts
import com.example.finalproject.MotherboardProducts
import com.example.finalproject.R

class AmdBuilderRecyclerViewAdapter constructor(private val getActivity: AmdBuilderRecyclerView, private val DataClass : List<AmdBuilderDataClass>) : RecyclerView.Adapter<AmdBuilderRecyclerViewAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.amd_builder_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = DataClass[position].title
        holder.description.text = DataClass[position].description
        holder.price.text = DataClass[position].price
        holder.image.setImageResource(DataClass[position].image)

        holder.add_button.setOnClickListener {
            val intent: Intent
            if (position == 0) {
                intent = Intent(getActivity, AmdProcessorProducts::class.java)
            } else if (position == 1) {
                intent = Intent(getActivity, MotherboardProducts::class.java)
            } else {
                intent = Intent(getActivity, AmdBuilderRecyclerView::class.java)
            }
            getActivity.startActivity(intent)
            getActivity.finish()
        }

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById(R.id.tv_amdProcessor_amdbuilder)
        val description : TextView = itemView.findViewById(R.id.processor_description)
        val price : TextView = itemView.findViewById(R.id.processor_price)
        val image : ImageView = itemView.findViewById(R.id.processor_image)
        val cardView : CardView = itemView.findViewById(R.id.amdBuilder_cardView)
        val add_button : ImageView = itemView.findViewById(R.id.img_add_processor_amdbuilder)

    }
}
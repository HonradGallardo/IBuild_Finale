package Adapters

import DataClass.Product
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
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
        holder.description.text = productList[position].description
        holder.price.text = productList[position].price

        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, productList[position].title, Toast.LENGTH_LONG).show()

        }

    }


    //Everytime we add a or connect a new xml file we need to call it in the onBindViewHolder to display.
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage : ImageView = itemView.findViewById(R.id.productImage)
        val title : TextView = itemView.findViewById(R.id.tv_title)
        val description : TextView = itemView.findViewById(R.id.tv_description_product_layout)
        val price : TextView = itemView.findViewById(R.id.tv_price)
        val cardView : CardView = itemView.findViewById(R.id.cardView)


    }



}
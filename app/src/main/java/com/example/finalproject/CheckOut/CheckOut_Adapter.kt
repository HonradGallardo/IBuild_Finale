import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.R

class CheckOut_Adapter(private val context: Context, private val cartItems: List<Cart_Data_Class>) :
    RecyclerView.Adapter<CheckOut_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.checkout_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = cartItems[position]
        holder.itemName.text = item.productName
        holder.itemPrice.text = "₱${item.price}"
        holder.textViewQuantity.text = "Quantity: ${item.quantity}"
        holder.itemImage.setImageResource(item.imageResource)
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.tv_item_model_checkout)
        val itemPrice: TextView = itemView.findViewById(R.id.item_price_checkout)
        val itemImage: ImageView = itemView.findViewById(R.id.item_image_checkout)
        val textViewQuantity : TextView = itemView.findViewById(R.id.quantity_textView_checkout)

    }


}

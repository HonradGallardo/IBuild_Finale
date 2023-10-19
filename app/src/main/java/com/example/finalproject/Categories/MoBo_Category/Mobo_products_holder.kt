package com.example.finalproject.Categories.MoBo_Category
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.Products.MoBo_products_info.Mobo_no10_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no11_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no12_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no13_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no14_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no15_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no16_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no17_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no18_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no19_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no20_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no3_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no4_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no5_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no7_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no8_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Collections
import java.util.Locale

class Mobo_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Mobo_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Mobo_Data_Class>()

    private lateinit var searchView : SearchView
    private lateinit var caseCart : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mobo_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Mobo_main_container) as RecyclerView


        cartAdapter = Mobo_Adapter(this@Mobo_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        searchView = findViewById(R.id.cpu_category_sv)
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        moboProducts()
        data.shuffle()

        backbt = findViewById(R.id.Mobo_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
        caseCart = findViewById(R.id.mobo_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Mobo_product_holder")
            startActivity(int)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
    private fun filterList(query:String?){
        if (query != null){
            val filteredList = ArrayList<Mobo_Data_Class>()
            for (i in data){
                if (i.moboModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.moboPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun moboProducts() {
        var moboModels = Mobo_Data_Class("ASUS ROG Strix B450-F Gaming ATX",7850.00, R.drawable.mobo_img1, Mobo_no1_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI B450M Mortar MAX Micro-ATX(mATX)",5565.00, R.drawable.mobo_img2, Mobo_no2_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B450M STEEL LEGEND Micro-ATX(mATX)",5650.00, R.drawable.mobo_img3,Mobo_no3_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS TUF B450M-Plus Gaming Micro-ATX(mATX)",5999.00, R.drawable.mobo_img4, Mobo_no4_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte B450 AORUS M Micro-ATX(mATX)",4999.00, R.drawable.mobo_img5, Mobo_no5_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS Prime B460M-A Micro-ATX(mATX)",5875.00, R.drawable.mobo_img6, Mobo_no6_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MAG B460M Mortar Micro-ATX(mATX)",6499.00, R.drawable.mobo_img7, Mobo_no7_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte B460M DS3H Micro-ATX(mATX)",5499.00, R.drawable.mobo_img8, Mobo_no8_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B460M Pro4 Micro-ATX(mATX)",5450.00, R.drawable.mobo_img9, Mobo_no9_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix B460-G Gaming Micro-ATX(mATX)",5090.00, R.drawable.mobo_img10, Mobo_no10_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix X570-E Gaming ATX",19260.00, R.drawable.mobo_img11, Mobo_no11_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MPG B550 Gaming Edge WiFi ATX",9950.00, R.drawable.mobo_img12, Mobo_no12_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte X570 AORUS Elite ATX",9458.00, R.drawable.mobo_img13, Mobo_no13_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B450 Pro4 ATX",5915.00, R.drawable.mobo_img14, Mobo_no14_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS Prime X570-Pro ATX",14490.00, R.drawable.mobo_img15, Mobo_no15_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix Z590-E Gaming WiFi 6E ATX",19490.00, R.drawable.mobo_img16, Mobo_no16_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MAG B550 TOMAHAWK ATX",10690.00, R.drawable.mobo_img17,Mobo_no17_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS PRIME B550-PLUS ATX",9600.00, R.drawable.mobo_img18,Mobo_no18_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI B550-A PRO ATX",7295.00, R.drawable.mobo_img19, Mobo_no19_info::class.java)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI B450 GAMING PLUS Motherboard ATX",7558.39, R.drawable.mobo_img20, Mobo_no20_info::class.java)
        data.add(moboModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

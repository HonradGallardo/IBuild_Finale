package com.example.finalproject.Categories.Psu_Category

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
import com.example.finalproject.Categories.MoBo_Category.Mobo_Data_Class
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no10_info
import com.example.finalproject.Products.Psu_products_info.Psu_no11_info
import com.example.finalproject.Products.Psu_products_info.Psu_no12_info
import com.example.finalproject.Products.Psu_products_info.Psu_no13_info
import com.example.finalproject.Products.Psu_products_info.Psu_no14_info
import com.example.finalproject.Products.Psu_products_info.Psu_no15_info
import com.example.finalproject.Products.Psu_products_info.Psu_no16_info
import com.example.finalproject.Products.Psu_products_info.Psu_no17_info
import com.example.finalproject.Products.Psu_products_info.Psu_no18_info
import com.example.finalproject.Products.Psu_products_info.Psu_no19_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no20_info
import com.example.finalproject.Products.Psu_products_info.Psu_no2_info
import com.example.finalproject.Products.Psu_products_info.Psu_no3_info
import com.example.finalproject.Products.Psu_products_info.Psu_no4_info
import com.example.finalproject.Products.Psu_products_info.Psu_no5_info
import com.example.finalproject.Products.Psu_products_info.Psu_no6_info
import com.example.finalproject.Products.Psu_products_info.Psu_no7_info
import com.example.finalproject.Products.Psu_products_info.Psu_no8_info
import com.example.finalproject.Products.Psu_products_info.Psu_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Psu_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Psu_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Psu_Data_Class>()

    private lateinit var searchView : SearchView
    private lateinit var caseCart : ImageView
    private lateinit var sortUp: ImageView
    private lateinit var sortDown : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.psu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.psu_main_container) as RecyclerView


        cartAdapter = Psu_Adapter(this@Psu_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        searchView = findViewById(R.id.cpu_category_sv)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        hddProducts()
        data.shuffle()

        backbt = findViewById(R.id.Psu_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
        caseCart = findViewById(R.id.psu_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Psu_product_holder")
            startActivity(int)
            finish()
        }
        sortUp = findViewById(R.id.sort_up)
        sortDown = findViewById(R.id.sort_down)


        sortUp.setOnClickListener {
            sortDataDescending()
        }
        sortDown.setOnClickListener {
            sortDataAscending()
        }
    }
    private fun sortDataDescending() {
        data.sortByDescending { it.psuPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    private fun sortDataAscending() {
        data.sortBy { it.psuPricet }
        cartAdapter?.setFilteredListCpu(data)
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
            val filteredList = ArrayList<Psu_Data_Class>()
            for (i in data){
                if (i.psuModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.psuPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun hddProducts() {
        var psuModels = Psu_Data_Class("EVGA SuperNOVA 650 G5",6240.83, R.drawable.psu_img1, Psu_no1_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair RM750x",7943.03, R.drawable.psu_img2, Psu_no2_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Focus GX-650",5106.03, R.drawable.psu_img3, Psu_no3_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("NZXT C750",5673.43, R.drawable.psu_img4, Psu_no4_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Thermaltake Toughpower Grand RGB 750W",5389.73, R.drawable.psu_img5, Psu_no5_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 750 G5",4822.33, R.drawable.psu_img6, Psu_no6_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair TX650M",11563.61, R.drawable.psu_img7, Psu_no7_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Prime Ultra 750W Titanium",10240.00, R.drawable.psu_img8, Psu_no8_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("be quiet! Straight Power 11 650W",7086.83, R.drawable.psu_img9, Psu_no9_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair SF750",10496.33, R.drawable.psu_img10, Psu_no10_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 850 G3",10105.96, R.drawable.psu_img11, Psu_no11_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Cooler Master MWE Gold 650",4850.00, R.drawable.psu_img12, Psu_no12_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SeaSonic S12III 550W",3403.83, R.drawable.psu_img13, Psu_no13_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA B5 550W",5106.03, R.drawable.psu_img14, Psu_no14_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("FSP Dagger 600W",6240.83, R.drawable.psu_img15, Psu_no15_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SilverStone Technology SST-ST60F-TI",11346.87, R.drawable.psu_img16, Psu_no16_info::class.java)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair CV550",2899.00, R.drawable.psu_img17, Psu_no17_info::class.java)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Seasonic SSR-600TL",10780.60, R.drawable.psu_img18, Psu_no18_info::class.java)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Cooler Master MasterWatt 650",3120.13, R.drawable.psu_img19, Psu_no19_info::class.java)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Antec Earthwatts Gold Pro 750W",13613.63, R.drawable.psu_img20, Psu_no20_info::class.java)
        data.add(psuModels)


        cartAdapter!!.notifyDataSetChanged()
    }

}

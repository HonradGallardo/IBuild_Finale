package com.example.finalproject.Categories.Ram_Category

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
import com.example.finalproject.Products.Ram_products_info.Ram_no10_info
import com.example.finalproject.Products.Ram_products_info.Ram_no11_info
import com.example.finalproject.Products.Ram_products_info.Ram_no12_info
import com.example.finalproject.Products.Ram_products_info.Ram_no13_info
import com.example.finalproject.Products.Ram_products_info.Ram_no14_info
import com.example.finalproject.Products.Ram_products_info.Ram_no15_info
import com.example.finalproject.Products.Ram_products_info.Ram_no16_info
import com.example.finalproject.Products.Ram_products_info.Ram_no17_info
import com.example.finalproject.Products.Ram_products_info.Ram_no18_info
import com.example.finalproject.Products.Ram_products_info.Ram_no19_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no20_info
import com.example.finalproject.Products.Ram_products_info.Ram_no2_info
import com.example.finalproject.Products.Ram_products_info.Ram_no3_info
import com.example.finalproject.Products.Ram_products_info.Ram_no4_info
import com.example.finalproject.Products.Ram_products_info.Ram_no5_info
import com.example.finalproject.Products.Ram_products_info.Ram_no6_info
import com.example.finalproject.Products.Ram_products_info.Ram_no7_info
import com.example.finalproject.Products.Ram_products_info.Ram_no8_info
import com.example.finalproject.Products.Ram_products_info.Ram_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Collections
import java.util.Locale
import kotlin.random.Random

class Ram_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Ram_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Ram_Data_Class>()

    private lateinit var searchView : SearchView
    private lateinit var caseCart : ImageView
    private lateinit var sortUp: ImageView
    private lateinit var sortDown : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ram_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.ram_main_container) as RecyclerView

        cartAdapter = Ram_Adapter(this@Ram_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
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

        ramProducts()
        data.shuffle()

        backbt = findViewById(R.id.Ram_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
        caseCart = findViewById(R.id.ram_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Ram_product_holder")
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
        data.sortByDescending { it.ramPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    private fun sortDataAscending() {
        data.sortBy { it.ramPricet }
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
            val filteredList = ArrayList<Ram_Data_Class>()
            for (i in data){
                if (i.ramModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.ramPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun ramProducts() {
        var ramModels = Ram_Data_Class(
            "Corsair Vengeance LPX DDR4 16GB (2 x 8GB)", 2660.00, R.drawable.ram_img1, Ram_no1_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "G.Skill Ripjaws V DDR4 16GB (2 x 8GB)", 2799.00, R.drawable.ram_img2, Ram_no2_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Crucial Ballistix Sport LT DDR4 16GB (2 x 8GB)", 3290.00, R.drawable.ram_img3, Ram_no3_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Kingston HyperX Fury RGB DDR4 16GB (2 x 8GB)", 2935.00, R.drawable.ram_img4, Ram_no4_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("ADATA XPG Spectrix D80 DDR4 16GB (2 x 8GB)", 4950.00, R.drawable.ram_img5, Ram_no5_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Team Group T-Force Vulcan Z DDR4 16GB (2 x 8GB)", 2899.00, R.drawable.ram_img6, Ram_no6_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Patriot Viper Steel DDR4 16GB (2 x 8GB)", 3000.00, R.drawable.ram_img7, Ram_no7_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Corsair Dominator Platinum DDR4 RGB 16GB (2 x 8GB)", 4450.00, R.drawable.ram_img8, Ram_no8_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "G.Skill Trident Z RGB DDR4 16GB (2 x 8GB)", 2799.00, R.drawable.ram_img9, Ram_no9_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "HyperX Predator RGB DDR4 16GB (2 x 8GB)", 3199.00, R.drawable.ram_img10, Ram_no10_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Crucial Ballistix Elite DDR4 16GB (2 x 8GB)", 4390.00, R.drawable.ram_img11, Ram_no11_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Corsair Vengeance RGB Pro DDR4 16GB (2 x 8GB)", 3539.00, R.drawable.ram_img12, Ram_no12_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Team Group T-Force Night Hawk RGB DDR4 16GB (2 x 8GB)", 3995.00, R.drawable.ram_img13, Ram_no13_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Patriot Viper 4 Blackout DDR4 16GB (2 x 8GB)", 2740.86, R.drawable.ram_img14, Ram_no14_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "ADATA XPG Spectrix D41 DDR4 16GB (2 x 8GB)", 2234.23, R.drawable.ram_img15, Ram_no15_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("GeIL Evo X II DDR4 16GB (2 x 8GB)", 2489.00, R.drawable.ram_img16, Ram_no16_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("G.Skill Trident Z Neo DDR4 16GB (2 x 8GB)", 3695.00, R.drawable.ram_img17, Ram_no17_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Crucial Ballistix Tactical Tracer RGB DDR4 16GB (2 x 8GB)", 2895.00, R.drawable.ram_img18, Ram_no18_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Kingston HyperX Predator Black DDR4 16GB (2 x 8GB)", 3299.00, R.drawable.ram_img19, Ram_no19_info::class.java)
        data.add(ramModels)

        ramModels = Ram_Data_Class("G.Skill's Premium Trident Z Royal DDR4 16GB (2 x 8GB)", 4995.00, R.drawable.ram_img20, Ram_no20_info::class.java)
        data.add(ramModels)

        cartAdapter!!.notifyDataSetChanged()
    }
}
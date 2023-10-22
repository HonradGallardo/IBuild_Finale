package com.example.finalproject.Categories.Hdd_Category

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
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no3_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no4_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no5_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no7_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no8_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Hdd_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Hdd_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Hdd_Data_Class>()

    private lateinit var searchView : SearchView
    private lateinit var caseCart : ImageView
    private lateinit var sortUp: ImageView
    private lateinit var sortDown : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hdd_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Hdd_main_container) as RecyclerView


        cartAdapter = Hdd_Adapter(this@Hdd_products_holder, data)
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

        hddProducts()
        data.shuffle()

        backbt = findViewById(R.id.Hdd_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
        caseCart = findViewById(R.id.hdd_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Hdd_product_holder")
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
        data.sortByDescending { it.hddPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    private fun sortDataAscending() {
        data.sortBy { it.hddPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    @SuppressLint("MissingSuperCall")
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
            val filteredList = ArrayList<Hdd_Data_Class>()
            for (i in data){
                if (i.hddModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.hddPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun hddProducts() {
        var hddModels = Hdd_Data_Class("Seagate FireCuda HDD 2TB",6190.00, R.drawable.hdd_img1, Hdd_no1_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Black HDD 1TB",1699.00, R.drawable.hdd_img2, Hdd_no2_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Blue WD10EZRZ HDD 1TB",1594.00, R.drawable.hdd_img3, Hdd_no3_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Red Pro WD4003FFBX HDD 4TB",2450.00, R.drawable.hdd_img4, Hdd_no4_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate SkyHawk HDD 1TB",5195.00, R.drawable.hdd_img5, Hdd_no5_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate BarraCuda HDD 1TB",1400.00, R.drawable.hdd_img6, Hdd_no6_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Toshiba P300 HDD 1TB",2990.00, R.drawable.hdd_img7, Hdd_no7_info::class.java)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate Exos 2TB",3379.00, R.drawable.hdd_img8, Hdd_no8_info::class.java)
        data.add(hddModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

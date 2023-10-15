package com.example.finalproject

import com.example.finalproject.Adapters.HomepageCategoriesAdapter
import com.example.finalproject.Adapters.RecyclerViewApater
import com.example.finalproject.DataClass.HomepageCategoriesDataClass
import com.example.finalproject.DataClass.Product
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.AmdBuild.amd_build
import com.example.finalproject.AmdBuild.amd_build_Data_Class
import com.example.finalproject.IntelBuild.IntelBuild
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no18_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no11_info
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Locale

class rvHompagee : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerViewAdapter : RecyclerViewApater
    private var productList = mutableListOf<Product>()
    private lateinit var amdBuilder : ImageView
    private lateinit var  intelbuild : ImageView

    private lateinit var homepagecategoriesRecyclerView : RecyclerView
    private var categories_dataClass = mutableListOf<HomepageCategoriesDataClass>()
    private lateinit var HomepageCategoriesAdapter : HomepageCategoriesAdapter

    private lateinit var bottomNaviation : BottomNavigationView
    private lateinit var searchView : SearchView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_hompagee)

        searchView = findViewById(R.id.sv_search_homepage)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        categories_dataClass = ArrayList()

        homepagecategoriesRecyclerView = findViewById(R.id.recyclerView_Categories) as RecyclerView
        HomepageCategoriesAdapter = HomepageCategoriesAdapter(this@rvHompagee, categories_dataClass)
        val LayoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        homepagecategoriesRecyclerView!!.layoutManager = LayoutManager
        homepagecategoriesRecyclerView!!.adapter = HomepageCategoriesAdapter


        HomepageCategoriesImages()

        amdBuilder = findViewById(R.id.img_amd_builder)

        intelbuild = findViewById(R.id.img_intel_builder)

        bottomNaviation = findViewById(R.id.btnav_bottomNavigation)

        productList = ArrayList()

        recyclerView = findViewById(R.id.mainContainer) as RecyclerView

        recyclerViewAdapter = RecyclerViewApater(this@rvHompagee, productList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2,)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewAdapter

        prepareProductList()



        bottomNaviation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {val intent = Intent(this, rvHompagee::class.java)
                    startActivity(intent)
                    finish()}

//                R.id.marketplace ->{val intent = Intent(this, Marketplace::class.java)
//                startActivity(intent)
//                finish()}


            }
            true
        }


        amdBuilder.setOnClickListener {
            val int = Intent(this, amd_build::class.java)
            startActivity(int)
        }
        intelbuild.setOnClickListener {
            val int = Intent(this, IntelBuild::class.java)
            startActivity(int)
        }
    }

    private fun filterList(query : String?){
        if (query != null){
            val filteredList = ArrayList<Product>()
            for (i in productList){
                if (i.title.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))) {
                    filteredList.add(i)
                }else if (i.price.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }
            }
            recyclerViewAdapter?.setFilteredListrvHomepage(filteredList)
        }

    }


    private fun prepareProductList(){

        var shopProducts = Product("AMD RYZEN 5 5600",  R.drawable.cpu_img1, 8150.00, Cpu_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("ASUS ROG Strix B450-F Gaming",  R.drawable.mobo_img1, 7850.00, Mobo_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("Gigabye Gaming DC 6G NVIDIA GEFORE GTX 1660 SUPER",  R.drawable.gpu_img1, 5450.00, Gpu_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("Corsair Vengeance LPX",  R.drawable.ram_img1, 4160.00, Ram_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("EVGA SuperNOVA 650 G5",  R.drawable.psu_img1, 6240.83, Psu_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("Seagate BarraCuda HDD",  R.drawable.hdd_img6, 1400.00, Hdd_no6_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("Samsung 970 EVO Plus",  R.drawable.ssd_img11, 8550.00, Ssd_no11_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("MSI Optix MAG241C",  R.drawable.monitor_img18, 11912.73, Monitor_no18_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", R.drawable.galaxrtx3060ti, 15000.00, Mobo_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, 15000.00, Mobo_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, 15000.00, Mobo_no1_info::class.java)
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, 15000.00, Mobo_no1_info::class.java)
        productList.add(shopProducts)

    }


    private fun HomepageCategoriesImages(){
        var images = HomepageCategoriesDataClass(R.drawable.cpuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.moboicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.gpuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.ramicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.psuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.ssdicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.hddicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.monitoricon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.chasisicon)
        categories_dataClass.add(images)


    }
}
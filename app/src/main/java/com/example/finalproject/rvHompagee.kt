package com.example.finalproject

import com.example.finalproject.Adapters.HomepageCategoriesAdapter
import com.example.finalproject.Adapters.RecyclerViewApater
import DataClass.HomepageCategoriesDataClass
import DataClass.Product
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class rvHompagee : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerViewAdapter : RecyclerViewApater
    private var productList = mutableListOf<Product>()
    private lateinit var amdBuilder : ImageView

    private lateinit var homepagecategoriesRecyclerView : RecyclerView
    private var categories_dataClass = mutableListOf<HomepageCategoriesDataClass>()
    private lateinit var HomepageCategoriesAdapter : HomepageCategoriesAdapter

    private lateinit var bottomNaviation : BottomNavigationView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_hompagee)


        categories_dataClass = ArrayList()

        homepagecategoriesRecyclerView = findViewById(R.id.recyclerView_Categories) as RecyclerView
        HomepageCategoriesAdapter = HomepageCategoriesAdapter(this@rvHompagee, categories_dataClass)
        val LayoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        homepagecategoriesRecyclerView!!.layoutManager = LayoutManager
        homepagecategoriesRecyclerView!!.adapter = HomepageCategoriesAdapter


        HomepageCategoriesImages()

        amdBuilder = findViewById(R.id.img_amd_builder)

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
            val int = Intent(this, AmdBuilderRecyclerView::class.java)
            startActivity(int)
        }
    }


    private fun prepareProductList(){
        var shopProducts = Product("AMD RYZEN 5 5600",  R.drawable.cpu_img1, "₱8,150.00")
        productList.add(shopProducts)

        shopProducts = Product("ASUS ROG Strix B450-F Gaming",  R.drawable.mobo_img1, "₱7,850.00")
        productList.add(shopProducts)

        shopProducts = Product("B450m Steel Legend AM4 Socket",  R.drawable.gpu_img1, "₱5,450.00")
        productList.add(shopProducts)

        shopProducts = Product("Corsair Vengeance LPX",  R.drawable.ram_img1, "₱4,160.00")
        productList.add(shopProducts)

        shopProducts = Product("EVGA SuperNOVA 650 G5",  R.drawable.psu_img1, "₱6,240.83")
        productList.add(shopProducts)

        shopProducts = Product("Seagate BarraCuda HDD",  R.drawable.hdd_img6, "₱1,400")
        productList.add(shopProducts)

        shopProducts = Product("Samsung 970 EVO Plus",  R.drawable.ssd_img11, "₱8,550.00")
        productList.add(shopProducts)

        shopProducts = Product("MSI Optix MAG241C",  R.drawable.monitor_img18, "₱11,912.73")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC",  R.drawable.galaxrtx3060ti, "₱15,000.00")
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
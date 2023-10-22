package com.example.finalproject.AmdBuild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no4_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no8_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no3_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no11_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no12_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no3_info
import com.example.finalproject.Products.Ram_products_info.Ram_no4_info
import com.example.finalproject.Products.Ram_products_info.Ram_no8_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no3_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class amd_build : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var amd_build_Adapter: amd_build_Adapter? = null
    private var Data_Class = mutableListOf<amd_build_Data_Class>()

    private lateinit var backButton : ImageView
    private lateinit var searchView : androidx.appcompat.widget.SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amd_build)

        backButton = findViewById(R.id.img_backArrow_amd_build)
        backButton.setOnClickListener {
            val int = Intent (this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

        searchView = findViewById(R.id.amd_build_serachView)
        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })



        Data_Class = ArrayList()

        recyclerView = findViewById<View>(R.id.rv_amd_build) as RecyclerView

        amd_build_Adapter = amd_build_Adapter(this@amd_build, Data_Class)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = amd_build_Adapter

        AmdCompatibleProducts()
    }

    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivityWithAnimation(intent)
        finish()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }

    private fun filterList(query : String?){
        if (query != null){
            val filteredList = ArrayList<amd_build_Data_Class>()
            for (i in Data_Class){
                if (i.title.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.price.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)))
                    filteredList.add(i)
            }
            amd_build_Adapter?.setFilteredList(filteredList)
        }

    }

    private fun AmdCompatibleProducts(){
        var products = amd_build_Data_Class("AMD RYZEN 5 5600", 8150.00, R.drawable.cpu_img1, Cpu_no1_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("ASRock B450M STEEL LEGEND",5650.00, R.drawable.mobo_img3, Mobo_no3_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("GIGABYTE GTX 1660 SUPER GAMING OC",15500.00, R.drawable.gpu_img1, Gpu_no1_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Kingston HyperX Fury 2x8", 3450.00, R.drawable.ram_img4, Ram_no4_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Seasonic Focus GX-650",5106.03, R.drawable.psu_img3, Psu_no3_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("WD Black HDD 1TB",1699.00, R.drawable.hdd_img2, Hdd_no2_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("WD Blue 3D NAND 1TB SSD", 5690.00, R.drawable.ssd_img3, Ssd_no3_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("ASUS VS239H-P",7374.90, R.drawable.monitor_img12, Monitor_no12_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("AMD RYZEN 5 3400G", 4350.00, R.drawable.cpu_img4, Cpu_no4_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("MSI B450M Mortar MAX",5565.00, R.drawable.mobo_img2, Mobo_no2_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("MSI RX 580 GAMING X 8 GB",12130.00, R.drawable.gpu_img8, Gpu_no8_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Corsair Dominator Platinum RGB", 6716.00, R.drawable.ram_img8, Ram_no8_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("EVGA SuperNOVA 650 G5",6240.83, R.drawable.psu_img1, Psu_no1_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Seagate FireCuda HDD",6190.00, R.drawable.hdd_img1, Hdd_no1_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Samsung 970 EVO Plus", 8550.00, R.drawable.ssd_img11, Ssd_no1_info::class.java)
        Data_Class.add(products)

        products = amd_build_Data_Class("Samsung SF350",6055.00, R.drawable.monitor_img11, Monitor_no11_info::class.java)
        Data_Class.add(products)



    }
}
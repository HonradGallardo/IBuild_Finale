package com.example.finalproject.IntelBuild

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Cpu_products_info.Cpu_no18_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no2_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no3_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no7_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no12_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no19_info
import com.example.finalproject.Products.Psu_products_info.Psu_no3_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no4_info
import com.example.finalproject.Products.Ram_products_info.Ram_no8_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no11_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no3_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale


class IntelBuild : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var IntelBuildAdapter: IntelBuildAdapter
    private var DataClass = mutableListOf<IntelBuildDataClass>()

    private lateinit var back_arrow : ImageView
    private lateinit var searchView : androidx.appcompat.widget.SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intel_builder)

        recyclerView = findViewById<View>(R.id.rv_intel_builder) as RecyclerView

        DataClass = ArrayList()

        back_arrow = findViewById(R.id.img_backArrow_intel_builder)
        back_arrow.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

        searchView = findViewById(R.id.intel_build_serachView)
        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })


        IntelBuildAdapter = IntelBuildAdapter(this@IntelBuild,DataClass)
        val layoutManager :RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = IntelBuildAdapter

        intelbuildercompatible()

    }
    private fun filterList(query : String?){
        if (query != null){
            val filteredList = ArrayList<IntelBuildDataClass>()
            for (i in DataClass){
                if (i.title.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)))
                    filteredList.add(i)
            }
            IntelBuildAdapter?.setFilteredList(filteredList)
        }

    }

    private fun intelbuildercompatible(){
        var intel_builder = IntelBuildDataClass("Intel Core i5-10400", R.drawable.cpu_img2,8950.00, Cpu_no2_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("MSI MAG B460M Mortar", R.drawable.mobo_img7,6499.00, Mobo_no7_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("GIGABYTE GTX 1660 SUPER GAMING OC", R.drawable.gpu_img1,15500.00, Gpu_no1_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Corsair Vengeance LPX",R.drawable.ram_img1,4160.00, Ram_no1_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Seasonic Focus GX-650",R.drawable.psu_img3,5106.03, Psu_no3_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("WD Black HDD 1TB",R.drawable.hdd_img2,1699.00, Hdd_no2_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("WD Blue 3D NAND 1TB SSD",R.drawable.ssd_img3,5690.00, Ssd_no3_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("ASUS VS239H-P",R.drawable.monitor_img12,7374.90,Monitor_no12_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Intel Core i5-10500",R.drawable.cpu_img18,12299.00,Cpu_no18_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("ASUS Prime B460M-A", R.drawable.mobo_img6,5875.00,Mobo_no6_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("GIGABYTE RTX 3060 GAMING OC",R.drawable.gpu_img3,22950.00,Gpu_no3_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Corsair Dominator Platinum RGB",R.drawable.ram_img8,6716.00, Ram_no8_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Seasonic Focus GX-650",R.drawable.psu_img3,5106.03,Psu_no3_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Seagate FireCuda HDD",R.drawable.hdd_img1,6190.00,Hdd_no1_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Samsung 970 EVO Plus", R.drawable.ssd_img11,8550.00,Ssd_no11_info::class.java)
        DataClass.add(intel_builder)

        intel_builder = IntelBuildDataClass("Samsung SF350", R.drawable.monitor_img19,8508.93,Monitor_no19_info::class.java)
        DataClass.add(intel_builder)

    }
}
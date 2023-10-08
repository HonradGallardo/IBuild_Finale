package com.example.finalproject.Categories.Hdd_Category

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Collections

class Hdd_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Hdd_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Hdd_Data_Class>()


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

        hddProducts()

        backbt = findViewById(R.id.Hdd_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun hddProducts() {
        var hddModels = Hdd_Data_Class("Seagate FireCuda HDD","₱90,655.31", R.drawable.hdd_img1_seagate_firecuda)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Black HDD","₱39,950.00", R.drawable.hdd_img2_wd_black)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Blue HDD","₱39,950.00", R.drawable.hdd_img3_wd_blue)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate IronWolf Pro HDD","₱39,950.00", R.drawable.hdd_img4_seagate_ironwolf_pro)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Red Pro HDD","₱39,950.00", R.drawable.hdd_img5_wd_red_pro)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate Exos X20 HDD","₱39,950.00", R.drawable.hdd_img6_seagate_exos_x20)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate SkyHawk AI HDD","₱39,950.00", R.drawable.hdd_img7_seagate_skyhawk_ai)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate BarraCuda HDD","₱39,950.00", R.drawable.hdd_img8_seagate_barracuda)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Toshiba","₱39,950.00", R.drawable.hdd_img9_toshiba)
        data.add(hddModels)


        hddModels = Hdd_Data_Class("Seagate Exos X14 ST10000NM0528","₱39,950.00", R.drawable.hdd_img_10_seagate_exos_x14_st10000nm0528)
        data.add(hddModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

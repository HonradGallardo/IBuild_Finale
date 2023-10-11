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
        var hddModels = Hdd_Data_Class("Seagate FireCuda HDD","₱6,190.00", R.drawable.hdd_img1)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Black HDD","₱1,699.00 - ₱6,950.02", R.drawable.hdd_img2)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("WD Blue WD10EZRZ HDD","1,594.00 - ₱3,090.00", R.drawable.hdd_img3)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("1 TB WD Red Pro WD4003FFBX HDD","₱2,450.00", R.drawable.hdd_img4)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("1 TB Seagate SkyHawk HDD","₱5,195.00", R.drawable.hdd_img5)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate BarraCuda HDD","₱1,400 - ₱3,195", R.drawable.hdd_img6)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Toshiba P300 HDD","₱2,990.00 - 6,900.00", R.drawable.hdd_img7)
        data.add(hddModels)

        hddModels = Hdd_Data_Class("Seagate Exos 1TB 7E2000","₱3,379.00", R.drawable.hdd_img8)
        data.add(hddModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

package com.example.finalproject.Categories.Monitor_Category

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

class Monitor_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Monitor_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Monitor_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitor_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.monitor_main_container) as RecyclerView


        cartAdapter = Monitor_Adapter(this@Monitor_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        monitorProducts()

        backbt = findViewById(R.id.Monitor_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun monitorProducts() {
        var monitorModels = Monitor_Data_Class("AOC CQ32G1","₱24,337.17", R.drawable.monitor_img1)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ViewSonic VX3276-MHD","₱11,969.46", R.drawable.monitor_img2)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 24MP88HV-S","₱10,670.35", R.drawable.monitor_img3)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VZ239H-W","₱7,318.17", R.drawable.monitor_img4)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Dell S2418H","₱13,615.20", R.drawable.monitor_img5)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer R240HY","₱3,970.53", R.drawable.monitor_img6)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Sceptre E275W-19203R","₱17,018.43", R.drawable.monitor_img7)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("HP 24mh","₱7,091.25", R.drawable.monitor_img8)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("BenQ GW2480","₱11,345.43", R.drawable.monitor_img9)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Philips 246E9QDSB","₱5,673.00", R.drawable.monitor_img10)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Samsung SF350","₱6,055.00", R.drawable.monitor_img11)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VS239H-P","₱7,374.90", R.drawable.monitor_img12)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Dell SE2416HX","₱6,807.60", R.drawable.monitor_img13)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("HP Pavilion 22cwa","₱4,537.83", R.drawable.monitor_img14)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("BenQ GW2270","₱4,875.94", R.drawable.monitor_img15)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Sceptre E248W-19203R","₱5,104.00", R.drawable.monitor_img16)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 24MK400H-B","₱6,523.95", R.drawable.monitor_img17)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("MSI Optix MAG241C","₱11,912.73", R.drawable.monitor_img18)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Samsung SF350","₱8,508.93", R.drawable.monitor_img19)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer SB220Q","₱5,105.70", R.drawable.monitor_img20)
        data.add(monitorModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

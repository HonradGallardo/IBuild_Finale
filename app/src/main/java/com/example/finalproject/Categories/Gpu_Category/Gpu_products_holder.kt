package com.example.finalproject.Categories.Gpu_Category

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

class Gpu_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Gpu_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Gpu_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gpu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Gpu_main_container) as RecyclerView


        cartAdapter = Gpu_Adapter(this@Gpu_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        gpuProducts()

        backbt = findViewById(R.id.Gpu_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
    }
}

    private fun gpuProducts() {
        var gpuModels = Gpu_Data_Class("GIGABYTE GTX 1660 SUPER GAMING OC","₱15,500.00", R.drawable.gpu_img1)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 5600 XT MECH OC","₱23,750.00", R.drawable.gpu_img2)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3060 GAMING OC","₱22,950.00", R.drawable.gpu_img3)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 5700 XT MECH OC","₱24,461.00", R.drawable.gpu_img4)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3070 GAMING OC","₱29,500.00", R.drawable.gpu_img5)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS DUAL RX 6600 XT OC","₱19,306.00", R.drawable.gpu_img6)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("PNY GTX 1050","₱12,945.00", R.drawable.gpu_img7)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 580 GAMING X 8 GB","₱12,130.00", R.drawable.gpu_img8)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3080","₱29,500.00", R.drawable.gpu_img9)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RX 6700 XT GAMING OC","₱23,234.00", R.drawable.gpu_img10)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS TUF GTX 1660 Ti GAMING OC","₱16,999.00", R.drawable.gpu_img11)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASRock RX 5500 XT 8 GB BIOS","₱10,960.00", R.drawable.gpu_img12)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS ROG STRIX RTX 3050 GAMING OC","₱15,000.00", R.drawable.gpu_img13)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RX 590 GAMING Rev. 1.0","₱15,500.00", R.drawable.gpu_img14)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI GTX 1650 GAMING X","₱12,320.00", R.drawable.gpu_img15)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS RX 6800","₱33,681.00", R.drawable.gpu_img16)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE GTX 1660 OC","₱11,500.00", R.drawable.gpu_img17)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASRock Phantom Gaming X Vega 56","₱25,199.50", R.drawable.gpu_img18)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3060 Ti EAGLE OC","₱28,990.00", R.drawable.gpu_img19)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE AORUS RX 6700 XT ELITE","₱29,950.00", R.drawable.gpu_img20)
        data.add(gpuModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

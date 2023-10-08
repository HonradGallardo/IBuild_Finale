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
import java.util.Collections

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
        var gpuModels = Gpu_Data_Class("NVIDIA GeForce GTX 1660 Super","₱90,655.31", R.drawable.gpu_img1_nvidia_geforce_gtx_1660_super)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 5600 XT","₱39,950.00", R.drawable.gpu_img2_amd_radeon_rx_5600_xt)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3060","₱39,950.00", R.drawable.gpu_img3_nvidia_geforce_rtx_3060)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 5700 XT","₱39,950.00", R.drawable.gpu_img4_amd_radeon_rx_5700_xt)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3070","₱39,950.00", R.drawable.gpu_img5_nvidia_geforce_gtx_3070)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 6600 XT","₱39,950.00", R.drawable.gpu_img6_amd_radeon_rx_6600_xt)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce GTX 1050 Ti","₱39,950.00", R.drawable.gpu_img7_nvidia_geforce_gtx_1050_ti)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 580","₱39,950.00", R.drawable.gpu_img8_amd_radeon_rx_580)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3080","₱39,950.00", R.drawable.gpu_img9_nvidia_geforce_rtx_3080)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 6700 XT","₱39,950.00", R.drawable.gpu_img10_amd_radeon_rx_6700_xt)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce GTX 1660 Ti","₱39,950.00", R.drawable.gpu_img11_nvidia_geforce_gtx_1660_ti)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 5500 XT","₱39,950.00", R.drawable.gpu_img12_amd_radeon_rx_5500_xt)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3050","₱39,950.00", R.drawable.gpu_img13_nvidia_geforce_rtx_3050)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 590","₱39,950.00", R.drawable.gpu_img14_amd_radeon_rx_590)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce GTX 1650 Super","₱39,950.00", R.drawable.gpu_img15_nvidia_geforce_gtx_1650_super)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 6800","₱39,950.00", R.drawable.gpu_img16_amd_radeon_rx_6800)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce GTX 1660","₱39,950.00", R.drawable.gpu_img17_nvidia_geforce_gtx_1660)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX Vega 56","₱39,950.00", R.drawable.gpu_img18_amd_radeon_rx_vega_56)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3060 Ti","₱39,950.00", R.drawable.gpu_img19_nvidia_geforce_rtx_3060_ti)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("AMD Radeon RX 6700","₱39,950.00", R.drawable.gpu_img20_amd_radeon_rx_6700)
        data.add(gpuModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

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
        var gpuModels = Gpu_Data_Class("Gigabyte Gaming DC 6G NVIDIA GeForce GTX 1660 Super","₱15,500.00", R.drawable.gpu_img1)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI AMD Radeon MECH RX 5600 XT","₱23,750.00", R.drawable.gpu_img2)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte Gaming OC 12 G NVIDIA GeForce RTX 3060","₱22,950.00", R.drawable.gpu_img3)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI AMD Radeon MECH RX 5700 XT","₱24,461.00", R.drawable.gpu_img4)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte Gaming OC 8G NVIDIA GeForce RTX 3070","₱29,500.00", R.drawable.gpu_img5)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS AMD DUAL Radeon RX 6600 XT","₱19,306.00", R.drawable.gpu_img6)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("PYN NVIDIA GeForce GTX 1050 Ti","₱12,945.00", R.drawable.gpu_img7)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI twin frozr Gaming 8G AMD Radeon RX 580","₱12,130.00", R.drawable.gpu_img8)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3080","₱29,500.00", R.drawable.gpu_img9)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte 12GB AMD Radeon RX 6700 XT","₱23,234.00", R.drawable.gpu_img10)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Asus Tuf NVIDIA GeForce GTX 1660 Ti","₱16,999.00", R.drawable.gpu_img11)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASROCK OC Edition 8GB AMD Radeon RX 5500 XT","₱10,960.00", R.drawable.gpu_img12)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Asus ROG STRIX OC 8GB NVIDIA GeForce RTX 3050","₱15,000.00", R.drawable.gpu_img13)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte Gaming 8G Radeon RX 590","₱15,500.00", R.drawable.gpu_img14)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI GAMING TWIN FROZR7 NVIDIA GeForce GTX 1650 Super","₱12,320.00", R.drawable.gpu_img15)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS 16GB GPU Tweak Radeon RX 6800","₱33,681.00", R.drawable.gpu_img16)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte OC 6G NVIDIA GeForce GTX 1660","₱11,500.00", R.drawable.gpu_img17)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASROCK Phantom Gaming Radeon RX Vega 56","₱25,199.50", R.drawable.gpu_img18)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("Gigabyte Eagle OC 12G NVIDIA GeForce RTX 3060 Ti","₱28,990.00", R.drawable.gpu_img19)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("UAORUS ELITE Radeon RX 6700","₱29,950.00", R.drawable.gpu_img20)
        data.add(gpuModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

package com.example.finalproject.Categories.Cpu_Category

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Cpu_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Cpu_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Cpu_Data_Class>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Cpu_main_container) as RecyclerView

        cartAdapter = Cpu_Adapter(this@Cpu_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        cpuProducts()

        backbt = findViewById(R.id.Cpu_Back_to_Home)
        backbt.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()


        }
    }

    private fun cpuProducts() {
        var cpuModels = Cpu_Data_Class("AMD RYZEN 5 5600", "₱8,150.00", R.drawable.cpu_img1)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i5-10400", "₱8,950.00", R.drawable.cpu_img2)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i3-10100", "₱8,499.00", R.drawable.cpu_img3)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD RYZEN 5 3400G", "₱4,350.00", R.drawable.cpu_img4)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD RYZEN 5 5600G", "₱8,699.00", R.drawable.cpu_img5)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Pentium Gold G6400", "₱4,199.00", R.drawable.cpu_img6)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-11400", "₱7,995.00", R.drawable.cpu_img7)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD RYZEN 5 3600", "₱4,151.00", R.drawable.cpu_img8)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD RYZEN 3 3200G", "₱4,999.99", R.drawable.cpu_img9)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i3-10320", "₱10,795.00", R.drawable.cpu_img10)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-9400F", "₱6,088.00", R.drawable.cpu_img11)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 3 3100", "₱7,499.00", R.drawable.cpu_img12)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD Ryzen 7 2700", "₱12,169.00",R.drawable.cpu_img13)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i3-9100F", "₱8,358.00", R.drawable.cpu_img14)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-9400", "₱9,399.00", R.drawable.cpu_img15)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 5 2600", "₱8,199.00", R.drawable.cpu_img16)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD Ryzen 5 5600x", "₱8,799.00", R.drawable.cpu_img17)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i5-10500", "₱12,299.00", R.drawable.cpu_img18)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i3-8100", "₱9,699.03", R.drawable.cpu_img19)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 3 3300X", "₱6,988.00", R.drawable.cpu_img20)
        data.add(cpuModels)



        cartAdapter!!.notifyDataSetChanged()
    }
}

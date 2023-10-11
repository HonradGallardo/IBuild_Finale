package com.example.finalproject.Categories.Ssd_Category

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

class Ssd_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Ssd_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Ssd_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssd_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.ssd_main_container) as RecyclerView

        cartAdapter = Ssd_Adapter(this@Ssd_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        ssdProducts()

        backbt = findViewById(R.id.Ssd_Back_to_Home)
        backbt.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun ssdProducts() {
        var ssdModels =
            Ssd_Data_Class("Samsung 860 EVO", "₱4,160.00", R.drawable.ssd_img1)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Crucial MX500", "₱2,799.00", R.drawable.ssd_img2)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("WD Blue 3D NAND", "₱5,690.00", R.drawable.ssd_img3)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Sandisk Ultra 3D SSD", "₱1,650.00 - ₱3,450.00", R.drawable.ssd_img4)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Kingston A2000", "₱3,795.00 - ₱4,950.00", R.drawable.ssd_img5)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("ADATA SU800", "₱4,999.00 - ₱9,999.00", R.drawable.ssd_img6)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("SK hynix Gold S31", "₱3,000.00", R.drawable.ssd_img7)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Seagate Barracuda SSD", "₱6,716.00", R.drawable.ssd_img8)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Toshiba TR200", "₱1,352.00 - ₱2,799.00", R.drawable.ssd_img9)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Teamgroup GX2", "₱3,049 - ₱3,199", R.drawable.ssd_img10)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Samsung 970 EVO Plus", "₱8,550.00 - ", R.drawable.ssd_img11)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("WD Black SN750 NVMe SSD", "₱5655.00 - ₱23,599.00", R.drawable.ssd_img12)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Crucial P1 NVMe SSD", "₱5951.11 - ₱11,902.23", R.drawable.ssd_img13)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Intel 660p NVMe SSD", "₱10,740.86- ₱21,481.72", R.drawable.ssd_img14)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Adata XPG SX8200 Pro NVMe SSD", "₱6,234.23", R.drawable.ssd_img15)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class(
            "Corsair Force MP510 NVMe SSD",
            "₱3,695 - ₱16,318.34",
            R.drawable.ssd_img16
        )
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Kingston A2000 NVMe SSD", "₱3,695 - ₱16,318.34", R.drawable.ssd_img17)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Sabrent Rocket NVMe SSD", "₱3,695 - ₱16,318.34", R.drawable.ssd_img18)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("HP EX920 NVMe SSD", "₱3,695 - ₱16,318.34", R.drawable.ssd_img19)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Toshiba XG5-P NVMe SSD", "₱3,695 - ₱16,318.34", R.drawable.ssd_img20)
        data.add(ssdModels)

        cartAdapter!!.notifyDataSetChanged()
    }
}
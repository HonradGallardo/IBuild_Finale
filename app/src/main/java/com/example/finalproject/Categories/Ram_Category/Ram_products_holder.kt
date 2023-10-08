package com.example.finalproject.Categories.Ram_Category

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
import kotlin.random.Random

class Ram_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Ram_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Ram_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ram_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.ram_main_container) as RecyclerView

        cartAdapter = Ram_Adapter(this@Ram_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        ramProducts()

        backbt = findViewById(R.id.Ram_Back_to_Home)
        backbt.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun ramProducts() {
        var ramModels = Ram_Data_Class(
            "Corsair Vengeance LPX", "₱4,160.00", R.drawable.ram_img1)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "G.Skill Ripjaws V", "₱2,799.00", R.drawable.ram_img2)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Crucial Ballistix Sport LT", "₱5,690.00", R.drawable.ram_img3)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Kingston HyperX Fury", "₱1,650.00 - ₱3,450.00", R.drawable.ram_img4)
        data.add(ramModels)

        ramModels = Ram_Data_Class("ADATA XPG Spectrix D80", "₱3,795.00 - ₱4,950.00", R.drawable.ram_img5)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Team Group T-Force Vulcan Z", "₱4,999.00 - ₱9,999.00", R.drawable.ram_img6)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Patriot Viper Steel", "₱3,000.00", R.drawable.ram_img7)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Corsair Dominator Platinum RGB", "₱6,716.00", R.drawable.ram_img8)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "G.Skill Trident Z RGB", "₱1,352.00 - ₱2,799.00", R.drawable.ram_img9)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "HyperX Predator RGB", "₱3,049 - ₱3,199", R.drawable.ram_img10)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Crucial Ballistix Elite", "₱8,550.00 - ", R.drawable.ram_img11)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Corsair Vengeance RGB Pro", "₱5655.00 - ₱23,599.00", R.drawable.ram_img12)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Team Group T-Force Night Hawk RGB", "₱5951.11 - ₱11,902.23", R.drawable.ram_img13)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "Patriot Viper 4 Blackout", "₱10,740.86- ₱21,481.72", R.drawable.ram_img14)
        data.add(ramModels)

        ramModels = Ram_Data_Class(
            "ADATA XPG Spectrix D41", "₱6,234.23", R.drawable.ram_img15)
        data.add(ramModels)

        ramModels = Ram_Data_Class("GeIL Evo X II", "₱3,695 - ₱16,318.34", R.drawable.ram_img16)
        data.add(ramModels)

        ramModels = Ram_Data_Class("G.Skill Trident Z Neo", "₱3,695 - ₱16,318.34", R.drawable.ram_img17)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Crucial Ballistix Tactical Tracer RGB", "₱3,695 - ₱16,318.34", R.drawable.ram_img18)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Kingston HyperX Predator Black", "₱3,695 - ₱16,318.34", R.drawable.ram_img19)
        data.add(ramModels)

        ramModels = Ram_Data_Class("Corsair Vengeance LPX Low Profile", "₱3,695 - ₱16,318.34", R.drawable.ram_img20)
        data.add(ramModels)

        cartAdapter!!.notifyDataSetChanged()
    }
}
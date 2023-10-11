package com.example.finalproject

import com.example.finalproject.Adapters.AmdMotherboardAdapter
import DataClass.AmdMotherboardDataClass
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MotherboardProducts : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var MotherboardAdapter : AmdMotherboardAdapter? = null
    private var MotherboardDataClass = mutableListOf<AmdMotherboardDataClass>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motherboard_products)


        MotherboardDataClass = ArrayList()

        recyclerView = findViewById<View>(R.id.rv_motherboardProducts) as RecyclerView
        MotherboardAdapter = AmdMotherboardAdapter(this@MotherboardProducts, MotherboardDataClass)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = MotherboardAdapter

        AmdMotherboardProducts()

    }

    private fun AmdMotherboardProducts(){
        var amdMobo = AmdMotherboardDataClass("Steel Legend", "B450 micro-ATX AM4 Socket", "4,999.00", R.drawable.b450msteellegend)
        MotherboardDataClass.add(amdMobo)


    }

}
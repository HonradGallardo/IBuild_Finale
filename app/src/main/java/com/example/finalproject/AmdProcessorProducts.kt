package com.example.finalproject

import Adapters.amdbuilderAdapter
import DataClass.AmdBuilderDataClass
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AmdProcessorProducts : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var amdbuilder_Adapter : amdbuilderAdapter? = null
    private var amd_processorList = mutableListOf<AmdBuilderDataClass>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amd_processor_products)

        amd_processorList = ArrayList()
        recyclerView = findViewById<View>(R.id.rv_processorProducts) as RecyclerView

        amdbuilder_Adapter = amdbuilderAdapter(this@AmdProcessorProducts, amd_processorList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = amdbuilder_Adapter

        amdProducts()

    }


    private fun amdProducts(){
        var amdProductModel = AmdBuilderDataClass("Ryzen 3 3200g", "Socket: AM4\nBase clock: 3.6 GHz\nBoost clock: 4 GHz\nL3 cache: 4 MB\nTDP: 65 W", "₱10,000.00", R.drawable.ryzen33200g)
        amd_processorList.add(amdProductModel)

        amdProductModel = AmdBuilderDataClass("Ryzen 5 3400g", "4 cores and 8 threads\n3.7 GHz base clock and 4.2 GHz boost clock\n11 GPU cores\n65 W TDP and 95°C max temperature", "₱10,000.00", R.drawable.ryzen53400g )
        amd_processorList.add(amdProductModel)

        amdProductModel = AmdBuilderDataClass("Ryzen 5 3600", "Has 1 PCIe 3.0 x16, 1 PCIe 2.0 x16, 1 PCIe 2.0 x1, and 4 SATA3 slots\nSupports AMD Quad CrossFireX™", "₱10,000.00", R.drawable.ryzen53600)
        amd_processorList.add(amdProductModel)

        amdProductModel = AmdBuilderDataClass("Ryzen 5 5600G", "Socket: AM4\nClockspeed: 3.9 GHz\nTurbo Speed: 4.4 GHz\nCores: 6\nThreads: 12\nTDP: 65 W", "₱10,000.00", R.drawable.ryzen55600g)
        amd_processorList.add(amdProductModel)

        amdProductModel = AmdBuilderDataClass("Ryzen 5 5600", "Socket: AM4\nClockspeed: 3.9 GHz\nTurbo Speed: 4.4 GHz\nCores: 6\nThreads: 12\nTDP: 65 W", "₱10,000.00", R.drawable.ryzen55600)
        amd_processorList.add(amdProductModel)

        //DESCRIPTION NEED PA AYUSIN



    }
}


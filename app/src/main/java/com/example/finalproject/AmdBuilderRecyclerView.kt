package com.example.finalproject

import com.example.finalproject.Adapters.AmdBuilderRecyclerViewAdapter
import com.example.finalproject.DataClass.AmdBuilderDataClass
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AmdBuilderRecyclerView : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var AmdBuilderRecyclerViewAdapter : AmdBuilderRecyclerViewAdapter? = null
    private var Data_Class = mutableListOf<AmdBuilderDataClass>()

    private lateinit var back_arrow : ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amd_builder_recycler_view)

        back_arrow = findViewById(R.id.img_backArrow_amd_builder)
        back_arrow.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

        Data_Class =ArrayList()
        recyclerView = findViewById<View>(R.id.rv_amd_builer) as RecyclerView

        AmdBuilderRecyclerViewAdapter = AmdBuilderRecyclerViewAdapter(this@AmdBuilderRecyclerView, Data_Class)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = AmdBuilderRecyclerViewAdapter


        builder_processor()
        builder_mobo()
        builder_gpu()

    }



    private fun builder_processor(){


        var amd_builder = AmdBuilderDataClass("AMD Processor", "", "", R.drawable.amdbuilderimage)


        val getr9Title = intent.getStringExtra("Ryzen 9 5900x")
        amd_builder.title = getr9Title.toString()

        val getr9Price = intent.getStringExtra("tv_r9_price")
        amd_builder.price = getr9Price.toString()

        val getr9Description = intent.getStringExtra("tv_r9_description")
        amd_builder.description = getr9Description.toString()

        val getImgExt = intent.getIntExtra("img_ryzen9", 0)
        if (getImgExt != 0) {
            amd_builder.image = getImgExt
        }
        amd_builder.title = getr9Title ?: "AMD Processor"
        amd_builder.price = getr9Price ?: ""
        amd_builder.description = getr9Description ?: ""
        Data_Class.add(amd_builder)

    }
    private fun builder_mobo(){
        //PAPALITAN PA ITO NG DATA NUNG MOTHERBOARD
        var amd_motherboard = AmdBuilderDataClass("Motherboard", "", "", R.drawable.amdbuilderimage)
        val getMoboName = intent.getStringExtra("moboName")
        amd_motherboard.title = getMoboName.toString()

        val  getMoboPrice = intent.getStringExtra("moboPrice")
        amd_motherboard.price = getMoboPrice.toString()

        val getMoboDescription = intent.getStringExtra("moboDescription")
        amd_motherboard.description = getMoboDescription.toString()

        val getMoboImage = intent.getIntExtra("moboImage", 0)
        if (getMoboImage != 0){
            amd_motherboard.image = getMoboImage
        }

        amd_motherboard.title = getMoboName?: "Motherboard"
        amd_motherboard.description = getMoboDescription?: ""
        amd_motherboard.price = getMoboPrice ?: ""
        setResult(RESULT_OK)


        Data_Class.add(amd_motherboard)
    }

    private fun builder_gpu(){
        var amd_gpu = AmdBuilderDataClass("Graphics Card", "", "", R.drawable.amdbuilderimage)
        Data_Class.add(amd_gpu)
    }
}
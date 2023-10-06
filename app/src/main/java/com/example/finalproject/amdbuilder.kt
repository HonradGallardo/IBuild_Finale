package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text


class amdbuilder : AppCompatActivity() {


    private lateinit var amdProcessor_addButton : ImageView
    private lateinit var imgBackarrow : ImageView
    private lateinit var tv_processorName : TextView
    private lateinit var processorImage : ImageView
    private lateinit var processor_description : TextView
    private lateinit var processor_price : TextView

    private lateinit var tv_motherboard : TextView
    private lateinit var motherboardImage : ImageView
    private lateinit var motherboard_description: TextView
    private lateinit var motherboard_price : TextView
    private lateinit var motherboard_AddButton : ImageView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amdbuilder)

        amdProcessor_addButton = findViewById(R.id.img_add_processor_amdbuilder)
        imgBackarrow = findViewById(R.id.img_backArrow)
        tv_processorName = findViewById(R.id.tv_amdProcessor_amdbuilder)
        processorImage = findViewById(R.id.processor_image)
        processor_description = findViewById(R.id.processor_description)
        processor_price = findViewById(R.id.processor_price)

        tv_motherboard = findViewById(R.id.tv_motherboard_amdbuilder)
        motherboardImage = findViewById(R.id.motherboard_image)
        motherboard_description = findViewById(R.id.motherboard_description)
        motherboard_price = findViewById(R.id.motherboard_price)
        motherboard_AddButton = findViewById(R.id.img_add_motherboard_amdbuilder)



        //amdProcessor_addButton_forMotherboard
        //hereeeee!!


        imgBackarrow.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

//        getProcessorInformation()
//        getMotherboardInformation()


    }

//    private fun getProcessorInformation(){
//
//        amdProcessor_addButton.setOnClickListener {
//            val int = Intent(this, AmdProcessorProducts::class.java)
//            startActivity(int)
//        }
//
//        val getr9Title = intent.getStringExtra("Ryzen 9 5900x")
//        tv_processorName.text = getr9Title
//
//        val getr9Price = intent.getStringExtra("tv_r9_price")
//        processor_price.text = getr9Price
//
//        val getr9Description = intent.getStringExtra("tv_r9_description")
//        processor_description.text = getr9Description
//
//        val getImgExt = intent.getIntExtra("img_ryzen9", 0)
//        if (getImgExt != 0) {
//            processorImage.setImageResource(getImgExt)
//        }
//
//        tv_processorName.text = getr9Title ?: "AMD Processor"
//        processor_price.text = getr9Price ?: ""
//        processor_description.text = getr9Description ?: ""
//
//    }

//    private fun getMotherboardInformation(){
//        motherboard_AddButton.setOnClickListener {
//            val int = Intent(this, MotherboardProducts::class.java)
//            startActivity(int)
//        }
//
//
//
//        val getMoboName = intent.getStringExtra("moboName")
//        tv_motherboard.text = getMoboName
//
//        val getMoboPrice = intent.getStringExtra("moboPrice")
//        motherboard_price.text = getMoboPrice
//
//        val getMoboDescription = intent.getStringExtra("moboDescription")
//        motherboard_description.text = getMoboDescription
//
//        val getMoboImage = intent.getIntExtra("moboImage", 0)
//        if (getMoboImage != 0){
//            motherboardImage.setImageResource(getMoboImage)
//        }
//
//        tv_motherboard.text = getMoboName?: "Motherboard"
//        motherboard_description.text = getMoboDescription?: ""
//        motherboard_price.text = getMoboPrice ?: ""
//    }
}
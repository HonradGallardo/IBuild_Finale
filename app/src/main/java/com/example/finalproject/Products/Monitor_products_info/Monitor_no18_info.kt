package com.example.finalproject.Products.Monitor_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Monitor_Category.Monitor_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Monitor_no18_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitor_no18_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.monitor_info18_img1,
            R.drawable.monitor_img18,
            R.drawable.monitor_info18_img2,
            R.drawable.monitor_info18_img3,
            R.drawable.monitor_info18_img5,
            R.drawable.monitor_info18_img4,


        )

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Monitor_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Monitor_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Monitor_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
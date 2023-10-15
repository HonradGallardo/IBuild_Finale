package com.example.finalproject.Products.Hdd_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Categories.Hdd_Category.Hdd_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Hdd_no5_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hdd_no5_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.hdd_img5,
            R.drawable.hdd_info5_img1,
            R.drawable.hdd_info5_img2,
            R.drawable.hdd_info5_img3)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Gpu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Hdd_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Hdd_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
package com.example.finalproject.Products.Gpu_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Gpu_no7_info : AppCompatActivity() {

    private lateinit var backbt : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gpu_no7_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.gpu_img7,
            R.drawable.gpu_info7_img1,
            R.drawable.gpu_info7_img2)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Gpu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Gpu_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Gpu_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
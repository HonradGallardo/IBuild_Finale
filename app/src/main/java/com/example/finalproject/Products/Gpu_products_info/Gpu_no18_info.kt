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

class Gpu_no18_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gpu_no18_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.gpu_img18,
            R.drawable.gpu_info18_img1,
            R.drawable.gpu_info18_img2,
            R.drawable.gpu_info18_img3)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Gpu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val int = Intent(this, Gpu_products_holder::class.java)
            startActivity(int)
            finish()
        }
    }
}
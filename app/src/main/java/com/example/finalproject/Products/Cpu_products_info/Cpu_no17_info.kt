package com.example.finalproject.Products.Cpu_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.R

class Cpu_no17_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpu_no17_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.cpu_img17,
            R.drawable.cpu_info17_img3,
            R.drawable.cpu_info17_img4,
            R.drawable.cpu_info17_img1,
            R.drawable.cpu_info17_img2,
            R.drawable.cpu_info17_img5,
            R.drawable.cpu_info17_img6,)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Cpu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val int = Intent(this, Cpu_products_holder::class.java)
            startActivity(int)
            finish()
        }
    }
}
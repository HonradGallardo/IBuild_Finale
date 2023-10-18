package com.example.finalproject.Products.Ssd_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Ssd_no20_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssd_no20_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.ssd_img20,
            R.drawable.ssd_info20_img1,
            R.drawable.ssd_info20_img2
        )

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Ssd_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Ssd_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Ssd_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
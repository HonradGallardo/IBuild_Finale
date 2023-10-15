package com.example.finalproject.Products.Psu_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Psu_Category.Psu_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Psu_no3_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.psu_no3_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.psu_img3,
            R.drawable.psu_info3_img1,
            R.drawable.psu_info3_img2,
            R.drawable.psu_info3_img3
        )

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Psu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Psu_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Psu_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
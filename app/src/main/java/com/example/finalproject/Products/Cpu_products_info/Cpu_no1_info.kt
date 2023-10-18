package com.example.finalproject.Products.Cpu_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Cart.CartDatabaseHelper
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Cpu_no1_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    private lateinit var Cpu_cart : ImageView
    private lateinit var Cpu_addToCart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpu_no1_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.cpu_img1,
            R.drawable.cpu_info1_img1,
            R.drawable.cpu_info1_img2,
            R.drawable.cpu_info1_img3,
            R.drawable.cpu_info1_img4)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Cpu_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Cpu_products_holder::class.java)
            startActivityWithAnimation(intent)
        }

        Cpu_cart = findViewById(R.id.Cpu_Cart)
        Cpu_addToCart = findViewById(R.id.Cpu_addTo_Cart_button)


    }

    override fun onBackPressed() {
        val intent = Intent(this, Cpu_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
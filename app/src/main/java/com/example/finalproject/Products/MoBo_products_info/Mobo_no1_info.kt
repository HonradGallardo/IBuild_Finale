package com.example.finalproject.Products.MoBo_products_info

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Cart.CartDatabaseHelper
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Mobo_no1_info : AppCompatActivity() {
    private lateinit var backbt: ImageView
    private lateinit var addToCart : Button
    private lateinit var MoboCart : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mobo_no1_info)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.mobo_img1,
            R.drawable.mobo_info1_img3,
            R.drawable.mobo_info1_img1,
            R.drawable.mobo_info1_img2)

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Mobo_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Mobo_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
        addToCart = findViewById(R.id.addToCart_button)
        addToCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItem = Cart_Data_Class(59, "ASRock B450M pro4 Micro-ATX", 7850.00, "MotherBoard", R.drawable.mobo_img1, 1)
            val insertedRowId = databaseHelper.insertCartItem(cartItem)

            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Mobo1")
            startActivity(int)
        }

        MoboCart = findViewById(R.id.Mobo_Cart)
        MoboCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Mobo1")
            startActivity(int)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Mobo_products_holder::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
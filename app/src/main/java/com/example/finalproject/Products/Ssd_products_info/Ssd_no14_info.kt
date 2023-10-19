package com.example.finalproject.Products.Ssd_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Cart.CartDatabaseHelper
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Ssd_no14_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    private lateinit var addToCart : Button
    private lateinit var SsdCart : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssd_no14_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.ssd_info14_img1,
            R.drawable.ssd_img14,
            R.drawable.ssd_info14_img2
        )

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Ssd_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Ssd_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
        addToCart = findViewById(R.id.addToCart_button)
        addToCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItem = Cart_Data_Class(152, "Intel 660p 500GB", 3650.00, "Solid State Drive", R.drawable.ssd_img14, 1)
            val insertedRowId = databaseHelper.insertCartItem(cartItem)

            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Ssd14")
            startActivity(int)
        }

        SsdCart = findViewById(R.id.Ssd_Cart)
        SsdCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Ssd14")
            startActivity(int)
            finish()
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
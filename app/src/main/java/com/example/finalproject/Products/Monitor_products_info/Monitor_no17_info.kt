package com.example.finalproject.Products.Monitor_products_info

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
import com.example.finalproject.Categories.Monitor_Category.Monitor_products_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Monitor_no17_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    private lateinit var addToCart : Button
    private lateinit var MonitorCart : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitor_no17_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.monitor_info17_img4,
            R.drawable.monitor_img17,
            R.drawable.monitor_info17_img1,
            R.drawable.monitor_info17_img3,
            R.drawable.monitor_info17_img2,
        )

        viewPager2.adapter = ViewPager_Adapter(images)

        backbt = findViewById(R.id.Monitor_Products_Back_to_Category)
        backbt.setOnClickListener {
            val intent = Intent(this, Monitor_products_holder::class.java)
            startActivityWithAnimation(intent)
        }
        addToCart = findViewById(R.id.addToCart_button)
        addToCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItem = Cart_Data_Class(95, "LG 24MK400H-B 23.8 inch 75Hz", 6523.95, "Monitor", R.drawable.monitor_img17, 1)
            val insertedRowId = databaseHelper.insertCartItem(cartItem)

            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Monitor17")
            startActivity(int)
        }

        MonitorCart = findViewById(R.id.Monitor_Cart)
        MonitorCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Monitor17")
            startActivity(int)
            finish()
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
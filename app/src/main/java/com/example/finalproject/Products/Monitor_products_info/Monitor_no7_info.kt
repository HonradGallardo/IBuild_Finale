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

class Monitor_no7_info : AppCompatActivity() {
    private lateinit var backbt : ImageView
    private lateinit var addToCart : Button
    private lateinit var MonitorCart : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitor_no7_info)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(
            R.drawable.monitor_info7_img1,
            R.drawable.monitor_img7,
            R.drawable.monitor_info7_img2,
            R.drawable.monitor_info7_img3,
            R.drawable.monitor_info7_img4,
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
            val cartItem = Cart_Data_Class(85, "Sceptre E275W-19203R 27 inch 75Hz", 17018.43, "Monitor", R.drawable.monitor_img7, 1)
            val insertedRowId = databaseHelper.insertCartItem(cartItem)

            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Monitor7")
            startActivity(int)
        }

        MonitorCart = findViewById(R.id.Monitor_Cart)
        MonitorCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Monitor7")
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
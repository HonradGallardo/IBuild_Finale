package com.example.finalproject.Products.Case_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Cart_Activity.Cart
import com.example.finalproject.Cart_Activity.CartDatabaseHelper
import com.example.finalproject.Cart_Activity.Cart_Data_Class
import com.example.finalproject.Categories.Case_Category.Case_product_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Case_no1_info : AppCompatActivity() {

    private lateinit var backBt : ImageView
    private lateinit var addToCart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.case_no1_info)

        val Case_viewPager: ViewPager2 = findViewById(R.id.Case_viewPager2)

        val images = listOf(
            R.drawable.tecwarenexusairm2,
            R.drawable.tecwarenexusairm2no2,
            R.drawable.tecwarenexusairm2no3,
            R.drawable.tecwarenexusairm2no4,
            R.drawable.tecwarenexusairm2no5)

        Case_viewPager.adapter = ViewPager_Adapter(images)

        backBt = findViewById(R.id.Case_Products_Back_to_Category)
        backBt.setOnClickListener {
            val int = Intent(this, Case_product_holder::class.java)
            startActivityWithAnimation(int)
            finish()
        }

        addToCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItem = Cart_Data_Class(1, "Tecware NexusAirm2", 1650.00, null, null)
            val user_id = "user1"
            val insertedRowId = databaseHelper.insertCartItem(cartItem, user_id)


            val int = Intent(this, Cart::class.java)
            startActivity(int)
        }

    }

    override fun onBackPressed() {
        val intent = Intent(this, Case_product_holder::class.java)
        startActivityWithAnimation(intent)
        finish()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
}
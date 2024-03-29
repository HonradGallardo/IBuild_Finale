package com.example.finalproject.Products.Case_products_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Cart.CartDatabaseHelper
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.Categories.Case_Category.Case_product_holder
import com.example.finalproject.Products.Cpu_products_info.ViewPager_Adapter
import com.example.finalproject.R

class Case_no8_info : AppCompatActivity() {
    private lateinit var backBt : ImageView
    private lateinit var addToCart : Button
    private lateinit var caseCart : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.case_no8_info)

        val Case_viewPager: ViewPager2 = findViewById(R.id.Case_viewPager2)

        val images = listOf(
            R.drawable.firstplayerdk3,
            R.drawable.firstplayerdk3no2,
            R.drawable.firstplayerdk3no4,
        )

        Case_viewPager.adapter = ViewPager_Adapter(images)

        backBt = findViewById(R.id.Case_Products_Back_to_Category)
        backBt.setOnClickListener {
            val int = Intent(this, Case_product_holder::class.java)
            startActivityWithAnimation(int)
            finish()
        }
        addToCart = findViewById(R.id.addToCart_button)
        addToCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItem = Cart_Data_Class(8, "1stPlayer DK-3 Midtower Gaming Case ATX White", 1350.00, "CASE", R.drawable.firstplayerdk3, 1)
            val insertedRowId = databaseHelper.insertCartItem(cartItem)


            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Case8")
            startActivity(int)
        }

        caseCart = findViewById(R.id.Case_Cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Case8")
            startActivity(int)
            finish()
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
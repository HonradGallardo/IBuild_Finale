package com.example.finalproject.Cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Case_products_info.Case_no1_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Cart : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var Cart_backButton : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        Cart_backButton = findViewById(R.id.Cart_backButton)
        Cart_backButton.setOnClickListener{
            goBackToPreviousActivity()
        }

        cartRecyclerView = findViewById(R.id.Cart_RecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)

        val databaseHelper = CartDatabaseHelper(this)
        val cartItems = databaseHelper.getAllCartItems()

        val cartAdapter = Cart_Adapter(this, cartItems)
        cartRecyclerView.adapter = cartAdapter

    }

    private fun goBackToPreviousActivity() {
        val previousActivity = intent.getStringExtra("previousActivity")
        if (previousActivity == "rvHomepage") {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
        }else if (previousActivity == "Case1"){
            val int = Intent(this, Case_no1_info::class.java)
            startActivity(int)
            finish()
        }
        // You can add more conditions for other activities if needed.
    }
}
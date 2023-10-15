package com.example.finalproject.Cart_Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

class Cart : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        cartRecyclerView = findViewById(R.id.Cart_RecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)

        val databaseHelper = CartDatabaseHelper(this)
        val cartItems = databaseHelper.getAllCartItems()

        val cartAdapter = Cart_Adapter(cartItems)
        cartRecyclerView.adapter = cartAdapter



    }
}
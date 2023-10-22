package com.example.finalproject.Orders

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.MyProfile.MyProfile
import com.example.finalproject.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Orders : AppCompatActivity() {
    private lateinit var backButton : ImageView
    private lateinit var totalPrice : TextView
    private lateinit var cartItems: List<Cart_Data_Class>
    private lateinit var adapter: Orders_Adapter
    private lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        backButton = findViewById(R.id.Orders_backButton)
        totalPrice = findViewById(R.id.tv_totalPriceCart_orders)
        recyclerView = findViewById(R.id.orders_recyclerview)

        backButton.setOnClickListener {
            val int = Intent(this, MyProfile::class.java)
            startActivity(int)
            finish()
        }

        val sharedPreferences = getSharedPreferences("CartItems", Context.MODE_PRIVATE)
        val cartItemsJson = sharedPreferences.getString("cart_items", null)
        if (cartItemsJson != null) {
            cartItems = Gson().fromJson(cartItemsJson, object : TypeToken<List<Cart_Data_Class>>() {}.type)
        } else {
            cartItems = emptyList()
        }

        // ...

        // Initialize the adapter with cart items and set up the RecyclerView
        adapter = Orders_Adapter(this, cartItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Calculate and set the total price
        updateTotalPrice()


    }


    private fun updateTotalPrice() {
        var total_Price = 0.0

        for (item in cartItems) {
            total_Price += item.price * item.quantity
        }

        // Find the total price TextView in your layout by its ID
        totalPrice.text = "₱${total_Price}"
    }
}
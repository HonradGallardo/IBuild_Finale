package com.example.finalproject.Cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Case_products_info.Case_no1_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Cart : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var Cart_backButton : ImageView
    private lateinit var tv_Total : TextView
    private lateinit var tv_Price : TextView
    private lateinit var checkOut_Button : Button
    private lateinit var cartAdapter: Cart_Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        tv_Total = findViewById(R.id.tv_totalCart)
        tv_Price = findViewById(R.id.tv_totalPriceCart)
        checkOut_Button = findViewById(R.id.checkOut_Button)

        Cart_backButton = findViewById(R.id.Cart_backButton)
        Cart_backButton.setOnClickListener{
            goBackToPreviousActivity()
        }

        cartRecyclerView = findViewById(R.id.Cart_RecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)

        val databaseHelper = CartDatabaseHelper(this)
        val cartItems = databaseHelper.getAllCartItems()

        cartAdapter = Cart_Adapter(this, cartItems.toMutableList(), ::onItemRemoved, this)
        cartRecyclerView.adapter = cartAdapter


        updateTotalPrice(cartItems)

    }

    private fun calculateTotalPrice(cartItems: List<Cart_Data_Class>): Double {
        var totalPrice = 0.0
        for (item in cartItems) {
            totalPrice += item.price * item.quantity
        }
        return totalPrice
    }

    fun updateTotalPrice(cartItems: List<Cart_Data_Class>) {
        val totalPrice = calculateTotalPrice(cartItems)
        tv_Price.text = getString(R.string.price_format, totalPrice)
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

    private fun onItemRemoved(updatedCartItems: List<Cart_Data_Class>) {
        updateTotalPrice(updatedCartItems) // Update the total price when an item is removed
    }

}
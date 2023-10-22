package com.example.finalproject.CheckOut

import CheckOut_Adapter
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Cart.Cart_Data_Class
import com.example.finalproject.MyProfile.Address.Address_DataClass
import com.example.finalproject.Orders.Orders
import com.example.finalproject.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.Locale


class CheckOut : AppCompatActivity() {
    private lateinit var backButton: ImageView
    private lateinit var fullName: TextView
    private lateinit var phoneNumber: TextView
    private lateinit var completeAddress: TextView
    private lateinit var postalCode: TextView
    private lateinit var totalPrice: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var confirmButton: Button
    private lateinit var cartItems: List<Cart_Data_Class>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
        backButton = findViewById(R.id.Cart_backButton_checkout)
        fullName = findViewById(R.id.tv_FullName_checkout)
        phoneNumber = findViewById(R.id.tv_PhoneNumber_checkout)
        completeAddress = findViewById(R.id.tv_CompleteAddress_checkout)
        postalCode = findViewById(R.id.tv_PostalCode_checkout)
        totalPrice = findViewById(R.id.tv_totalPriceCart_checkout)
        confirmButton = findViewById(R.id.checkOut_Button_checkout)
        recyclerView = findViewById(R.id.recyclerView_checkout)

        val sharedPreferences = getSharedPreferences("CartItems", Context.MODE_PRIVATE)
        val cartItemsJson = sharedPreferences.getString("cart_items", null)
        cartItems = if (cartItemsJson != null) {
            Gson().fromJson(cartItemsJson, object : TypeToken<List<Cart_Data_Class>>() {}.type)
        } else {
            emptyList()
        }

        val prefs = getSharedPreferences("AddressPreferences", Context.MODE_PRIVATE)
        val selectedAddressPosition = prefs.getInt("selectedAddressPosition", -1)
        if (selectedAddressPosition != -1) {
            // Address was selected, retrieve the data
            val selectedAddressDataJson = prefs.getString("selectedAddressData", null)
            if (selectedAddressDataJson != null) {
                val gson = Gson()
                val selectedAddress = gson.fromJson(selectedAddressDataJson, Address_DataClass::class.java)
                fullName.text = selectedAddress.FullName
                phoneNumber.text = selectedAddress.PhoneNumber
                completeAddress.text = selectedAddress.CompleteAddress
                postalCode.text = selectedAddress.PostalCode
            } else {
                Toast.makeText(this, "The selected address has been deleted.", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please select an address before checking out.", Toast.LENGTH_SHORT).show()
        }



        // Set up the RecyclerView with a new adapter for CheckOut
        val adapter = CheckOut_Adapter(this, cartItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


        updateTotalPrice()
        back_Button()
        confirm_Button()
    }

    private fun confirm_Button(){
        confirmButton.setOnClickListener {
            val sharedPreferences = getSharedPreferences("CartItems", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            val cartItemsJson = Gson().toJson(cartItems)
            editor.putString("cart_items", cartItemsJson)
            editor.apply()

            val intent = Intent(this, Orders::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun back_Button(){
        backButton.setOnClickListener {
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "CheckOut")
            startActivity(int)
            finish()
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val int = Intent(this, Cart::class.java)
        int.putExtra("previousActivity", "CheckOut")
        startActivityWithAnimation(int)
        finish()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }

    private fun updateTotalPrice() {
        var total_Price = 0.00

        for (item in cartItems) {
            total_Price += item.price * item.quantity
        }

        // Format the total price with two decimal places and a comma as a thousands separator
        val formattedTotalPrice = String.format(Locale.getDefault(), "₱%,.2f", total_Price)

        // Find the total price TextView in your layout by its ID
        totalPrice.text = formattedTotalPrice
    }
}
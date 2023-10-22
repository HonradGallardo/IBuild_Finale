package com.example.finalproject.MarketPlace_and_SellProduct

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.MyProfile.MyProfile
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import com.google.android.material.bottomnavigation.BottomNavigationView

class MarketPlace : AppCompatActivity() {
    private lateinit var bottomNavigation : BottomNavigationView
    private lateinit var recyclerView : RecyclerView
    private lateinit var backButton : ImageView
    private val marketListings: MutableList<MarketPlace_DataClass> = mutableListOf()
    private val marketAdapter: MarketPlace_Adapter by lazy {
        MarketPlace_Adapter(marketListings)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market_place)
        recyclerView = findViewById(R.id.marketplace_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = marketAdapter
        bottomNavigation = findViewById(R.id.btnav_bottomNavigation_marketplace)
        bottomNavigation.selectedItemId = R.id.marketplace
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {val intent = Intent(this, rvHompagee::class.java)
                    startActivity(intent)
                    finish()}

                R.id.sell_product -> {val intent = Intent(this, AddDetails::class.java)
                    startActivity(intent)
                    finish()}

                R.id.me_profile -> {val  intent = Intent(this, MyProfile::class.java)
                    startActivity(intent)
                    finish()}
            }
            true
        }

        backButton = findViewById(R.id.iv_back)
        backButton.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

        loadMarketplaceData()


    }
    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivity(intent)
        finish()
    }
    private fun loadMarketplaceData() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val nameYourListing = sharedPreferences.getString("nameYourListing", "")
        val priceText = sharedPreferences.getString("priceText", "0.0")
        val spinnerCategoryText = sharedPreferences.getString("spinnerCategoryText", "")
        val spinnerConditionText = sharedPreferences.getString("spinnerConditionText", "")
        val description = sharedPreferences.getString("description", "")
        val contactText = sharedPreferences.getString("contactText", "")


        // Clear the existing list before adding new data
        marketListings.clear()

        // Create a new MarketPlace_DataClass object with the retrieved data
        val marketPlaceData = MarketPlace_DataClass(
            id = System.currentTimeMillis(),
            name = nameYourListing,
            price = priceText?.toDouble() ?: 0.0,
            category = spinnerCategoryText,
            condition = spinnerConditionText,
            description = description,
            contact = contactText,
            imageUris = ArrayList() // You can load images if you save them to SharedPreferences
        )

        // Add marketPlaceData to your RecyclerView data source
        marketListings.add(marketPlaceData)

        // Notify the adapter of data changes
        marketAdapter.notifyDataSetChanged()
    }
}
package com.example.finalproject.Cart

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
import com.example.finalproject.Categories.Case_Category.Case_product_holder
import com.example.finalproject.Categories.Cpu_Category.Cpu_products_holder
import com.example.finalproject.Categories.Gpu_Category.Gpu_products_holder
import com.example.finalproject.Categories.Hdd_Category.Hdd_products_holder
import com.example.finalproject.Categories.MoBo_Category.Mobo_products_holder
import com.example.finalproject.Categories.Monitor_Category.Monitor_products_holder
import com.example.finalproject.Categories.Psu_Category.Psu_products_holder
import com.example.finalproject.Categories.Ram_Category.Ram_products_holder
import com.example.finalproject.Categories.Ssd_Category.Ssd_products_holder
import com.example.finalproject.CheckOut.CheckOut
import com.example.finalproject.MyProfile.Address.Address
import com.example.finalproject.Products.Case_products_info.Case_no10_info
import com.example.finalproject.Products.Case_products_info.Case_no1_info
import com.example.finalproject.Products.Case_products_info.Case_no2_info
import com.example.finalproject.Products.Case_products_info.Case_no3_info
import com.example.finalproject.Products.Case_products_info.Case_no4_info
import com.example.finalproject.Products.Case_products_info.Case_no5_info
import com.example.finalproject.Products.Case_products_info.Case_no6_info
import com.example.finalproject.Products.Case_products_info.Case_no7_info
import com.example.finalproject.Products.Case_products_info.Case_no8_info
import com.example.finalproject.Products.Case_products_info.Case_no9_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no10_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no11_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no12_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no13_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no14_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no15_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no16_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no17_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no18_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no19_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no20_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no2_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no3_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no4_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no5_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no6_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no7_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no8_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no9_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no10_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no11_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no12_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no13_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no14_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no15_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no16_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no17_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no18_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no19_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no20_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no2_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no3_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no4_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no5_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no6_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no7_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no8_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no9_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no3_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no4_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no5_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no7_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no8_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no10_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no11_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no12_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no13_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no14_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no15_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no16_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no17_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no18_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no19_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no20_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no3_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no4_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no5_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no7_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no8_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no9_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no10_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no11_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no12_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no13_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no14_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no15_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no16_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no17_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no18_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no19_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no1_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no20_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no2_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no3_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no4_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no5_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no6_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no7_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no8_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no9_info
import com.example.finalproject.Products.Psu_products_info.Psu_no10_info
import com.example.finalproject.Products.Psu_products_info.Psu_no11_info
import com.example.finalproject.Products.Psu_products_info.Psu_no12_info
import com.example.finalproject.Products.Psu_products_info.Psu_no13_info
import com.example.finalproject.Products.Psu_products_info.Psu_no14_info
import com.example.finalproject.Products.Psu_products_info.Psu_no15_info
import com.example.finalproject.Products.Psu_products_info.Psu_no16_info
import com.example.finalproject.Products.Psu_products_info.Psu_no17_info
import com.example.finalproject.Products.Psu_products_info.Psu_no18_info
import com.example.finalproject.Products.Psu_products_info.Psu_no19_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no20_info
import com.example.finalproject.Products.Psu_products_info.Psu_no2_info
import com.example.finalproject.Products.Psu_products_info.Psu_no3_info
import com.example.finalproject.Products.Psu_products_info.Psu_no4_info
import com.example.finalproject.Products.Psu_products_info.Psu_no5_info
import com.example.finalproject.Products.Psu_products_info.Psu_no6_info
import com.example.finalproject.Products.Psu_products_info.Psu_no7_info
import com.example.finalproject.Products.Psu_products_info.Psu_no8_info
import com.example.finalproject.Products.Psu_products_info.Psu_no9_info
import com.example.finalproject.Products.Ram_products_info.Ram_no10_info
import com.example.finalproject.Products.Ram_products_info.Ram_no11_info
import com.example.finalproject.Products.Ram_products_info.Ram_no12_info
import com.example.finalproject.Products.Ram_products_info.Ram_no13_info
import com.example.finalproject.Products.Ram_products_info.Ram_no14_info
import com.example.finalproject.Products.Ram_products_info.Ram_no15_info
import com.example.finalproject.Products.Ram_products_info.Ram_no16_info
import com.example.finalproject.Products.Ram_products_info.Ram_no17_info
import com.example.finalproject.Products.Ram_products_info.Ram_no18_info
import com.example.finalproject.Products.Ram_products_info.Ram_no19_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no20_info
import com.example.finalproject.Products.Ram_products_info.Ram_no2_info
import com.example.finalproject.Products.Ram_products_info.Ram_no3_info
import com.example.finalproject.Products.Ram_products_info.Ram_no4_info
import com.example.finalproject.Products.Ram_products_info.Ram_no5_info
import com.example.finalproject.Products.Ram_products_info.Ram_no6_info
import com.example.finalproject.Products.Ram_products_info.Ram_no7_info
import com.example.finalproject.Products.Ram_products_info.Ram_no8_info
import com.example.finalproject.Products.Ram_products_info.Ram_no9_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no10_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no11_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no12_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no13_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no14_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no15_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no16_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no17_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no18_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no19_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no20_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no2_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no3_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no4_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no5_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no6_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no7_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no8_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import com.google.gson.Gson
import java.text.NumberFormat
import java.util.Locale

class Cart : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var Cart_backButton : ImageView
    private lateinit var tv_Total : TextView
    private lateinit var tv_Price : TextView
    private lateinit var checkOut_Button : Button
    private lateinit var cartAdapter: Cart_Adapter
    private lateinit var deleteAllInCart : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        tv_Total = findViewById(R.id.tv_totalCart)
        tv_Price = findViewById(R.id.tv_totalPriceCart)
        checkOut_Button = findViewById(R.id.checkOut_Button)
        deleteAllInCart = findViewById(R.id.trashIcon_All)

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


        checkOutButton_Function()
        updateTotalPrice(cartItems)
        DeleteallItem()
    }

    private fun checkOutButton_Function() {
        checkOut_Button.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)
            val cartItems = databaseHelper.getAllCartItems()

            if (cartItems.isEmpty()) {
                // Display a message to inform the user that the cart is empty
                Toast.makeText(this, "Your cart is empty.", Toast.LENGTH_SHORT).show()
            } else {
                // Check if the user has selected an address
                val prefs = getSharedPreferences("AddressPreferences", Context.MODE_PRIVATE)
                val selectedAddressPosition = prefs.getInt("selectedAddressPosition", -1)

                if (selectedAddressPosition == -1) {
                    // Display a message to inform the user that they need to select an address
                    Toast.makeText(this, "Please select an address before checking out.", Toast.LENGTH_SHORT).show()
                } else {
                    // User has items in the cart and has selected an address
                    val sharedPreferences = getSharedPreferences("CartItems", Context.MODE_PRIVATE)
                    val editor = sharedPreferences.edit()
                    val cartItemsJson = Gson().toJson(cartItems)
                    editor.putString("cart_items", cartItemsJson)
                    editor.apply()

                    val int = Intent(this, CheckOut::class.java)
                    startActivity(int)
                    finish()
                }
            }
        }
    }

    override fun onBackPressed() {
        goBackToPreviousActivity()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }

    private fun DeleteallItem() {
        deleteAllInCart.setOnClickListener {
            val databaseHelper = CartDatabaseHelper(this)

            // Call the function to delete all items from the cart
            databaseHelper.deleteAllItems()

            // Clear the list in your adapter and notify the adapter of the change
            cartAdapter.clearCart()
            cartAdapter.notifyDataSetChanged()

            // Update the total price (assuming you have a function for it)
            updateTotalPrice(emptyList())
        }
    }

    private fun calculateTotalPrice(cartItems: List<Cart_Data_Class>): Double {
        var totalPrice = 0.0
        for (item in cartItems) {
            totalPrice += item.price * item.quantity
        }
        return totalPrice
    }

    @SuppressLint("StringFormatMatches")
    fun updateTotalPrice(cartItems: List<Cart_Data_Class>) {
        val totalPrice = calculateTotalPrice(cartItems)

        // Format the total price with commas and as a floating-point number
        val formattedPrice = NumberFormat.getNumberInstance(Locale.getDefault()).format(totalPrice)

        // Set the formatted price to tv_Price.text
        tv_Price.text = getString(R.string.price_format, formattedPrice)
    }
    override fun onBackPressed() {
        goBackToPreviousActivity()
    }


    private fun goBackToPreviousActivity() {
        val previousActivity = intent.getStringExtra("previousActivity")
        if (previousActivity == "rvHomepage") {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case1"){
            val int = Intent(this, Case_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case2"){
            val int = Intent(this, Case_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case3"){
            val int = Intent(this, Case_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case4"){
            val int = Intent(this, Case_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case5"){
            val int = Intent(this, Case_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case6"){
            val int = Intent(this, Case_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case7"){
            val int = Intent(this, Case_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case8"){
            val int = Intent(this, Case_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case9"){
            val int = Intent(this, Case_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case10"){
            val int = Intent(this, Case_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Case_product_holder"){
            val int = Intent(this, Case_product_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Cpu1"){
            val int = Intent(this, Cpu_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu2"){
            val int = Intent(this, Cpu_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu3"){
            val int = Intent(this, Cpu_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu4"){
            val int = Intent(this, Cpu_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu5"){
            val int = Intent(this, Cpu_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu6"){
            val int = Intent(this, Cpu_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu7"){
            val int = Intent(this, Cpu_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu8"){
            val int = Intent(this, Cpu_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu9"){
            val int = Intent(this, Cpu_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu10") {
            val int = Intent(this, Cpu_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu11"){
            val int = Intent(this, Cpu_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu12"){
            val int = Intent(this, Cpu_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu13"){
            val int = Intent(this, Cpu_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu14"){
            val int = Intent(this, Cpu_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu15"){
            val int = Intent(this, Cpu_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu16"){
            val int = Intent(this, Cpu_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu17"){
            val int = Intent(this, Cpu_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu18"){
            val int = Intent(this, Cpu_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu19"){
            val int = Intent(this, Cpu_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu20"){
            val int = Intent(this, Cpu_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Cpu_product_holder"){
            val int = Intent(this, Cpu_products_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Gpu1"){
            val int = Intent(this, Gpu_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu2"){
            val int = Intent(this, Gpu_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu3"){
            val int = Intent(this, Gpu_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu4"){
            val int = Intent(this, Gpu_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu5"){
            val int = Intent(this, Gpu_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu6"){
            val int = Intent(this, Gpu_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu7"){
            val int = Intent(this, Gpu_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu8"){
            val int = Intent(this, Gpu_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu9"){
            val int = Intent(this, Gpu_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu10"){
            val int = Intent(this, Gpu_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu11"){
            val int = Intent(this, Gpu_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu12"){
            val int = Intent(this, Gpu_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu13"){
            val int = Intent(this, Gpu_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu14"){
            val int = Intent(this, Gpu_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu15"){
            val int = Intent(this, Gpu_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu16"){
            val int = Intent(this, Gpu_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu17"){
            val int = Intent(this, Gpu_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu18"){
            val int = Intent(this, Gpu_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu19"){
            val int = Intent(this, Gpu_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu20"){
            val int = Intent(this, Gpu_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Gpu_product_holder"){
            val int = Intent(this, Gpu_products_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Hdd1"){
            val int = Intent(this, Hdd_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd2"){
            val int = Intent(this, Hdd_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd3"){
            val int = Intent(this, Hdd_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd4"){
            val int = Intent(this, Hdd_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd5"){
            val int = Intent(this, Hdd_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd6"){
            val int = Intent(this, Hdd_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd7"){
            val int = Intent(this, Hdd_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd8"){
            val int = Intent(this, Hdd_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Hdd_product_holder"){
            val int = Intent(this, Hdd_products_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Mobo1"){
            val int = Intent(this, Mobo_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo2"){
            val int = Intent(this, Mobo_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo3"){
            val int = Intent(this, Mobo_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo4"){
            val int = Intent(this, Mobo_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo5"){
            val int = Intent(this, Mobo_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo6"){
            val int = Intent(this, Mobo_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo7"){
            val int = Intent(this, Mobo_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo8"){
            val int = Intent(this, Mobo_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo9"){
            val int = Intent(this, Mobo_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo10"){
            val int = Intent(this, Mobo_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo11`"){
            val int = Intent(this, Mobo_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo12"){
            val int = Intent(this, Mobo_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo13"){
            val int = Intent(this, Mobo_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo14"){
            val int = Intent(this, Mobo_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo15"){
            val int = Intent(this, Mobo_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo16"){
            val int = Intent(this, Mobo_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo17"){
            val int = Intent(this, Mobo_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo18"){
            val int = Intent(this, Mobo_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo19"){
            val int = Intent(this, Mobo_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo20"){
            val int = Intent(this, Mobo_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Mobo_product_holder"){
            val int = Intent(this, Mobo_products_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Monitor1"){
            val int = Intent(this, Monitor_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor2"){
            val int = Intent(this, Monitor_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor3"){
            val int = Intent(this, Monitor_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor4"){
            val int = Intent(this, Monitor_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor5"){
            val int = Intent(this, Monitor_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor6"){
            val int = Intent(this, Monitor_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor7"){
            val int = Intent(this, Monitor_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor8"){
            val int = Intent(this, Monitor_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor9"){
            val int = Intent(this, Monitor_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor10"){
            val int = Intent(this, Monitor_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor11"){
            val int = Intent(this, Monitor_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor12"){
            val int = Intent(this, Monitor_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor13"){
            val int = Intent(this, Monitor_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor14"){
            val int = Intent(this, Monitor_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor15"){
            val int = Intent(this, Monitor_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor16"){
            val int = Intent(this, Monitor_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor17"){
            val int = Intent(this, Monitor_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor18"){
            val int = Intent(this, Monitor_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor19"){
            val int = Intent(this, Monitor_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor20"){
            val int = Intent(this, Monitor_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Monitor_product_holder"){
            val int = Intent(this, Monitor_products_holder::class.java)
            startActivity(int)
            finish()





        }else if (previousActivity == "Psu1"){
            val int = Intent(this, Psu_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu2"){
            val int = Intent(this, Psu_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu3"){
            val int = Intent(this, Psu_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu4"){
            val int = Intent(this, Psu_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu5"){
            val int = Intent(this, Psu_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu6"){
            val int = Intent(this, Psu_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu7"){
            val int = Intent(this, Psu_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu8"){
            val int = Intent(this, Psu_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu9"){
            val int = Intent(this, Psu_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu10"){
            val int = Intent(this, Psu_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu11"){
            val int = Intent(this, Psu_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu12"){
            val int = Intent(this, Psu_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu13"){
            val int = Intent(this, Psu_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu14"){
            val int = Intent(this, Psu_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu15"){
            val int = Intent(this, Psu_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu16"){
            val int = Intent(this, Psu_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu17"){
            val int = Intent(this, Psu_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu18"){
            val int = Intent(this, Psu_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu19"){
            val int = Intent(this, Psu_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu20"){
            val int = Intent(this, Psu_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Psu_product_holder"){
            val int = Intent(this, Psu_products_holder::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram1"){
            val int = Intent(this, Ram_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram2"){
            val int = Intent(this, Ram_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram3"){
            val int = Intent(this, Ram_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram4"){
            val int = Intent(this, Ram_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram5"){
            val int = Intent(this, Ram_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram6"){
            val int = Intent(this, Ram_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram7"){
            val int = Intent(this, Ram_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram8"){
            val int = Intent(this, Ram_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram9"){
            val int = Intent(this, Ram_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram10"){
            val int = Intent(this, Ram_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram11"){
            val int = Intent(this, Ram_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram12"){
            val int = Intent(this, Ram_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram13"){
            val int = Intent(this, Ram_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram14"){
            val int = Intent(this, Ram_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram15"){
            val int = Intent(this, Ram_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram16"){
            val int = Intent(this, Ram_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram17"){
            val int = Intent(this, Ram_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram18"){
            val int = Intent(this, Ram_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram19"){
            val int = Intent(this, Ram_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram20"){
            val int = Intent(this, Ram_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ram_product_holder"){
            val int = Intent(this, Ram_products_holder::class.java)
            startActivity(int)
            finish()




        }else if (previousActivity == "Ssd1"){
            val int = Intent(this, Ssd_no1_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd2"){
            val int = Intent(this, Ssd_no2_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd3"){
            val int = Intent(this, Ssd_no3_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd4"){
            val int = Intent(this, Ssd_no4_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd5"){
            val int = Intent(this, Ssd_no5_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd6"){
            val int = Intent(this, Ssd_no6_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd7"){
            val int = Intent(this, Ssd_no7_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd8"){
            val int = Intent(this, Ssd_no8_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd9"){
            val int = Intent(this, Ssd_no9_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd10"){
            val int = Intent(this, Ssd_no10_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd11"){
            val int = Intent(this, Ssd_no11_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd12"){
            val int = Intent(this, Ssd_no12_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd13"){
            val int = Intent(this, Ssd_no13_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd14"){
            val int = Intent(this, Ssd_no14_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd15"){
            val int = Intent(this, Ssd_no15_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd16"){
            val int = Intent(this, Ssd_no16_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd17"){
            val int = Intent(this, Ssd_no17_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd18"){
            val int = Intent(this, Ssd_no18_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd19"){
            val int = Intent(this, Ssd_no19_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd20"){
            val int = Intent(this, Ssd_no20_info::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "Ssd_product_holder"){
            val int = Intent(this, Ssd_products_holder::class.java)
            startActivity(int)
            finish()
        }else if (previousActivity == "CheckOut"){
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
        // You can add more conditions for other activities if needed.
    }

    private fun onItemRemoved(updatedCartItems: List<Cart_Data_Class>) {
        updateTotalPrice(updatedCartItems) // Update the total price when an item is removed
    }

}
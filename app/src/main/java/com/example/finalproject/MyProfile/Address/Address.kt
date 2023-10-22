    package com.example.finalproject.MyProfile.Address

    import android.annotation.SuppressLint
    import android.content.Context
    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import android.widget.ImageView
    import android.widget.Toast
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import com.example.finalproject.MyProfile.MyProfile
    import com.example.finalproject.R

    class Address : AppCompatActivity() {
        private lateinit var backButton : ImageView
        private lateinit var RecyclerViewAddress : RecyclerView
        private lateinit var Add_Address_Button : Button
        private lateinit var AddressAdapter : Address_Adapter
        private lateinit var dbHelper: AddressDatabaseHelper
        private val sharedPreferencesKey = "selectedAddressPosition"
        @SuppressLint("Range")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_address)

            backButton = findViewById(R.id.BackButton_Address)
            RecyclerViewAddress = findViewById(R.id.RecyclerView_Address)
            Add_Address_Button = findViewById(R.id.Add_Address_Button)



            // Initialize your RecyclerView Adapter with an empty list for now
            AddressAdapter = Address_Adapter(this, emptyList())
            RecyclerViewAddress.adapter = AddressAdapter


            // Set a layout manager for your RecyclerView (e.g., LinearLayoutManager)
            RecyclerViewAddress.layoutManager = LinearLayoutManager(this)

            dbHelper = AddressDatabaseHelper(this)

            val addresses = getAllAddresses()
            AddressAdapter.updateData(addresses)

            backToMyProfile()
            Add_AddressButton()
        }

        override fun onResume() {
            super.onResume()

            // Retrieve the selected position from SharedPreferences
            val selectedPosition = getSelectedAddressPosition()

            // Update the adapter with the selected position
                AddressAdapter.selectedPosition = selectedPosition
        }

//        private fun setSelectedAddressPosition(position: Int) {
//            val sharedPref = getSharedPreferences("AddressPreferences", Context.MODE_PRIVATE)
//            val editor = sharedPref.edit()
//            editor.putInt(sharedPreferencesKey, position)
//            editor.apply()
//        }

        private fun getSelectedAddressPosition(): Int {
            val sharedPref = getSharedPreferences("AddressPreferences", Context.MODE_PRIVATE)
            return sharedPref.getInt(sharedPreferencesKey, -1)
        }


        // Function to retrieve all addresses from the database
        @SuppressLint("Range")
        private fun getAllAddresses(): List<Address_DataClass> {
            val addresses = mutableListOf<Address_DataClass>()
            val db = dbHelper.readableDatabase
            val cursor = db.rawQuery("SELECT * FROM addresses", null)

            while (cursor.moveToNext()) {
                val id = cursor.getLong(cursor.getColumnIndex("_id"))
                val fullName = cursor.getString(cursor.getColumnIndex("full_name"))
                val phoneNumber = cursor.getString(cursor.getColumnIndex("phone_number"))
                val completeAddress = cursor.getString(cursor.getColumnIndex("complete_address"))
                val postalCode = cursor.getString(cursor.getColumnIndex("postal_code"))

                val address = Address_DataClass(id, fullName, phoneNumber, completeAddress, postalCode)
                addresses.add(address)
            }

            cursor.close()
            db.close()

            if (addresses.isEmpty()) {
                // Display a message to inform the user that they need to add an address
                Toast.makeText(this, "Please add an address before checking out.", Toast.LENGTH_SHORT).show()
            }

            return addresses
        }

        private fun Add_AddressButton(){
            Add_Address_Button.setOnClickListener {
                val int = Intent(this, Create_Address::class.java)
                startActivity(int)
                finish()
            }
        }

        private fun backToMyProfile(){
            backButton.setOnClickListener {
                val int = Intent(this, MyProfile::class.java)
                startActivityWithAnimation(int)
                finish()
            }
        }

        override fun onBackPressed() {
            val intent = Intent(this, MyProfile::class.java)
            startActivityWithAnimation(intent)
            finish()
        }

        fun startActivityWithAnimation(intent: Intent) {
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            finish()
        }

    }
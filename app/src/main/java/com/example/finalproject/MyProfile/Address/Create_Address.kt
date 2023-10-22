package com.example.finalproject.MyProfile.Address

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.finalproject.R

class Create_Address : AppCompatActivity() {
    private lateinit var backButton_Address : ImageView
    private lateinit var et_FullName : EditText
    private lateinit var et_PhoneNumber : EditText
    private lateinit var et_CompleteAddress : EditText
    private lateinit var et_PostalCode : EditText
    private lateinit var Create_Address_Button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_address)
        backButton_Address = findViewById(R.id.BackButton_CreateAddress)
        et_FullName = findViewById(R.id.et_FullName_CreateAddress)
        et_PhoneNumber = findViewById(R.id.et_PhoneNumber_CreateAddress)
        et_CompleteAddress = findViewById(R.id.et_CompleteAddress_CreateAddress)
        et_PostalCode = findViewById(R.id.et_PostalCode_CreateAddress)
        Create_Address_Button = findViewById(R.id.Add_Address_Button_CreateAddress)

        val dbHelper = AddressDatabaseHelper(this)



        Create_Address_Function()
        backToAddressActivity()
    }

    private fun Create_Address_Function() {
        Create_Address_Button.setOnClickListener {
            val fullName = et_FullName.text.toString()
            val phoneNumber = et_PhoneNumber.text.toString()
            val completeAddress = et_CompleteAddress.text.toString()
            val postalCode = et_PostalCode.text.toString()

            if (fullName.isEmpty() || phoneNumber.isEmpty() || completeAddress.isEmpty() || postalCode.isEmpty()) {
                // Display a Toast message if any field is empty
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (phoneNumber.length != 11) {
                // Display a Toast message if the phone number is not 11 digits
                Toast.makeText(this, "Phone number must be 11 digits", Toast.LENGTH_SHORT).show()
            } else if (completeAddress.count { it == '#' } != 1) {
                // Display a Toast message if the '#' character is not exactly one
                Toast.makeText(this, "Complete address must contain exactly one '#'", Toast.LENGTH_SHORT).show()
            } else {
                // Insert the data into the SQLite database
                val dbHelper = AddressDatabaseHelper(this)
                val db = dbHelper.writableDatabase
                val values = ContentValues().apply {
                    put("full_name", fullName)
                    put("phone_number", phoneNumber)
                    put("complete_address", completeAddress)
                    put("postal_code", postalCode)
                }
                db.insert("addresses", null, values)

                val int = Intent(this, Address::class.java)
                startActivityWithAnimation(int)
                finish()
            }
        }
    }

    private fun backToAddressActivity(){
        backButton_Address.setOnClickListener {
            val int = Intent(this, Address::class.java)
            startActivityWithAnimation(int)
            finish()
        }
    }


    override fun onBackPressed() {
        val intent = Intent(this, Address::class.java)
        startActivityWithAnimation(intent)
        finish()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }


}
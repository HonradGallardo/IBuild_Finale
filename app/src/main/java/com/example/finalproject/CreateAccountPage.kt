package com.example.finalproject

import Database.DatabaseHelper
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CreateAccountPage : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var createAccount : Button
    private lateinit var alreadyHaveAnAccountLogIn : TextView
    private lateinit var databaseHelper: DatabaseHelper

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        databaseHelper = DatabaseHelper(this)

        username = findViewById(R.id.et_username_createAccountPage)
        password = findViewById(R.id.et_password_createAccountPage)
        createAccount = findViewById(R.id.bt_createAccount)
        alreadyHaveAnAccountLogIn = findViewById(R.id.tv_already_have_an_account_logIn)



        //DAPAT ITO MAPUPUNTA SA LANDING PAGE/HOMEPAGE
//        createAccount.setOnClickListener {
//            val int = Intent(this, LogInPage::class.java)
//            startActivity(int)
//            finish()
//        }

        createAccount.setOnClickListener {
            val signUpUsername = username.text.toString()
            val signUpPassword = password.text.toString()
            signUpDatabase(signUpUsername, signUpPassword)
        }

        alreadyHaveAnAccountLogIn.setOnClickListener{
            val int = Intent(this, LogInPage::class.java)
            startActivity(int)
            finish()
        }
    }
    private fun signUpDatabase(username : String, password : String){
        val insertedRowId = databaseHelper.insertUser(username, password)
        if (insertedRowId != -1L){
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
            val int = Intent(this, LogInPage::class.java)
            startActivity(int)
            finish()
        }else{
            Toast.makeText(this, "Signup Failed", Toast.LENGTH_SHORT).show()
        }

    }
}
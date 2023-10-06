package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CreateAccountPage : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var email : EditText
    private lateinit var createAccount : Button
    private lateinit var alreadyHaveAnAccountLogIn : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        username = findViewById(R.id.et_username_createAccountPage)
        password = findViewById(R.id.et_password_createAccountPage)
        email = findViewById(R.id.et_email_createAccountPage)
        createAccount = findViewById(R.id.bt_createAccount)
        alreadyHaveAnAccountLogIn = findViewById(R.id.tv_already_have_an_account_logIn)



        //DAPAT ITO MAPUPUNTA SA LANDING PAGE/HOMEPAGE
        createAccount.setOnClickListener {
            val int = Intent(this, LogInPage::class.java)
            startActivity(int)
            finish()
        }

        alreadyHaveAnAccountLogIn.setOnClickListener{
            val int = Intent(this, LogInPage::class.java)
            startActivity(int)
            finish()
        }

    }
}
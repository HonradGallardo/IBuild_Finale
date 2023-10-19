package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {


//    private lateinit var logo : ImageView
//    private lateinit var ibuildText : TextView
//    private lateinit var progressBar : ProgressBar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val isLoggedIn = sharedPrefs.getBoolean("isLoggedIn", false)

        if (isLoggedIn) {
            Handler().postDelayed({val intent = Intent(this, rvHompagee::class.java)
                startActivity(intent)
                finish()}, 2000)
        } else {
            // Continue showing the login or registration screen
            Handler().postDelayed({val intent = Intent(this, LogInPage::class.java)
                startActivity(intent)
                finish()}, 2000)
        }





    }
}
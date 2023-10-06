package com.example.finalproject

import android.annotation.SuppressLint
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

        Handler().postDelayed({startActivity(Intent(this, LogInPage::class.java))
        finish()}, 2000)







    }
}
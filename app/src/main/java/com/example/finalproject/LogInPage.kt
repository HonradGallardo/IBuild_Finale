package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LogInPage : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var logIn: Button
    private lateinit var createAccount: TextView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)

        username = findViewById(R.id.et_username_logInPage)
        password = findViewById(R.id.et_passwordLogIn)
        logIn = findViewById(R.id.bt_logIn)
        createAccount = findViewById(R.id.tv_createAcc)


        //WALA PA YUNG IBANG PAGE O ACTIVITY NEXT MONTH NA LANG YAN
        //UNWIND MUNA AKO ISANG BUWAN PARA MAHIMASMASAN


        createAccount.setOnClickListener {
            val intent = Intent(this, CreateAccountPage::class.java)
            startActivity(intent)
        }
        logIn.setOnClickListener {
            val intent = Intent(this, rvHompagee::class.java)
            startActivity(intent)
            finish()
        }
    }


}
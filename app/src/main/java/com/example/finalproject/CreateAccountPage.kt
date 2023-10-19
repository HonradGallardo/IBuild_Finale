package com.example.finalproject

import com.example.finalproject.Database.DatabaseHelper
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CreateAccountPage : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var createAccount: Button
    private lateinit var alreadyHaveAnAccountLogIn: TextView
    private lateinit var databaseHelper: DatabaseHelper

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        databaseHelper = DatabaseHelper(this)

        username = findViewById(R.id.et_username_createAccountPage)
        email = findViewById(R.id.et_email_createAccountPage)
        password = findViewById(R.id.et_password_createAccountPage)
        confirmPassword = findViewById(R.id.et_Confirmpassword_createAccountPage)
        createAccount = findViewById(R.id.bt_createAccount)
        alreadyHaveAnAccountLogIn = findViewById(R.id.tv_already_have_an_account_logIn)

        createAccount.setOnClickListener {
            val signUpUsername = username.text.toString()
            val signUpEmail = email.text.toString()
            val signUpPassword = password.text.toString()
            val signUpConfirmPassword = confirmPassword.text.toString()

            if (isEmailAndPasswordValid(signUpUsername, signUpEmail, signUpPassword, signUpConfirmPassword)) {
                signUpDatabase(signUpUsername, signUpEmail, signUpPassword)
            }
        }

        alreadyHaveAnAccountLogIn.setOnClickListener {
            val int = Intent(this, LogInPage::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun isEmailAndPasswordValid(username: String, email: String, password: String, confirmPassword: String): Boolean {
        val isEmailValid = isValidEmail(email)
        val isConfirmPasswordValid = confirmPassword == password

        if (!isEmailValid) {
            Toast.makeText(this, "Invalid email format. Please include '@' in the email.", Toast.LENGTH_SHORT).show()
        }

        if (!isConfirmPasswordValid) {
            Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
        }

        return isEmailValid && isConfirmPasswordValid
    }

    private fun isValidEmail(email: String): Boolean {
        val emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$"
        return email.matches(emailRegex.toRegex())
    }

    private fun signUpDatabase(username: String, email: String, password: String) {
        val insertedRowId = databaseHelper.insertUser(username, email, password)
        if (insertedRowId != -1L) {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()

            val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val editor = sharedPrefs.edit()
            editor.putString("username", username)
            editor.putString("email", email)
            editor.apply()

            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Signup Failed", Toast.LENGTH_SHORT).show()
        }
    }
}

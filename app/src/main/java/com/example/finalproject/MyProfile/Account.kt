package com.example.finalproject.MyProfile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.finalproject.Database.DatabaseHelper
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Account : AppCompatActivity() {

    private lateinit var et_username : EditText
    private lateinit var et_email : EditText
    private lateinit var et_CurrentPassword : EditText
    private lateinit var et_newPassword : EditText
    private lateinit var et_confirmPassword : EditText
    private lateinit var saveButton : TextView
    private lateinit var backButton : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        et_username = findViewById(R.id.et_username_account)
        et_email = findViewById(R.id.et_email_account)
        et_CurrentPassword = findViewById(R.id.et_CurrentPassword_account)
        et_newPassword = findViewById(R.id.et_NewPassword_account)
        et_confirmPassword = findViewById(R.id.et_ConfirmPassword_account)
        saveButton = findViewById(R.id.tv_SaveButton_Account)
        backButton = findViewById(R.id.BackButton_Account)



        BackButton()
        saveInformation()
        UsernameAndEmail()
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

    private fun BackButton(){
        backButton.setOnClickListener {
            val int = Intent(this, MyProfile::class.java)
            startActivityWithAnimation(int)
            finish()
        }
    }

    private fun UsernameAndEmail(){
        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val savedUsername = sharedPrefs.getString("username", "")
        val savedEmail = sharedPrefs.getString("email", "")

        et_username.setText(savedUsername)
        et_email.setText(savedEmail)

    }

    private fun saveInformation() {
        saveButton.setOnClickListener {
            val newUsername = et_username.text.toString()
            val newEmail = et_email.text.toString()
            val currentPassword = et_CurrentPassword.text.toString()
            val newPassword = et_newPassword.text.toString()
            val confirmPassword = et_confirmPassword.text.toString()

            if (currentPassword.isEmpty()) {
                // Display a toast message indicating that the current password is required
                Toast.makeText(this, "Current password is required", Toast.LENGTH_SHORT).show()
            } else if (isEmailAndPasswordValid(newUsername, newEmail, newPassword, confirmPassword)) {
                val userId = getUserIdFromSharedPreferences()
                val dbHelper = DatabaseHelper(this)

                // Retrieve the user's current password from the database
                val currentUserPassword = dbHelper.getCurrentUserPassword(userId)

                if (currentPassword == currentUserPassword) {
                    // If the current_password matches the retrieved current password, proceed
                    dbHelper.updateUsername(userId, newUsername)
                    dbHelper.updateEmail(userId, newEmail)
                    dbHelper.updatePassword(userId, newPassword)

                    saveUpdatedUsernameAndEmail(newUsername, newEmail)
                    val int = Intent(this, MyProfile::class.java)
                    startActivity(int)
                    finish()

                    // Provide user feedback, e.g., show a toast message
                    Toast.makeText(this, "Information updated successfully", Toast.LENGTH_SHORT).show()
                } else {
                    // Debugging: Print the values of currentPassword and currentUserPassword
                    Log.d("PasswordDebug", "Current Password: $currentPassword")
                    Log.d("PasswordDebug", "User's Current Password: $currentUserPassword")

                    // Display a toast message indicating that the current password is incorrect
                    Toast.makeText(this, "Current password is incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun saveUpdatedUsernameAndEmail(updatedUsername: String, updatedEmail: String) {
        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPrefs.edit()
        editor.putString("username", updatedUsername)
        editor.putString("email", updatedEmail)
        editor.apply()
    }

    private fun getUserIdFromSharedPreferences(): Long {
        val sharedPrefs = this.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        return sharedPrefs.getLong("user_id", 1) // -1 is a default value if the key is not found
    }

    private fun isEmailAndPasswordValid(username: String, email: String, password: String, confirmPassword: String): Boolean {
        val isEmailValid = isValidEmail(email)
        val isPasswordValid = isValidPassword(password)
        val isConfirmPasswordValid = password == confirmPassword

        if (!isEmailValid) {
            Toast.makeText(this, "Invalid email format. Please include '@' in the email and at least one '.' in the domain.", Toast.LENGTH_SHORT).show()
        }

        if (!isPasswordValid) {
            Toast.makeText(this, "Password must be at least 6 characters.", Toast.LENGTH_SHORT).show()
        }

        if (!isConfirmPasswordValid) {
            Toast.makeText(this, "Password does not match the confirmation password.", Toast.LENGTH_SHORT).show()
        }

        return isEmailValid && isPasswordValid && isConfirmPasswordValid
    }

    private fun isValidEmail(email: String): Boolean {
        val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\$"
        return email.matches(emailRegex.toRegex())
    }

    private fun isValidPassword(password: String): Boolean {
        // Implement your password validation criteria
        return password.length >= 6 // Example: Password must be at least 6 characters
    }
}
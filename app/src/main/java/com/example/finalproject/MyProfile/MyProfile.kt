package com.example.finalproject.MyProfile

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.finalproject.LogInPage
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import com.google.android.material.bottomnavigation.BottomNavigationView


class MyProfile : AppCompatActivity() {
    private lateinit var myProfile : ImageView
    private lateinit var username : TextView
    private lateinit var email : TextView
    private lateinit var account : Button
    private lateinit var orders : Button
    private lateinit var address : Button
    private lateinit var myProducts : Button
    private lateinit var logout : TextView
    private val PICK_IMAGE_REQUEST = 1


    private lateinit var bottomNaviation : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)



        myProfile = findViewById(R.id.my_profile)
        myProfile.setOnClickListener {
            openImagePicker()
        }





        toAccount()
        UsernameAndEmailTextView()
        logOut()
        bottomNavigation()
    }

    private fun openImagePicker() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            val imageUri: Uri? = data.data
            myProfile.setImageURI(imageUri)
        }
    }


    private fun toAccount(){
        account = findViewById(R.id.Account_MyProfile)
        account.setOnClickListener {
            val int = Intent(this, Account::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun logOut(){
        logout = findViewById(R.id.LogOut_MyProfile)
        logout.setOnClickListener {
            val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val editor = sharedPrefs.edit()
            editor.putBoolean("isLoggedIn", false)
            editor.apply()

            // Optionally, perform other logout-related actions here
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun bottomNavigation(){
        bottomNaviation = findViewById(R.id.btnav_bottomNavigation_MyProfile)
        bottomNaviation.selectedItemId = R.id.me_profile
        bottomNaviation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {val intent = Intent(this, rvHompagee::class.java)
                    startActivity(intent)
                    finish()}

//                R.id.marketplace ->{val intent = Intent(this, Marketplace::class.java)
//                startActivity(intent)
//                finish()}

//                R.id.me_profile -> {val  intent = Intent(this, MyProfile::class.java)
//                    startActivity(intent)
//                    finish()}
            }
            true
        }
    }

    private fun UsernameAndEmailTextView(){
        val sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val savedUsername = sharedPrefs.getString("username", "")
        val savedEmail = sharedPrefs.getString("email", "")

        // Display the retrieved username and email in TextViews
        username = findViewById(R.id.Username_MyProfile)
        username.text = savedUsername

        email = findViewById(R.id.Email_MyProfile)
        email.text = savedEmail
    }

}
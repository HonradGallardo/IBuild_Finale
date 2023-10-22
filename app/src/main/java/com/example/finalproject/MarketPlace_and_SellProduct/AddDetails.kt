package com.example.finalproject.MarketPlace_and_SellProduct

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Collections.min
import kotlin.math.min


class AddDetails : AppCompatActivity() {
    private lateinit var back: ImageView
    private lateinit var category: Spinner
    private lateinit var nameYourListing: EditText
    private lateinit var condition: Spinner
    private lateinit var priceListing: EditText
    private lateinit var inputDescription: EditText
    private lateinit var listNow: Button
    private lateinit var checkMailDelivery: CheckBox
    private lateinit var checkMeetUp: CheckBox
    private lateinit var imageViews: List<ImageView>
    private lateinit var contact: EditText

    private val REQUEST_IMAGE_PICKER = 1
    private val REQUEST_PERMISSION = 2

    private val selectedImages: ArrayList<Uri> = ArrayList()
    private val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_details)

        back = findViewById(R.id.iv_back)
        category = findViewById(R.id.spinner_category)
        condition = findViewById(R.id.spinner_condition)
        nameYourListing = findViewById(R.id.et_name_you_listing)
        priceListing = findViewById(R.id.et_price_of_you_listing)
        inputDescription = findViewById(R.id.mt_input_description)
        checkMailDelivery = findViewById(R.id.checkBox_mail_delivery)
        checkMeetUp = findViewById(R.id.checkBox_meet_up)
        listNow = findViewById(R.id.bt_list_now)
        contact = findViewById(R.id.et_input_contact)


        imageViews = listOf(
            findViewById(R.id.iv_imageone),
            findViewById(R.id.iv_imagetwo)
        )

        val categories = resources.getStringArray(R.array.categories)
        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        category.adapter = categoryAdapter

        val checkBoxes = listOf(checkMailDelivery, checkMeetUp)

        for (checkBox in checkBoxes) {
            checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    for (otherCheckBox in checkBoxes) {
                        if (otherCheckBox != checkBox) {
                            otherCheckBox.isChecked = false
                        }
                    }
                }
            }
        }



        back.setOnClickListener {
            val intent = Intent(this, rvHompagee::class.java)
            startActivity(intent)
        }

        listNow.setOnClickListener {
            Log.d("AddDetails", "List Now button clicked")
            val nameYourListingText = nameYourListing.text.toString()
            val priceText = priceListing.text.toString()
            val spinnerCategoryText = category.selectedItem.toString()
            val spinnerConditionText = condition.selectedItem.toString()
            val description = inputDescription.text.toString()
            val contactText = contact.text.toString()


            if (nameYourListingText.isEmpty() || priceText.isEmpty() || description.isEmpty() || contactText.isEmpty()) {
                // Display an error message to the user
                Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show()
            }else{
                val editor = sharedPreferences.edit()
                editor.putString("nameYourListing", nameYourListingText)
                editor.putString("priceText", priceText)
                editor.putString("spinnerCategoryText", spinnerCategoryText)
                editor.putString("spinnerConditionText", spinnerConditionText)
                editor.putString("description", description)
                editor.putString("contactText", contactText)
                editor.apply()

                // Pass the data to the MarketPlace activity
                val intent = Intent(this, MarketPlace::class.java)
                startActivity(intent)
                finish()

            }
        }


        for (imageView in imageViews) {
            imageView.setOnClickListener {
                checkStoragePermissionAndOpenGallery()
            }
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivity(intent)
        finish()
    }


    private fun checkStoragePermissionAndOpenGallery() {
        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                REQUEST_PERMISSION
            )
        } else {
            openGalleryPicker()
        }
    }

    private fun openGalleryPicker() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        startActivityForResult(Intent.createChooser(intent, "Select Pictures"), REQUEST_IMAGE_PICKER)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == REQUEST_PERMISSION && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            openGalleryPicker()
        } else {
            Toast.makeText(this, "Storage permission is required to select images.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_IMAGE_PICKER && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                if (data.clipData != null) {
                    val clipData = data.clipData
                    if (clipData != null) {
                        for (i in 0 until min(clipData.itemCount, imageViews.size)) {
                            val uri = clipData.getItemAt(i).uri
                            selectedImages.add(uri)
                        }
                    }
                } else if (data.data != null) {
                    val uri = data.data
                    uri?.let { selectedImages.add(it) }
                }
            }

            for (i in 0 until min(selectedImages.size, imageViews.size)) {
                val imageView = imageViews[i]
                imageView.setImageURI(selectedImages[i])
            }
        }

            if (selectedImages.size > imageViews.size) {
                val message = "You can only select up to ${imageViews.size} images."
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }
        }
    }

// update 10:47am 10-22-2023
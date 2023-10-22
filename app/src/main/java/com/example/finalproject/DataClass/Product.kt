package com.example.finalproject.DataClass

import androidx.appcompat.app.AppCompatActivity

data class Product(var title : String, var price : Double, var image : Int, val targetActivity: Class<out AppCompatActivity>)

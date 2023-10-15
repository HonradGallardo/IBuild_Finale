package com.example.finalproject.DataClass

import androidx.appcompat.app.AppCompatActivity

data class Product(var title : String, var image : Int, var price : Double, val targetActivity: Class<out AppCompatActivity>)

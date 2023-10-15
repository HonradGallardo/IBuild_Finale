package com.example.finalproject.IntelBuild

import androidx.appcompat.app.AppCompatActivity

data class IntelBuildDataClass(var title : String, var image : Int, var price : Double, val targetActivity: Class<out AppCompatActivity>)

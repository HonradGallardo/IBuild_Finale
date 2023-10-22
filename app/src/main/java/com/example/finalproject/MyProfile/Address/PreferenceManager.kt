package com.example.finalproject.MyProfile.Address

import android.content.Context

class PreferenceManager(context: Context) {
    private val sharedPreferences =
        context.getSharedPreferences("MyAppPreferences", Context.MODE_PRIVATE)

    fun setDefaultAddress(addressId: Long) {
        sharedPreferences.edit().putInt("defaultAddressId", addressId.toInt()).apply()
    }

    fun getDefaultAddress(): Int {
        return sharedPreferences.getInt("defaultAddressId", -1)
    }
}
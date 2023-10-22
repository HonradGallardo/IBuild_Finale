package com.example.finalproject.MyProfile.Address

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AddressDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "AddressDatabase.db"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Create the table for storing address data
        db.execSQL(
            "CREATE TABLE addresses (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "full_name TEXT," +
                    "phone_number TEXT," +
                    "complete_address TEXT," +
                    "postal_code TEXT);"
        )
    }

    fun deleteAddress(id: Long): Boolean {
        val db = writableDatabase
        val result = db.delete("addresses", "_id = ?", arrayOf(id.toString())) > 0
        db.close()
        return result
    }

    fun insertAddress(fullName: String, phoneNumber: String, completeAddress: String, postalCode: String): Long {
        val db = writableDatabase

        val values = ContentValues()
        values.put("full_name", fullName)
        values.put("phone_number", phoneNumber)
        values.put("complete_address", completeAddress)
        values.put("postal_code", postalCode)

        // Insert the data into the "addresses" table
        val id = db.insert("addresses", null, values)

        db.close()

        return id
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // If you need to upgrade the database, add code here
    }
}

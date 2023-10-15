package com.example.finalproject.Cart_Activity

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class CartDatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "CartDatabase.db"
        private const val DATABASE_VERSION = 1

        // Define the table and column names
        private const val TABLE_NAME = "cart_items"
        private const val COLUMN_ID = "id"
        private const val COLUMN_PRODUCT_NAME = "product_name"
        private const val COLUMN_PRICE = "price"
        private const val COLUMN_USER_ID = "user_id"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Create the table
        val createTableQuery = "CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_PRODUCT_NAME TEXT, " +
                "$COLUMN_PRICE REAL, " +
                "$COLUMN_USER_ID TEXT)"

        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database schema changes here if needed
    }

    fun insertCartItem(cartItem: Cart_Data_Class, user_id: String): Long {
        val values = ContentValues().apply {
            put(COLUMN_PRODUCT_NAME, cartItem.productName)
            put(COLUMN_PRICE, cartItem.price)
            put(COLUMN_USER_ID, user_id)
        }

        val db = writableDatabase
        return db.insert(TABLE_NAME, null, values)
    }

    @SuppressLint("Range")
    fun getAllCartItems(): List<Cart_Data_Class> {
        val cartItems = mutableListOf<Cart_Data_Class>()
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_NAME"

        val cursor = db.rawQuery(query, null)
        cursor.use {
            while (cursor.moveToNext()) {
                val id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
                val productName = cursor.getString(cursor.getColumnIndex(COLUMN_PRODUCT_NAME))
                val price = cursor.getDouble(cursor.getColumnIndex(COLUMN_PRICE))
                cartItems.add(Cart_Data_Class(id, productName, price, null, null))
            }
        }

        return cartItems
    }
}

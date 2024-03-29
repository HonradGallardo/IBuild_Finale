package com.example.finalproject.Cart

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
        private const val COLUMN_IMAGE_RES_ID = "image_res_id"
        private const val COLUMN_DESCRIPTION = "description"
        private const val COLUMN_QUANTITY = "quantity"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Create the table
        val createTableQuery = "CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_PRODUCT_NAME TEXT, " +
                "$COLUMN_PRICE REAL, " +
                "$COLUMN_IMAGE_RES_ID INTEGER, " +
                "$COLUMN_DESCRIPTION TEXT, "+
                "$COLUMN_QUANTITY)"

        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database schema changes here if needed
    }

    fun insertCartItem(cartItem: Cart_Data_Class): Long {
        val db = writableDatabase

        // Check if the item already exists in the cart
        val existingCartItem = getCartItem(cartItem.productId)

        return if (existingCartItem != null) {
            // If the item exists, update the quantity
            existingCartItem.quantity += 1
            updateCartItem(existingCartItem)
            existingCartItem.productId.toLong() // Return the ID of the existing item
        } else {
            // If the item doesn't exist, insert a new row
            val values = ContentValues().apply {
                put(COLUMN_ID, cartItem.productId)
                put(COLUMN_PRODUCT_NAME, cartItem.productName)
                put(COLUMN_PRICE, cartItem.price)
                put(COLUMN_IMAGE_RES_ID, cartItem.imageResource)
                put(COLUMN_DESCRIPTION, cartItem.description)
                put(COLUMN_QUANTITY, 1) // Default quantity is 1 when inserting a new item
            }

            db.insert(TABLE_NAME, null, values)
        }
    }

    fun deleteCartItem(productId: Int): Int {
        val db = writableDatabase
        val whereClause = "$COLUMN_ID = ?"
        val whereArgs = arrayOf(productId.toString())
        return db.delete(TABLE_NAME, whereClause, whereArgs)
    }
    fun deleteAllItems(): Int {
        val db = writableDatabase
        return db.delete(TABLE_NAME, null, null)
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
                val image = cursor.getInt(cursor.getColumnIndex(COLUMN_IMAGE_RES_ID))
                val description = cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION))
                val quantity = cursor.getInt(cursor.getColumnIndex(COLUMN_QUANTITY))
                cartItems.add(Cart_Data_Class(id, productName, price, description, image, quantity))
            }
        }

        return cartItems
    }

    fun updateCartItem(cartItem: Cart_Data_Class): Int {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_QUANTITY, cartItem.quantity)
        }

        val whereClause = "$COLUMN_ID = ?"
        val whereArgs = arrayOf(cartItem.productId.toString())

        return db.update(TABLE_NAME, values, whereClause, whereArgs)
    }

    @SuppressLint("Range")
    fun getCartItem(itemId: Int): Cart_Data_Class? {
        val db = readableDatabase
        val selection = "$COLUMN_ID = ?"
        val selectionArgs = arrayOf(itemId.toString())

        val cursor = db.query(
            TABLE_NAME,
            null,
            selection,
            selectionArgs,
            null,
            null,
            null
        )

        return if (cursor !=null && cursor.moveToFirst()) {
            val id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
            val productName = cursor.getString(cursor.getColumnIndex(COLUMN_PRODUCT_NAME))
            val price = cursor.getDouble(cursor.getColumnIndex(COLUMN_PRICE))
            val image = cursor.getInt(cursor.getColumnIndex(COLUMN_IMAGE_RES_ID))
            val description = cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION))
            val quantity = cursor.getInt(cursor.getColumnIndex(COLUMN_QUANTITY))
            cursor.close()

            Cart_Data_Class(id, productName, price, description, image, quantity)
        } else {
            null
        }
    }
}

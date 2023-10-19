package com.example.finalproject.Database

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DatabaseHelper(private val context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "UserDatabase.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "UserTable"
        private const val COLUMN_ID = "id"
        private const val COLUMN_USERNAME = "username"
        private const val COLUMN_EMAIL = "email"
        private const val COLUMN_PASSWORD = "password"
        private const val COLUMN_CONFIRM_PASSWORD = "confirm_password"

        private const val USERNAME_MIN_LENGTH = 5
        private const val USERNAME_MAX_LENGTH = 20
        private const val PASSWORD_MIN_LENGTH = 6
        private const val PASSWORD_MAX_LENGTH = 30
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableQuery = ("CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_USERNAME TEXT, " +
                "$COLUMN_EMAIL TEXT, " +  // Added email column
                "$COLUMN_PASSWORD TEXT, " +
                "$COLUMN_CONFIRM_PASSWORD TEXT)")  // Added confirm_password column
        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val dropTableQuery = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(dropTableQuery)
        onCreate(db)
    }

    fun insertUser(username: String, email: String, password: String): Long {
//        if (username.length < USERNAME_MIN_LENGTH || username.length > USERNAME_MAX_LENGTH) {
//            throw IllegalArgumentException("Username must be between $USERNAME_MIN_LENGTH and $USERNAME_MAX_LENGTH characters.")
//        }
//
//        if (password.length < PASSWORD_MIN_LENGTH || password.length > PASSWORD_MAX_LENGTH) {
//            throw IllegalArgumentException("Password must be between $PASSWORD_MIN_LENGTH and $PASSWORD_MAX_LENGTH characters.")
//        }

        val values = ContentValues().apply {
            put(COLUMN_USERNAME, username)
            put(COLUMN_EMAIL, email)
            put(COLUMN_PASSWORD, password)
        }

        val db = writableDatabase
        return db.insert(TABLE_NAME, null, values)
    }

    fun readUser(email: String, password: String): Boolean {
        val db = readableDatabase
        val selection = "$COLUMN_EMAIL = ? AND $COLUMN_PASSWORD = ?"
        val selectionArgs = arrayOf(email, password)
        val cursor = db.query(TABLE_NAME, null, selection, selectionArgs, null, null, null)

        val userExists = cursor.count > 0
        cursor.close()
        return userExists
    }


    fun updateUsername(userId: Long, newUsername: String) {
        val values = ContentValues().apply {
            put(COLUMN_USERNAME, newUsername)
        }

        val db = writableDatabase
        db.update(TABLE_NAME, values, "$COLUMN_ID = ?", arrayOf(userId.toString()))
    }

    fun updateEmail(userId: Long, newEmail: String) {
        val values = ContentValues().apply {
            put(COLUMN_EMAIL, newEmail)
        }

        val db = writableDatabase
        db.update(TABLE_NAME, values, "$COLUMN_ID = ?", arrayOf(userId.toString()))
    }

    fun updatePassword(userId: Long, newPassword: String) {
        val values = ContentValues().apply {
            put(COLUMN_PASSWORD, newPassword)
        }

        val db = writableDatabase
        db.update(TABLE_NAME, values, "$COLUMN_ID = ?", arrayOf(userId.toString()))
    }

    @SuppressLint("Range")
    fun getCurrentUserPassword(userId: Long): String? {
        val db = readableDatabase
        val selection = "$COLUMN_ID = ?"
        val selectionArgs = arrayOf(userId.toString())
        val columns = arrayOf(COLUMN_PASSWORD)

        val cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null)

        var currentPassword: String? = null // Initialize as null

        if (cursor.moveToFirst()) {
            currentPassword = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD))
        }

        cursor.close()

        // Debugging: Print the user ID and the retrieved current password
        Log.d("PasswordDebug", "User ID: $userId")
        Log.d("PasswordDebug", "User's Current Password: $currentPassword")

        return currentPassword
    }

}

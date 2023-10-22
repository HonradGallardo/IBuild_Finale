package com.example.finalproject.MyProfile.Address

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.google.gson.Gson

class Address_Adapter constructor(private val AddressActivity : Address, private var DataClass : List<Address_DataClass>) : RecyclerView.Adapter<Address_Adapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.address_layout, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataClass.size
    }

    fun updateData(newData: List<Address_DataClass>) {
        DataClass = newData
        notifyDataSetChanged()
    }

    var selectedPosition: Int = RecyclerView.NO_POSITION

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val address = DataClass[position]

        holder.FullName.text = address.FullName
        holder.PhoneNumber.text = address.PhoneNumber
        holder.CompleteAddress.text = address.CompleteAddress
        holder.PostalCode.text = address.PostalCode

        val isSelected = position == selectedPosition
        if (isSelected) {
            holder.SelectButton.text = "Default"

        } else {
            holder.SelectButton.text = "Select"
        }

        holder.SelectButton.setOnClickListener {
            // Handle the "Select" button click if needed
            selectedPosition = position
            notifyDataSetChanged()

            // Store the selected position in SharedPreferences
            val prefs = holder.itemView.context.getSharedPreferences("AddressPreferences", Context.MODE_PRIVATE)
            prefs.edit().putInt("selectedAddressPosition", position).apply()

            // Store the selected address data in SharedPreferences
            val gson = Gson()
            val addressJson = gson.toJson(address)
            prefs.edit().putString("selectedAddressData", addressJson).apply()

        }

        holder.trashIcon.setOnClickListener {
            // Remove the address from the database
            val dbHelper = AddressDatabaseHelper(holder.itemView.context)
            dbHelper.deleteAddress(address.id)

            // Update the DataClass list and notify the adapter of the data change
            DataClass = DataClass.toMutableList().apply { remove(address) }
            notifyDataSetChanged()

        }

    }



    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val FullName : TextView = itemView.findViewById(R.id.tv_FullName)
        val PhoneNumber : TextView = itemView.findViewById(R.id.tv_PhoneNumber)
        val CompleteAddress : TextView = itemView.findViewById(R.id.tv_CompleteAddress)
        val PostalCode : TextView = itemView.findViewById(R.id.tv_PostalCode)
        val SelectButton : TextView = itemView.findViewById(R.id.tv_SelectButton_address)
        val trashIcon : ImageView = itemView.findViewById(R.id.trashIcon_address)

    }

}
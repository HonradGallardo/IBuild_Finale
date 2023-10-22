package com.example.finalproject.MarketPlace_and_SellProduct

import android.net.Uri

data class MarketPlace_DataClass(val id: Long,
                                 val name: String?,
                                 val price: Double?,
                                 val category: String?,
                                 val condition: String?,
                                 val description: String?,
                                 val contact: String?,
                                 val imageUris: List<Uri>)

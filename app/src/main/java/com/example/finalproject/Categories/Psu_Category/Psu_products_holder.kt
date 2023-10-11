package com.example.finalproject.Categories.Psu_Category

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.rvHompagee

class Psu_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Psu_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Psu_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.psu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.psu_main_container) as RecyclerView


        cartAdapter = Psu_Adapter(this@Psu_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        hddProducts()

        backbt = findViewById(R.id.Psu_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun hddProducts() {
        var psuModels = Psu_Data_Class("EVGA SuperNOVA 650 G5","₱6,240.83", R.drawable.psu_img1)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair RM750x","₱7,943.03", R.drawable.psu_img2)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Focus GX-650","₱5,106.03", R.drawable.psu_img3)
        data.add(psuModels)

        psuModels = Psu_Data_Class("NZXT C750","₱5,673.43", R.drawable.psu_img4)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Thermaltake Toughpower Grand RGB 750W","₱5,389.73", R.drawable.psu_img5)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 750 G5","₱4,822.33", R.drawable.psu_img6)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair TX650M","₱11,563.61", R.drawable.psu_img7)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Prime Ultra 750W Titanium","₱10,240.00", R.drawable.psu_img8)
        data.add(psuModels)

        psuModels = Psu_Data_Class("be quiet! Straight Power 11 650W","₱7,086.83", R.drawable.psu_img9)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair SF750","₱10,496.33", R.drawable.psu_img10)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 850 G3","₱10,105.96", R.drawable.psu_img11)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Cooler Master MWE Gold 650","₱4,850.00", R.drawable.psu_img12)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SeaSonic S12III 550W","₱3,403.83", R.drawable.psu_img13)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA B5 550W","₱5,106.03", R.drawable.psu_img14)
        data.add(psuModels)

        psuModels = Psu_Data_Class("FSP Dagger 600W","₱6,240.83", R.drawable.psu_img15)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SilverStone Technology SST-ST60F-TI","₱11,346.87", R.drawable.psu_img16)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair CV550","₱2,899.00", R.drawable.psu_img17)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Seasonic SSR-600TL","₱10,780.60", R.drawable.psu_img18)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Cooler Master MasterWatt 650","₱3,120.13", R.drawable.psu_img19)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Antec Earthwatts Gold Pro 750W","₱13,613.63", R.drawable.psu_img20)
        data.add(psuModels)


        cartAdapter!!.notifyDataSetChanged()
    }

}

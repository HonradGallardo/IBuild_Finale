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
import java.util.Collections

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
        var psuModels = Psu_Data_Class("EVGA SuperNOVA 650 G5","₱90,655.31", R.drawable.psu_img1_evga_supernova650_g5)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair RM750x","₱39,950.00", R.drawable.psu_img2_corsair_rm750x)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Focus GX-650","₱39,950.00", R.drawable.psu_img3_seasonic_focus_gx_650)
        data.add(psuModels)

        psuModels = Psu_Data_Class("NZXT C750","₱39,950.00", R.drawable.psu_img4_nzxt_c750)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Thermaltake Toughpower Grand RGB 750W","₱39,950.00", R.drawable.psu_img5_thermaltake_toughpower_grand_rgb_750w)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 750 G5","₱39,950.00", R.drawable.psu_img6_evga_supernova_750_g5)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair TX650M","₱39,950.00", R.drawable.psu_img7_corsair_tx650m)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Seasonic Prime Ultra 750W Titanium","₱39,950.00", R.drawable.psu_img8_seasonic_prime_ultra_750w_titanium)
        data.add(psuModels)

        psuModels = Psu_Data_Class("be quiet! Straight Power 11 650W","₱39,950.00", R.drawable.psu_img9_be_quiet_straight_power_11_650w)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair SF750","₱39,950.00", R.drawable.psu_img10_corsair_sf750)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA SuperNOVA 850 G3","₱39,950.00", R.drawable.psu_img11_evga_supernova_850_g3)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Cooler Master MWE Gold 650","₱39,950.00", R.drawable.psu_img12_cooler_master_mwe_gold_650)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SeaSonic S12III 550W","₱39,950.00", R.drawable.psu_img13_seasonic_s12iii_550w)
        data.add(psuModels)

        psuModels = Psu_Data_Class("EVGA B5 550W","₱39,950.00", R.drawable.psu_img14_evga_b5_550w)
        data.add(psuModels)

        psuModels = Psu_Data_Class("FSP Dagger 600W","₱39,950.00", R.drawable.psu_img15_fsp_dagger_600w)
        data.add(psuModels)

        psuModels = Psu_Data_Class("SilverStone Technology SST-ST60F-TI","₱39,950.00", R.drawable.psu_img16_silverstone_technology_sst_st60f_ti)
        data.add(psuModels)

        psuModels = Psu_Data_Class("Corsair CV550","₱39,950.00", R.drawable.psu_img17_corsair_cv550)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Seasonic SSR-600TL","₱39,950.00", R.drawable.psu_img18_seasonic_ssr_600tl)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Cooler Master MasterWatt 650","₱39,950.00", R.drawable.psu_img19_cooler_master_masterwatt_650)
        data.add(psuModels)


        psuModels = Psu_Data_Class("Antec Earthwatts Gold Pro 750W","₱39,950.00", R.drawable.psu_img20_antec_earthwatts_gold_pro_750w)
        data.add(psuModels)


        cartAdapter!!.notifyDataSetChanged()
    }

}

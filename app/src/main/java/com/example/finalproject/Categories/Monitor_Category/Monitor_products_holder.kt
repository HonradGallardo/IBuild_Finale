package com.example.finalproject.Categories.Monitor_Category

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

class Monitor_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Monitor_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Monitor_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitor_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.monitor_main_container) as RecyclerView


        cartAdapter = Monitor_Adapter(this@Monitor_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        monitorProducts()

        backbt = findViewById(R.id.Monitor_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun monitorProducts() {
        var monitorModels = Monitor_Data_Class("Dell S2417DG","₱90,655.31", R.drawable.monitor_img1_dell_s2417dg)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VG279Q","₱39,950.00", R.drawable.monitor_img2_asus_vg279q)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer Predator XB271HU","₱39,950.00", R.drawable.monitor_img3_acer_predator_xb271hu)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 27GL83A-B","₱39,950.00", R.drawable.monitor_img4__lg27gl83a_b)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("MSI Optix MAG271CQR","₱39,950.00", R.drawable.monitor_img5_msi_optix_mag271cqr)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Samsung Odyssey G7","₱39,950.00", R.drawable.monitor_img6_samsung_odyssey_g7)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS ROG Swift PG279Q","₱39,950.00", R.drawable.monitor_img7_asus_rog_swift_pg279q)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ViewSonic XG2402","₱39,950.00", R.drawable.monitor_img8_viewsonic_xg2402)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("AOC CQ32G1","₱39,950.00", R.drawable.monitor_img9_aoc_cq32g1)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Alienware AW3420DW","₱39,950.00", R.drawable.monitor_img10_alienware_aw3420dw)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("BenQ EX2780Q","₱39,950.00", R.drawable.monitor_img11_benq_ex2780q)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS TUF VG27AQ","₱39,950.00", R.drawable.monitor_img12_asus_tuf_vg27aq)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Pixio PX329","₱39,950.00", R.drawable.monitor_img13_pixio_px329)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 34GN850-B","₱39,950.00", R.drawable.monitor_img14_lg_34gn850_b)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer Nitro VG240Y Pbiip","₱39,950.00", R.drawable.monitor_img15_acer_nitro_vg240y_pbiip)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VG245H","₱39,950.00", R.drawable.monitor_img16_asus_vg245h)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Dell Alienware AW3418DW","₱39,950.00", R.drawable.monitor_img17_dell_alienware_aw3418dw)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Samsung CRG9","₱39,950.00", R.drawable.monitor_img18_samsung_crg9)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("MSI Optix MPG341CQR","₱39,950.00", R.drawable.monitor_img19_msi_optix_mpg341cqr)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ViewSonic Elite XG240R","₱39,950.00", R.drawable.monitor_img20_viewsonic_elite_xg240r)
        data.add(monitorModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

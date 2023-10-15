package com.example.finalproject.Categories.Ssd_Category

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Categories.MoBo_Category.Mobo_Data_Class
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no10_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no11_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no12_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no13_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no14_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no15_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no16_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no17_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no18_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no19_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no1_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no20_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no2_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no3_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no4_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no5_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no6_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no7_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no8_info
import com.example.finalproject.Products.Ssd_products_info.Ssd_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Ssd_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Ssd_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Ssd_Data_Class>()

    private lateinit var searchView : SearchView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssd_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.ssd_main_container) as RecyclerView

        cartAdapter = Ssd_Adapter(this@Ssd_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        searchView = findViewById(R.id.cpu_category_sv)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        ssdProducts()
        data.shuffle()

        backbt = findViewById(R.id.Ssd_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivityWithAnimation(intent)
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }
    private fun filterList(query:String?){
        if (query != null){
            val filteredList = ArrayList<Ssd_Data_Class>()
            for (i in data){
                if (i.ssdModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.ssdPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun ssdProducts() {
        var ssdModels =
            Ssd_Data_Class("Samsung 860 EVO", 4160.00, R.drawable.ssd_img1, Ssd_no1_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Crucial MX500", 2799.00, R.drawable.ssd_img2, Ssd_no2_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("WD Blue 3D NAND", 5690.00, R.drawable.ssd_img3, Ssd_no3_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Sandisk Ultra 3D SSD", 3450.00, R.drawable.ssd_img4, Ssd_no4_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Kingston A2000", 3795.00, R.drawable.ssd_img5, Ssd_no5_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("ADATA SU800", 4999.00, R.drawable.ssd_img6, Ssd_no6_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("SK hynix Gold S31", 3000.00, R.drawable.ssd_img7, Ssd_no7_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Seagate Barracuda SSD", 6716.00, R.drawable.ssd_img8, Ssd_no8_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Toshiba TR200", 2799.00, R.drawable.ssd_img9, Ssd_no9_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Teamgroup GX2", 3199.00, R.drawable.ssd_img10, Ssd_no10_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Samsung 970 EVO Plus", 8550.00, R.drawable.ssd_img11, Ssd_no11_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("WD Black SN750 NVMe SSD", 5655.00, R.drawable.ssd_img12, Ssd_no12_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Crucial P1 NVMe SSD", 5951.11, R.drawable.ssd_img13, Ssd_no13_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Intel 660p NVMe SSD", 10740.86, R.drawable.ssd_img14, Ssd_no14_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Adata XPG SX8200 Pro NVMe SSD", 6234.23, R.drawable.ssd_img15, Ssd_no15_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("Corsair Force MP510 NVMe SSD", 3695.00, R.drawable.ssd_img16, Ssd_no16_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Kingston A2000 NVMe SSD", 3695.00, R.drawable.ssd_img17, Ssd_no17_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Sabrent Rocket NVMe SSD", 3695.00, R.drawable.ssd_img18, Ssd_no18_info::class.java)
        data.add(ssdModels)

        ssdModels = Ssd_Data_Class("HP EX920 NVMe SSD", 3695.00, R.drawable.ssd_img19, Ssd_no19_info::class.java)
        data.add(ssdModels)

        ssdModels =
            Ssd_Data_Class("Toshiba XG5-P NVMe SSD", 3695.00, R.drawable.ssd_img20, Ssd_no20_info::class.java)
        data.add(ssdModels)

        cartAdapter!!.notifyDataSetChanged()
    }
}
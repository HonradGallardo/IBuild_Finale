package com.example.finalproject.Categories.Monitor_Category

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Categories.MoBo_Category.Mobo_Data_Class
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no10_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no11_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no12_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no13_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no14_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no15_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no16_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no17_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no18_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no19_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no1_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no20_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no2_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no3_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no4_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no5_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no6_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no7_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no8_info
import com.example.finalproject.Products.Monitor_products_info.Monitor_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Monitor_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Monitor_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Monitor_Data_Class>()

    private lateinit var searchView : SearchView
    private lateinit var caseCart : ImageView
    private lateinit var sortUp: ImageView
    private lateinit var sortDown : ImageView


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

        monitorProducts()
        data.shuffle()

        backbt = findViewById(R.id.Monitor_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
        }
        caseCart = findViewById(R.id.monitor_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Monitor_product_holder")
            startActivity(int)
            finish()
        }
        sortUp = findViewById(R.id.sort_up)
        sortDown = findViewById(R.id.sort_down)


        sortUp.setOnClickListener {
            sortDataDescending()
        }
        sortDown.setOnClickListener {
            sortDataAscending()
        }
    }
    private fun sortDataDescending() {
        data.sortByDescending { it.monitorPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    private fun sortDataAscending() {
        data.sortBy { it.monitorPricet }
        cartAdapter?.setFilteredListCpu(data)
    }

    @SuppressLint("MissingSuperCall")
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
            val filteredList = ArrayList<Monitor_Data_Class>()
            for (i in data){
                if (i.monitorModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.monitorPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(
                        Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun monitorProducts() {
        var monitorModels = Monitor_Data_Class("AOC CQ32G1 32 inch 144Hz Monitor",24337.17, R.drawable.monitor_img1, Monitor_no1_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ViewSonic VX3276-MHD 32 inch 6oHz Monitor",11969.46, R.drawable.monitor_img2, Monitor_no2_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 24MP88HV-S 24 inch 60Hz Monitor",10670.35, R.drawable.monitor_info3_img2, Monitor_no3_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VZ239H-W 23 inch 60Hz Monitor",7318.17, R.drawable.monitor_img4, Monitor_no4_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Dell S2418H 23.8 inch 60Hz Monitor",13615.20, R.drawable.monitor_img5, Monitor_no5_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer R240HY 23.8 inch 60Hz Monitor",3970.53, R.drawable.monitor_img6, Monitor_no6_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Sceptre E275W-19203R 27 inch 75Hz Monitor",17018.43, R.drawable.monitor_img7, Monitor_no7_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("HP 24mh 24 inch 75Hz Monitor",7091.25, R.drawable.monitor_img8, Monitor_no8_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("BenQ GW2480 24 inch 75Hz Monitor",11345.43, R.drawable.monitor_img9, Monitor_no9_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Philips 246E9QDSB 24 inch 60Hz Monitor",5673.00, R.drawable.monitor_img10, Monitor_no10_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("HP 22yh 22 inch 60Hz Monitor",2855.00, R.drawable.monitor_img11, Monitor_no11_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("ASUS VS239H-P 23 inch 60Hz Monitor",7374.90, R.drawable.monitor_img12, Monitor_no12_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Dell SE2416HX 23.8 inch 60Hz Monitor",6807.60, R.drawable.monitor_img13, Monitor_no13_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("HP Pavilion 22cwa 22 inch 60Hz Monitor",4537.83, R.drawable.monitor_img14, Monitor_no14_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("BenQ GW2270 22 inch 60Hz Monitor",4875.94, R.drawable.monitor_img15, Monitor_no15_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Sceptre E248W-19203R 24 inch 75Hz Monitor",5104.00, R.drawable.monitor_img16, Monitor_no16_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("LG 24MK400H-B 23.8 inch 75Hz Monitor",6523.95, R.drawable.monitor_img17, Monitor_no17_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("MSI Optix MAG241C 24 inch 144Hz Monitor",11912.73, R.drawable.monitor_img18, Monitor_no18_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Samsung SF350 24 inch 60Hz Monitor",8508.93, R.drawable.monitor_img19, Monitor_no19_info::class.java)
        data.add(monitorModels)

        monitorModels = Monitor_Data_Class("Acer SB220Q 22 inch 75Hz Monitor",5105.70, R.drawable.monitor_img20, Monitor_no20_info::class.java)
        data.add(monitorModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

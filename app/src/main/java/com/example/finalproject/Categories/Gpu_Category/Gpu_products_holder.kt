package com.example.finalproject.Categories.Gpu_Category

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Gpu_products_info.Gpu_no10_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no11_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no12_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no13_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no14_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no15_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no16_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no17_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no18_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no19_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no20_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no2_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no3_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no4_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no5_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no6_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no7_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no8_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Gpu_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Gpu_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Gpu_Data_Class>()

    private lateinit var searchView : SearchView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gpu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Gpu_main_container) as RecyclerView


        cartAdapter = Gpu_Adapter(this@Gpu_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        searchView = findViewById(R.id.cpu_category_sv)
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        gpuProducts()
        data.shuffle()

        backbt = findViewById(R.id.Gpu_Back_to_Home)
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
            val filteredList = ArrayList<Gpu_Data_Class>()
            for (i in data){
                if (i.gpuModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.gpuPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }

    private fun gpuProducts() {
        var gpuModels = Gpu_Data_Class("GIGABYTE GTX 1660 SUPER GAMING OC GPU",15500.00, R.drawable.gpu_img1, Gpu_no1_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 5600 XT MECH OC GPU",23750.00, R.drawable.gpu_img2, Gpu_no2_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3060 GAMING OC GPU",22950.00, R.drawable.gpu_img3, Gpu_no3_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 5700 XT MECH OC GPU",24461.00, R.drawable.gpu_img4, Gpu_no4_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3070 GAMING OC GPU",29500.00, R.drawable.gpu_img5, Gpu_no5_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS DUAL RX 6600 XT OC GPU",19306.00, R.drawable.gpu_img6, Gpu_no6_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("PNY GTX 1050 GPU",12945.00, R.drawable.gpu_img7, Gpu_no7_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI RX 580 GAMING X 8 GB GPU",12130.00, R.drawable.gpu_img8, Gpu_no8_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("NVIDIA GeForce RTX 3080 GPU",29500.00, R.drawable.gpu_img9, Gpu_no9_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RX 6700 XT GAMING OC GPU",23234.00, R.drawable.gpu_img10, Gpu_no10_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS TUF GTX 1660 Ti GAMING OC GPU",16999.00, R.drawable.gpu_img11, Gpu_no11_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASRock RX 5500 XT 8 GB BIOS GPU",10960.00, R.drawable.gpu_img12, Gpu_no12_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS ROG STRIX RTX 3050 GAMING OC GPU",15000.00, R.drawable.gpu_img13, Gpu_no13_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RX 590 GAMING Rev. 1.0 GPU",15500.00, R.drawable.gpu_img14, Gpu_no14_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("MSI GTX 1650 GAMING X GPU",12320.00, R.drawable.gpu_img15, Gpu_no15_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASUS RX 6800 GPU",33681.00, R.drawable.gpu_img16, Gpu_no16_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE GTX 1660 OC GPU",11500.00, R.drawable.gpu_img17, Gpu_no17_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("ASRock Phantom Gaming X Vega 56 GPU",25199.50, R.drawable.gpu_img18, Gpu_no18_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE RTX 3060 Ti EAGLE OC GPU",28990.00, R.drawable.gpu_img19, Gpu_no19_info::class.java)
        data.add(gpuModels)

        gpuModels = Gpu_Data_Class("GIGABYTE AORUS RX 6700 XT ELITE GPU",29950.00, R.drawable.gpu_img20, Gpu_no20_info::class.java)
        data.add(gpuModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

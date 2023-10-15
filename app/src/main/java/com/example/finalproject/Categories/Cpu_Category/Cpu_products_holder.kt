package com.example.finalproject.Categories.Cpu_Category

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Products.Cpu_products_info.Cpu_no10_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no11_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no12_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no13_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no14_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no15_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no16_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no17_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no19_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no1_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no20_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no2_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no3_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no4_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no5_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no6_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no7_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no8_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no9_info
import com.example.finalproject.Products.Gpu_products_info.Gpu_no1_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Cpu_products_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cartAdapter: Cpu_Adapter? = null
    private lateinit var backbt: ImageView
    private var data = mutableListOf<Cpu_Data_Class>()

    //SEARCH BAR
    private lateinit var searchView : SearchView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpu_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Cpu_main_container) as RecyclerView

        cartAdapter = Cpu_Adapter(this@Cpu_products_holder, data)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)


        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter



        //SEARCH BAR
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

        //BACK FUNCTION
        cpuProducts()
        data.shuffle()

        backbt = findViewById(R.id.Cpu_Back_to_Home)
        backbt.setOnClickListener{
            val intent = Intent(this, rvHompagee::class.java)
            startActivityWithAnimation(intent)
            finish()
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

    //SEARCH BAR
    private fun filterList(query:String?){
        if (query != null){
            val filteredList = ArrayList<Cpu_Data_Class>()
            for (i in data){
                if (i.cpuModelt.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.cpuPricet.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)))
                    filteredList.add(i)
            }
            cartAdapter?.setFilteredListCpu(filteredList)
        }
    }



    private fun cpuProducts() {
        var cpuModels = Cpu_Data_Class("AMD RYZEN 5 5600", 8150.00, R.drawable.cpu_img1, Cpu_no1_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i5-10400", 8950.00, R.drawable.cpu_img2, Cpu_no2_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i3-10100", 8499.00, R.drawable.cpu_img3, Cpu_no3_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD RYZEN 5 3400G", 4350.00, R.drawable.cpu_img4, Cpu_no4_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD RYZEN 5 5600G", 8699.00, R.drawable.cpu_img5, Cpu_no5_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Pentium Gold G6400", 4199.00, R.drawable.cpu_img6, Cpu_no6_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-11400", 7995.00, R.drawable.cpu_img7, Cpu_no7_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD RYZEN 5 3600", 4151.00, R.drawable.cpu_img8, Cpu_no8_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD RYZEN 3 3200G", 4999.99, R.drawable.cpu_img9, Cpu_no9_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i3-10320", 10795.00, R.drawable.cpu_img10, Cpu_no10_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-9400F", 6088.00, R.drawable.cpu_img11, Cpu_no11_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 3 3100", 7499.00, R.drawable.cpu_img12, Cpu_no12_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD Ryzen 7 2700", 12169.00,R.drawable.cpu_img13, Cpu_no13_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i3-9100F", 8358.00, R.drawable.cpu_img14, Cpu_no14_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i5-9400", 9399.00, R.drawable.cpu_img15, Cpu_no15_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 5 2600", 8199.00, R.drawable.cpu_img16, Cpu_no16_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("AMD Ryzen 5 5600x", 8799.00, R.drawable.cpu_img17, Cpu_no17_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("Intel Core i5-10500", 12299.00, R.drawable.cpu_img18, Cpu_no16_info::class.java)
        data.add(cpuModels)
        cpuModels = Cpu_Data_Class("Intel Core i3-8100", 9699.03, R.drawable.cpu_img19, Cpu_no19_info::class.java)
        data.add(cpuModels)

        cpuModels = Cpu_Data_Class("AMD Ryzen 3 3300X", 6988.00, R.drawable.cpu_img20, Cpu_no20_info::class.java)
        data.add(cpuModels)



        cartAdapter!!.notifyDataSetChanged()
    }
}

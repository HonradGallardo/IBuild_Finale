package com.example.finalproject

import com.example.finalproject.Adapters.HomepageCategoriesAdapter
import com.example.finalproject.Adapters.RecyclerViewApater
import com.example.finalproject.DataClass.HomepageCategoriesDataClass
import com.example.finalproject.DataClass.Product
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.AmdBuild.amd_build
import com.example.finalproject.Cart.Cart
import com.example.finalproject.IntelBuild.IntelBuild
import com.example.finalproject.MyProfile.MyProfile
import com.example.finalproject.Products.Case_products_info.Case_no10_info
import com.example.finalproject.Products.Case_products_info.Case_no1_info
import com.example.finalproject.Products.Case_products_info.Case_no2_info
import com.example.finalproject.Products.Case_products_info.Case_no4_info
import com.example.finalproject.Products.Case_products_info.Case_no5_info
import com.example.finalproject.Products.Case_products_info.Case_no6_info
import com.example.finalproject.Products.Case_products_info.Case_no7_info
import com.example.finalproject.Products.Case_products_info.Case_no8_info
import com.example.finalproject.Products.Case_products_info.Case_no9_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no10_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no11_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no12_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no13_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no14_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no15_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no16_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no17_info
import com.example.finalproject.Products.Cpu_products_info.Cpu_no18_info
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
import com.example.finalproject.Products.Hdd_products_info.Hdd_no1_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no2_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no3_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no4_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no5_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no6_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no7_info
import com.example.finalproject.Products.Hdd_products_info.Hdd_no8_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no10_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no11_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no12_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no13_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no14_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no15_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no16_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no17_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no18_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no19_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no1_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no20_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no2_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no3_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no4_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no5_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no6_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no7_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no8_info
import com.example.finalproject.Products.MoBo_products_info.Mobo_no9_info
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
import com.example.finalproject.Products.Psu_products_info.Psu_no10_info
import com.example.finalproject.Products.Psu_products_info.Psu_no11_info
import com.example.finalproject.Products.Psu_products_info.Psu_no12_info
import com.example.finalproject.Products.Psu_products_info.Psu_no13_info
import com.example.finalproject.Products.Psu_products_info.Psu_no14_info
import com.example.finalproject.Products.Psu_products_info.Psu_no15_info
import com.example.finalproject.Products.Psu_products_info.Psu_no16_info
import com.example.finalproject.Products.Psu_products_info.Psu_no17_info
import com.example.finalproject.Products.Psu_products_info.Psu_no18_info
import com.example.finalproject.Products.Psu_products_info.Psu_no19_info
import com.example.finalproject.Products.Psu_products_info.Psu_no1_info
import com.example.finalproject.Products.Psu_products_info.Psu_no20_info
import com.example.finalproject.Products.Psu_products_info.Psu_no2_info
import com.example.finalproject.Products.Psu_products_info.Psu_no3_info
import com.example.finalproject.Products.Psu_products_info.Psu_no4_info
import com.example.finalproject.Products.Psu_products_info.Psu_no5_info
import com.example.finalproject.Products.Psu_products_info.Psu_no6_info
import com.example.finalproject.Products.Psu_products_info.Psu_no7_info
import com.example.finalproject.Products.Psu_products_info.Psu_no8_info
import com.example.finalproject.Products.Psu_products_info.Psu_no9_info
import com.example.finalproject.Products.Ram_products_info.Ram_no10_info
import com.example.finalproject.Products.Ram_products_info.Ram_no11_info
import com.example.finalproject.Products.Ram_products_info.Ram_no12_info
import com.example.finalproject.Products.Ram_products_info.Ram_no13_info
import com.example.finalproject.Products.Ram_products_info.Ram_no14_info
import com.example.finalproject.Products.Ram_products_info.Ram_no15_info
import com.example.finalproject.Products.Ram_products_info.Ram_no16_info
import com.example.finalproject.Products.Ram_products_info.Ram_no17_info
import com.example.finalproject.Products.Ram_products_info.Ram_no18_info
import com.example.finalproject.Products.Ram_products_info.Ram_no19_info
import com.example.finalproject.Products.Ram_products_info.Ram_no1_info
import com.example.finalproject.Products.Ram_products_info.Ram_no20_info
import com.example.finalproject.Products.Ram_products_info.Ram_no2_info
import com.example.finalproject.Products.Ram_products_info.Ram_no3_info
import com.example.finalproject.Products.Ram_products_info.Ram_no4_info
import com.example.finalproject.Products.Ram_products_info.Ram_no5_info
import com.example.finalproject.Products.Ram_products_info.Ram_no6_info
import com.example.finalproject.Products.Ram_products_info.Ram_no7_info
import com.example.finalproject.Products.Ram_products_info.Ram_no8_info
import com.example.finalproject.Products.Ram_products_info.Ram_no9_info
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
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Locale

class rvHompagee : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerViewAdapter : RecyclerViewApater
    private var productList = mutableListOf<Product>()
    private lateinit var amdBuilder : ImageView
    private lateinit var  intelbuild : ImageView

    private lateinit var homepagecategoriesRecyclerView : RecyclerView
    private var categories_dataClass = mutableListOf<HomepageCategoriesDataClass>()
    private lateinit var HomepageCategoriesAdapter : HomepageCategoriesAdapter

    private lateinit var bottomNaviation : BottomNavigationView
    private lateinit var searchView : SearchView

    private lateinit var Cart_hompage : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_hompagee)

        searchView = findViewById(R.id.sv_search_homepage)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        Cart_hompage = findViewById(R.id.img_cart_homepage)
        Cart_hompage.setOnClickListener {
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "rvHomepage")
            startActivity(int)
            finish()
        }

        categories_dataClass = ArrayList()

        homepagecategoriesRecyclerView = findViewById(R.id.recyclerView_Categories) as RecyclerView
        HomepageCategoriesAdapter = HomepageCategoriesAdapter(this@rvHompagee, categories_dataClass)
        val LayoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        homepagecategoriesRecyclerView!!.layoutManager = LayoutManager
        homepagecategoriesRecyclerView!!.adapter = HomepageCategoriesAdapter


        HomepageCategoriesImages()

        amdBuilder = findViewById(R.id.img_amd_builder)

        intelbuild = findViewById(R.id.img_intel_builder)

        bottomNaviation = findViewById(R.id.btnav_bottomNavigation)

        productList = ArrayList()

        recyclerView = findViewById(R.id.mainContainer) as RecyclerView

        recyclerViewAdapter = RecyclerViewApater(this@rvHompagee, productList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2,)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewAdapter

        prepareProductList()


        productList.shuffle()




        bottomNaviation.setOnItemSelectedListener {
            when(it.itemId){
//                R.id.home -> {val intent = Intent(this, rvHompagee::class.java)
//                    startActivity(intent)
//                    finish()}

//                R.id.marketplace ->{val intent = Intent(this, Marketplace::class.java)
//                startActivity(intent)
//                finish()}

                R.id.me_profile -> {val  intent = Intent(this, MyProfile::class.java)
                    startActivity(intent)
                    finish()}
            }
            true
        }



        amdBuilder.setOnClickListener {
            val int = Intent(this, amd_build::class.java)
            startActivity(int)
        }
        intelbuild.setOnClickListener {
            val int = Intent(this, IntelBuild::class.java)
            startActivity(int)
        }
    }


    private fun filterList(query : String?){
        if (query != null){
            val filteredList = ArrayList<Product>()
            for (i in productList){
                if (i.title.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))) {
                    filteredList.add(i)
                }else if (i.price.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }
            }
            recyclerViewAdapter?.setFilteredListrvHomepage(filteredList)
        }

    }


    private fun prepareProductList(){

        //CPU PRODUCTS

        var shopProducts = Product("AMD RYZEN 5 5600 cpu", 8150.00, R.drawable.cpu_img1, Cpu_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i5-10400 cpu", 8950.00, R.drawable.cpu_img2, Cpu_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i3-10100 cpu", 8499.00, R.drawable.cpu_img3, Cpu_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD RYZEN 5 3400G cpu", 4350.00, R.drawable.cpu_img4, Cpu_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD RYZEN 5 5600G cpu", 8699.00, R.drawable.cpu_img5, Cpu_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Pentium Gold G6400 cpu", 4199.00, R.drawable.cpu_img6, Cpu_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i5-11400 cpu", 7995.00, R.drawable.cpu_img7, Cpu_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD RYZEN 5 3600 cpu", 4151.00, R.drawable.cpu_img8, Cpu_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD RYZEN 3 3200G cpu", 4999.99, R.drawable.cpu_img9, Cpu_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i3-10320 cpu", 10795.00, R.drawable.cpu_img10, Cpu_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i5-9400F cpu", 6088.00, R.drawable.cpu_img11, Cpu_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD Ryzen 3 3100 cpu", 7499.00, R.drawable.cpu_img12, Cpu_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD Ryzen 7 2700 cpu", 12169.00,R.drawable.cpu_img13, Cpu_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i3-9100F cpu", 8358.00, R.drawable.cpu_img14, Cpu_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i5-9400 cpu", 9399.00, R.drawable.cpu_img15, Cpu_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD Ryzen 5 2600 cpu", 8199.00, R.drawable.cpu_img16, Cpu_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD Ryzen 5 5600x cpu", 8799.00, R.drawable.cpu_img17, Cpu_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i5-10500 cpu", 12299.00, R.drawable.cpu_img18, Cpu_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel Core i3-8100 cpu", 9699.03, R.drawable.cpu_img19, Cpu_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("AMD Ryzen 3 3300X cpu", 6988.00, R.drawable.cpu_img20, Cpu_no20_info::class.java)



        //GPU PRODUCTS


        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE GTX 1660 SUPER GAMING OC GPU",15500.00, R.drawable.gpu_img1, Gpu_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI RX 5600 XT MECH OC GPU",23750.00, R.drawable.gpu_img2, Gpu_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE RTX 3060 GAMING OC GPU",22950.00, R.drawable.gpu_img3, Gpu_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI RX 5700 XT MECH OC GPU",24461.00, R.drawable.gpu_img4, Gpu_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE RTX 3070 GAMING OC GPU",29500.00, R.drawable.gpu_img5, Gpu_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS DUAL RX 6600 XT OC GPU",19306.00, R.drawable.gpu_img6, Gpu_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("PNY GTX 1050 GPU",12945.00, R.drawable.gpu_img7, Gpu_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI RX 580 GAMING X 8 GB GPU",12130.00, R.drawable.gpu_img8, Gpu_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("NVIDIA GeForce RTX 3080 GPU",29500.00, R.drawable.gpu_img9, Gpu_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE RX 6700 XT GAMING OC GPU",23234.00, R.drawable.gpu_img10, Gpu_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS TUF GTX 1660 Ti GAMING OC GPU",16999.00, R.drawable.gpu_img11, Gpu_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASRock RX 5500 XT 8 GB BIOS GPU",10960.00, R.drawable.gpu_img12, Gpu_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS ROG STRIX RTX 3050 GAMING OC GPU",15000.00, R.drawable.gpu_img13, Gpu_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE RX 590 GAMING Rev. 1.0 GPU",15500.00, R.drawable.gpu_img14, Gpu_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI GTX 1650 GAMING X GPU",12320.00, R.drawable.gpu_img15, Gpu_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS RX 6800 GPU",33681.00, R.drawable.gpu_img16, Gpu_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE GTX 1660 OC GPU",11500.00, R.drawable.gpu_img17, Gpu_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASRock Phantom Gaming X Vega 56 GPU",25199.50, R.drawable.gpu_img18, Gpu_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE RTX 3060 Ti EAGLE OC GPU",28990.00, R.drawable.gpu_img19, Gpu_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE AORUS RX 6700 XT ELITE GPU",29950.00, R.drawable.gpu_img20, Gpu_no20_info::class.java)




        //HDD PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("Seagate FireCuda HDD 2TB HDD",6190.00, R.drawable.hdd_img1, Hdd_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("WD Black HDD 1TB HDD",1699.00, R.drawable.hdd_img2, Hdd_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("WD Blue WD10EZRZ HDD 1TB HDD",1594.00, R.drawable.hdd_img3, Hdd_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("WD Red Pro WD4003FFBX HDD 4TB HDD",2450.00, R.drawable.hdd_img4, Hdd_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seagate SkyHawk HDD 1TB HDD",5195.00, R.drawable.hdd_img5, Hdd_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seagate BarraCuda HDD 1TB HDD",1400.00, R.drawable.hdd_img6, Hdd_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Toshiba P300 HDD 1TB HDD",2990.00, R.drawable.hdd_img7, Hdd_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seagate Exos 2TB HDD",3379.00, R.drawable.hdd_img8, Hdd_no8_info::class.java)




        //MOTHERBOARD PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("ASRock B450M pro4 Micro-ATX(mATX)",7850.00, R.drawable.mobo_img1, Mobo_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI B450M Mortar MAX Micro ATX(mATX) motherboard",5565.00, R.drawable.mobo_img2, Mobo_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASRock B450M STEEL LEGEND Micro ATX(mATX) motherboard",5650.00, R.drawable.mobo_img3, Mobo_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS TUF B450M-Plus Gaming Micro ATX(mATX) motherboard",5999.00, R.drawable.mobo_img4, Mobo_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Gigabyte B450 AORUS M Micro ATX(mATX) motherboard",4999.00, R.drawable.mobo_img5, Mobo_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS Prime B460M-A Micro ATX(mATX) motherboard",5875.00, R.drawable.mobo_img6, Mobo_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI MAG B460M Mortar Micro ATX(mATX) motherboard",6499.00, R.drawable.mobo_img7, Mobo_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Gigabyte B460M DS3H Micro ATX(mATX) motherboard",5499.00, R.drawable.mobo_img8, Mobo_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASRock B460M Pro4 Micro ATX(mATX) motherboard",5450.00, R.drawable.mobo_img9, Mobo_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS ROG Strix B460-G Gaming Micro ATX(mATX) motherboard",5090.00, R.drawable.mobo_img10, Mobo_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS ROG Strix X570-E Gaming ATX motherboard",19260.00, R.drawable.mobo_img11, Mobo_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI MPG B550 Gaming Edge WiFi ATX motherboard",9950.00, R.drawable.mobo_img12, Mobo_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Gigabyte X570 AORUS Elite ATX motherboard",9458.00, R.drawable.mobo_img13, Mobo_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASRock B450 Pro4 ATX motherboard",5915.00, R.drawable.mobo_img14, Mobo_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS Prime X570-Pro ATX motherboard",14490.00, R.drawable.mobo_img15, Mobo_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS ROG Strix Z590-E Gaming WiFi 6E ATX motherboard",19490.00, R.drawable.mobo_img16, Mobo_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GIGABYTE Z590 AORUS PRO AX",10690.00, R.drawable.mobo_img17,Mobo_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI MPG B550 Gaming Edge WiFi",9600.00, R.drawable.mobo_img18,Mobo_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI B550-A PRO ATX",7295.00, R.drawable.mobo_img19, Mobo_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("EVGA Z590 FTW WiFi",7558.39, R.drawable.mobo_img20, Mobo_no20_info::class.java)




        //MONITOR PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("AOC CQ32G1 32 inch 144Hz Monitor",24337.17, R.drawable.monitor_img1, Monitor_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ViewSonic VX3276-MHD 32 inch 6oHz Monitor",11969.46, R.drawable.monitor_img2, Monitor_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("LG 24MP88HV-S 24 inch 60Hz Monitor",10670.35, R.drawable.monitor_info3_img2, Monitor_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS VZ239H-W 23 inch 60Hz Monitor",7318.17, R.drawable.monitor_img4, Monitor_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Dell S2418H 23.8 inch 60Hz Monitor",13615.20, R.drawable.monitor_img5, Monitor_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Acer R240HY 23.8 inch 60Hz Monitor",3970.53, R.drawable.monitor_img6, Monitor_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Sceptre E275W-19203R 27 inch 75Hz Monitor",17018.43, R.drawable.monitor_img7, Monitor_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("HP 24mh 24 inch 75Hz Monitor",7091.25, R.drawable.monitor_img8, Monitor_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("BenQ GW2480 24 inch 75Hz Monitor",11345.43, R.drawable.monitor_img9, Monitor_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Philips 246E9QDSB 24 inch 60Hz Monitor",5673.00, R.drawable.monitor_img10, Monitor_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("HP 22yh 22 inch 60Hz Monitor",2855.00, R.drawable.monitor_img11, Monitor_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ASUS VS239H-P 23 inch 60Hz Monitor",7374.90, R.drawable.monitor_img12, Monitor_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Dell SE2416HX 23.8 inch 60Hz Monitor",6807.60, R.drawable.monitor_img13, Monitor_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("HP Pavilion 22cwa 22 inch 60Hz Monitor",4537.83, R.drawable.monitor_img14, Monitor_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("BenQ GW2270 22 inch 60Hz Monitor",4875.94, R.drawable.monitor_img15, Monitor_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Sceptre E248W-19203R 24 inch 75Hz Monitor",5104.00, R.drawable.monitor_img16, Monitor_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("LG 24MK400H-B 23.8 inch 75Hz Monitor",6523.95, R.drawable.monitor_img17, Monitor_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("MSI Optix MAG241C 24 inch 144Hz Monitor",11912.73, R.drawable.monitor_img18, Monitor_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Samsung SF350 24 inch 60Hz Monitor",8508.93, R.drawable.monitor_img19, Monitor_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Acer SB220Q 22 inch 75Hz Monitor",5105.70, R.drawable.monitor_img20, Monitor_no20_info::class.java)





        //POWER SUPPLY PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("EVGA SuperNOVA 650 G5 power supply unit(psu)",6240.83, R.drawable.psu_img1, Psu_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair RM750x power supply unit(psu)",7943.03, R.drawable.psu_img2, Psu_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seasonic Focus GX-650 power supply unit(psu)",5106.03, R.drawable.psu_img3, Psu_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("NZXT C750 power supply unit(psu)",5673.43, R.drawable.psu_img4, Psu_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Thermaltake Toughpower Grand RGB 750W power supply unit(psu)",5389.73, R.drawable.psu_img5, Psu_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("EVGA SuperNOVA 750 G5 power supply unit(psu)",4822.33, R.drawable.psu_img6, Psu_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair TX650M power supply unit(psu)",11563.61, R.drawable.psu_img7, Psu_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seasonic Prime Ultra 750W Titanium power supply unit(psu)",10240.00, R.drawable.psu_img8, Psu_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("be quiet! Straight Power 11 650W power supply unit(psu)",7086.83, R.drawable.psu_img9, Psu_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair SF750 power supply unit(psu)",10496.33, R.drawable.psu_img10, Psu_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("EVGA SuperNOVA 850 G3 power supply unit(psu)",10105.96, R.drawable.psu_img11, Psu_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Cooler Master MWE Gold 650 power supply unit(psu)",4850.00, R.drawable.psu_img12, Psu_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("SeaSonic S12III 550W power supply unit(psu)",3403.83, R.drawable.psu_img13, Psu_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("EVGA B5 550W power supply unit(psu)",5106.03, R.drawable.psu_img14, Psu_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("FSP Dagger 600W power supply unit(psu)",6240.83, R.drawable.psu_img15, Psu_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("SilverStone Technology SST-ST60F-TI power supply unit(psu)",11346.87, R.drawable.psu_img16, Psu_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair CV550 power supply unit(psu)",2899.00, R.drawable.psu_img17, Psu_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seasonic SSR-600TL power supply unit(psu)",10780.60, R.drawable.psu_img18, Psu_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Cooler Master MasterWatt 650 power supply unit(psu)",3120.13, R.drawable.psu_img19, Psu_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Antec Earthwatts Gold Pro 750W power supply unit(psu)",13613.63, R.drawable.psu_img20, Psu_no20_info::class.java)




        //RAM PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("Corsair Vengeance LPX DDR4 16GB (2 x 8GB) ram", 2660.00, R.drawable.ram_img1, Ram_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("G.Skill Ripjaws V DDR4 16GB (2 x 8GB) ram", 2799.00, R.drawable.ram_img2, Ram_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Crucial Ballistix Sport LT DDR4 16GB (2 x 8GB) ram", 3290.00, R.drawable.ram_img3, Ram_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Kingston HyperX Fury RGB DDR4 16GB (2 x 8GB) ram", 2935.00, R.drawable.ram_img4, Ram_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ADATA XPG Spectrix D80 DDR4 16GB (2 x 8GB) ram", 4950.00, R.drawable.ram_img5, Ram_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Team Group T-Force Vulcan Z DDR4 16GB (2 x 8GB) ram", 2899.00, R.drawable.ram_img6, Ram_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Patriot Viper Steel DDR4 16GB (2 x 8GB) ram", 3000.00, R.drawable.ram_img7, Ram_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair Dominator Platinum RGB DDR4 16GB (2 x 8GB) ram", 4450.00, R.drawable.ram_img8, Ram_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("G.Skill Trident Z RGB DDR4 16GB (2 x 8GB) ram", 2799.00, R.drawable.ram_img9, Ram_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("HyperX Predator RGB DDR4 16GB (2 x 8GB) ram", 3199.00, R.drawable.ram_img10, Ram_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Crucial Ballistix Elite DDR4 16GB (2 x 8GB) ram", 4390.00, R.drawable.ram_img11, Ram_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair Vengeance RGB Pro DDR4 16GB (2 x 8GB) ram", 3539.00, R.drawable.ram_img12, Ram_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Team Group T-Force Night Hawk RGB DDR4 16GB (2 x 8GB) ram", 3995.00, R.drawable.ram_img13, Ram_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Patriot Viper 4 Blackout DDR4 16GB (2 x 8GB) ram", 2740.86, R.drawable.ram_img14, Ram_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ADATA XPG Spectrix D41 DDR4 16GB (2 x 8GB) ram", 2234.23, R.drawable.ram_img15, Ram_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("GeIL Evo X II DDR4 16GB (2 x 8GB) ram", 2489.00, R.drawable.ram_img16, Ram_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("G.Skill Trident Z Neo DDR4 16GB (2 x 8GB) ram", 3695.00, R.drawable.ram_img17, Ram_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Crucial Ballistix Tactical Tracer RGB DDR4 16GB (2 x 8GB) ram", 2895.00, R.drawable.ram_img18, Ram_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Kingston HyperX Predator Black DDR4 16GB (2 x 8GB) ram", 3299.00, R.drawable.ram_img19, Ram_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("G.Skill's Premium Trident Z Royal DDR4 16GB (2 x 8GB) ram", 4995.00, R.drawable.ram_img20, Ram_no20_info::class.java)



        //SSD PRODUCTS



        productList.add(shopProducts)
        shopProducts = Product("Samsung 860 EVO 500GB SATA III SSD", 2540.00, R.drawable.ssd_img1, Ssd_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Crucial MX500 500GB SATA III SSD", 2269.43, R.drawable.ssd_img2, Ssd_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("WD Blue 3D NAND 500GB SATA III SSD", 3850.00, R.drawable.ssd_img3, Ssd_no3_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Sandisk Ultra 3D 1TB SATA III SSD", 5450.00, R.drawable.ssd_img4, Ssd_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Kingston KC400 1TB SATA III SSD", 2200.00, R.drawable.ssd_img5, Ssd_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("ADATA SU800 1TB SATA III SSD", 3950.00, R.drawable.ssd_img6, Ssd_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("PNY CS900 1TB SATA III SSD", 1299.00, R.drawable.ssd_img7, Ssd_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Seagate Barracuda 1TB SATA III SSD", 2429.00, R.drawable.ssd_img8, Ssd_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Team Group L5 LITE 3D SATA III SSD", 2799.75, R.drawable.ssd_img9, Ssd_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Teamgroup GX2 SATA III SSD", 1475.00, R.drawable.ssd_img10, Ssd_no10_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Samsung 970 EVO Plus 500GB M.2 SSD NVMe", 4550.00, R.drawable.ssd_img11, Ssd_no11_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("WD Black SN750 500GB M.2 SSD NVMe", 1985.00, R.drawable.ssd_img12, Ssd_no12_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Crucial P1 500GB M.2 SSD NVMe", 3981.11, R.drawable.ssd_img13, Ssd_no13_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Intel 660p 500GB M.2 SSD NVMe", 3650.00, R.drawable.ssd_img14, Ssd_no14_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Adata XPG SX8200 Pro 500GB M.2 SSD NVMe", 4199.23, R.drawable.ssd_img15, Ssd_no15_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Corsair Force MP510 500GB M.2 SSD NVMe", 5695.00, R.drawable.ssd_img16, Ssd_no16_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Kingston A2000 500GB M.2 SSD NVMe", 4695.00, R.drawable.ssd_img17, Ssd_no17_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Sabrent Rocket 500GB M.2 SSD NVMe", 4495.00, R.drawable.ssd_img18, Ssd_no18_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("HP EX920 500GB M.2 SSD NVMe", 5695.00, R.drawable.ssd_img19, Ssd_no19_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Toshiba XG5-P 500GB M.2 SSD NVMe", 2295.00, R.drawable.ssd_img20, Ssd_no20_info::class.java)
        productList.add(shopProducts)





        //CASE / CHASIS PRODUCTS



        shopProducts = Product("Tecware Nexus Air M2 Ultra Black High Airflow mATX Case / Chassis", 1650.00, R.drawable.tecwarenexusairm2, Case_no1_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Tecware Vision M mATX Tempered Glass TG Midtower Case / Chassis", 2750.00, R.drawable.tecwarevisionmmatx, Case_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Tecware Vision M mATX Tempered Glass TG Midtower Case / Chassis", 2750.00, R.drawable.tecwarevisionmmatx, Case_no2_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Tecware VXM TG/Mesh mATX Dual Chamber Chassis WHITE Case / Chassis", 2590.00, R.drawable.vmx2, Case_no4_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Tecware VXM TG/Mesh mATX Dual Chamber Chassis Black Case / Chassis", 2590.00, R.drawable.tecwarevxm, Case_no5_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Deepcool Matrexx 55 4F Mesh w/ ARGB 4 Fans ATX Mid Tower Black Case / Chassis", 3495.00, R.drawable.deepcoolmatrexx55, Case_no7_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Coolman Aurora Gaming with 3x120MM RGB Fans White Case / Chassis", 2250.00, R.drawable.coolmanauroragaming, Case_no6_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("1stPlayer DK-3 Midtower Gaming ATX White Case / Chassis", 1350.00, R.drawable.firstplayerdk3, Case_no8_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("DarkFlash DK351 White ATX Gaming with 4 ARGB Fans Case / Chassis", 2290.00, R.drawable.darkflashdk351, Case_no9_info::class.java)
        productList.add(shopProducts)
        shopProducts = Product("Gigabyte AORUS C300 Glass ATX Gaming AC300G Case / Chassis", 7500.00, R.drawable.gigabyteaorusc300, Case_no10_info::class.java)
        productList.add(shopProducts)

    }



    private fun HomepageCategoriesImages(){
        var images = HomepageCategoriesDataClass(R.drawable.cpuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.moboicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.gpuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.ramicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.psuicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.ssdicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.hddicon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.monitoricon)
        categories_dataClass.add(images)

        images = HomepageCategoriesDataClass(R.drawable.chasisicon)
        categories_dataClass.add(images)


    }
}
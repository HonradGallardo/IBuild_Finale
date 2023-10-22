package com.example.finalproject.Categories.Case_Category

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.Cart.Cart
import com.example.finalproject.Categories.Cpu_Category.Cpu_Adapter
import com.example.finalproject.Categories.Cpu_Category.Cpu_Data_Class
import com.example.finalproject.Products.Case_products_info.Case_no10_info
import com.example.finalproject.Products.Case_products_info.Case_no1_info
import com.example.finalproject.Products.Case_products_info.Case_no2_info
import com.example.finalproject.Products.Case_products_info.Case_no3_info
import com.example.finalproject.Products.Case_products_info.Case_no4_info
import com.example.finalproject.Products.Case_products_info.Case_no5_info
import com.example.finalproject.Products.Case_products_info.Case_no6_info
import com.example.finalproject.Products.Case_products_info.Case_no7_info
import com.example.finalproject.Products.Case_products_info.Case_no8_info
import com.example.finalproject.Products.Case_products_info.Case_no9_info
import com.example.finalproject.R
import com.example.finalproject.rvHompagee
import java.util.Locale

class Case_product_holder : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var caseAdapter: Case_Adapter? = null
    private var DataClass = mutableListOf<Case_Data_Class>()

    private lateinit var backButton : ImageView
    private lateinit var searchView: androidx.appcompat.widget.SearchView
    private lateinit var sortUp: ImageView
    private lateinit var sortDown : ImageView

    private lateinit var caseCart : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.case_product_holder)

        DataClass = ArrayList()
        recyclerView = findViewById<View>(R.id.case_main_container) as RecyclerView

        caseAdapter = Case_Adapter(this@Case_product_holder, DataClass)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = caseAdapter

        backButton = findViewById(R.id.Case_Back_to_Home)
        backButton.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
        caseCart = findViewById(R.id.case_cart)
        caseCart.setOnClickListener{
            val int = Intent(this, Cart::class.java)
            int.putExtra("previousActivity", "Case_product_holder")
            startActivity(int)
            finish()
        }
        sortUp = findViewById(R.id.sort_up)
        sortDown = findViewById(R.id.sort_down)


        sortUp.setOnClickListener {
            sortDataClassDescending()
        }
        sortDown.setOnClickListener {
            sortDataClassAscending()
        }

        searchView = findViewById(R.id.case_category_sv)
        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        caseProducts()
        DataClass.shuffle()

    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val intent = Intent(this, rvHompagee::class.java)
        startActivityWithAnimation(intent)
        finish()
    }

    fun startActivityWithAnimation(intent: Intent) {
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        finish()
    }

    private fun filterList(query : String?){
        if (query != null){
            val filteredList = ArrayList<Case_Data_Class>()
            for (i in DataClass){
                if (i.caseModel.lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT))){
                    filteredList.add(i)
                }else if (i.casePrice.toString().lowercase(Locale.ROOT).contains(query.lowercase(Locale.ROOT)))
                    filteredList.add(i)
            }
            caseAdapter?.setFilteredListCase(filteredList)
        }

    }
    private fun sortDataClassDescending() {
        DataClass.sortByDescending { it.casePrice }
        caseAdapter?.setFilteredListCase(DataClass)
    }

    private fun sortDataClassAscending() {
        DataClass.sortBy { it.casePrice }
        caseAdapter?.setFilteredListCase(DataClass)
    }

    private fun caseProducts(){
        var caseModels = Case_Data_Class("Tecware Nexus Air M2 Ultra Black High Airflow mATX Case", 1650.00, R.drawable.tecwarenexusairm2, Case_no1_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Tecware Vision M mATX Tempered Glass TG Midtower Chassis", 2750.00, R.drawable.tecwarevisionmmatx, Case_no2_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Tecware Flatline mATX High Airflow White", 2095.00, R.drawable.tecwareflatline, Case_no3_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Tecware VXM TG/Mesh mATX Dual Chamber Chassis WHITE", 2590.00, R.drawable.vmx2, Case_no4_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Tecware VXM TG/Mesh mATX Dual Chamber Chassis Black", 2590.00, R.drawable.tecwarevxm, Case_no5_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Deepcool Matrexx 55 4F Mesh w/ ARGB 4 Fans ATX Mid Tower Black", 3495.00, R.drawable.deepcoolmatrexx55, Case_no7_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Coolman Aurora Gaming Case with 3x120MM RGB Fans White", 2250.00, R.drawable.coolmanauroragaming, Case_no6_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("1stPlayer DK-3 Midtower Gaming Case ATX White", 1350.00, R.drawable.firstplayerdk3, Case_no8_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("DarkFlash DK351 White ATX Gaming Case with 4 ARGB Fans", 2290.00, R.drawable.darkflashdk351, Case_no9_info::class.java)
        DataClass.add(caseModels)

        caseModels = Case_Data_Class("Gigabyte AORUS C300 Glass ATX Gaming Case AC300G", 7500.00, R.drawable.gigabyteaorusc300, Case_no10_info::class.java)
        DataClass.add(caseModels)

    }


}
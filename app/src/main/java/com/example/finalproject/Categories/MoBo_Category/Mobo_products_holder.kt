package com.example.finalproject.Categories.MoBo_Category
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

class Mobo_products_holder : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var cartAdapter : Mobo_Adapter? = null
    private lateinit var backbt : ImageView
    private var data = mutableListOf<Mobo_Data_Class>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mobo_main_activity)

        data = ArrayList()

        recyclerView = findViewById<View>(R.id.Mobo_main_container) as RecyclerView


        cartAdapter = Mobo_Adapter(this@Mobo_products_holder, data)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = cartAdapter

        moboProducts()

        backbt = findViewById(R.id.Mobo_Back_to_Home)
        backbt.setOnClickListener{
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }
    }

    private fun moboProducts() {
        var moboModels = Mobo_Data_Class("ASUS ROG Strix B450-F Gaming","₱7,850.00", R.drawable.mobo_img1)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI B450M Mortar MAX","₱5,565.00", R.drawable.mobo_img2)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B450M STEEL LEGEND","₱5,650.00", R.drawable.mobo_img3)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS TUF B450M-Plus Gaming","₱5,999.00", R.drawable.mobo_img4)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte B450 AORUS M","₱4,999.00", R.drawable.mobo_img5)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS Prime B460M-A","₱5,875.00", R.drawable.mobo_img6)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MAG B460M Mortar","₱6,499.00", R.drawable.mobo_img7)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte B460M DS3H","₱5,499.00", R.drawable.mobo_img8)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B460M Pro4","₱5,450.00", R.drawable.mobo_img9)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix B460-G Gaming","₱5,090.00", R.drawable.mobo_img10)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix X570-E Gaming","₱19,260.00", R.drawable.mobo_img11)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MPG B550 Gaming Edge WiFi","₱9,950.00", R.drawable.mobo_img12)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("Gigabyte X570 AORUS Elite","₱9,458.00", R.drawable.mobo_img13)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B450 Pro4","₱5,915.00", R.drawable.mobo_img14)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS Prime X570-Pro","₱14,490.00", R.drawable.mobo_img15)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS ROG Strix Z590-E Gaming WiFi 6E","₱19,490.00", R.drawable.mobo_img16)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI MPG B550 Gaming Edge WiFi","₱9,999.00", R.drawable.mobo_img17)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASUS PRIME B550-PLUS","₱9,600.00", R.drawable.mobo_img18)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("MSI B550-A PRO","₱7,295.00", R.drawable.mobo_img19)
        data.add(moboModels)

        moboModels = Mobo_Data_Class("ASRock B450 PRO4","₱7,558.39", R.drawable.mobo_img20)
        data.add(moboModels)

        cartAdapter!!.notifyDataSetChanged()
    }

}

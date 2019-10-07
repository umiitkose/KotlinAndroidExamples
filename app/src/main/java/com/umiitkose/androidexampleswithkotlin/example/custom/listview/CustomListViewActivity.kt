package com.umiitkose.androidexampleswithkotlin.example.custom.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Toast
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_custom_list_view.*

class CustomListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        var countryList: ArrayList<Country> = ArrayList()
        countryList.add(Country("Türkiye", R.drawable.turkey))
        countryList.add(Country("Brezilya", R.drawable.brazil))
        countryList.add(Country("İngiltere", R.drawable.england))

        lv_country.adapter = CountryAdapter(this,countryList)

        lv_country.onItemClickListener = AdapterView.OnItemClickListener { adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->

            val selectedItem = countryList.get(i).name as String

            Toast.makeText(this,"Seçtiniğiniz ülke \n ${selectedItem}", Toast.LENGTH_SHORT).show()


        }
     }
}

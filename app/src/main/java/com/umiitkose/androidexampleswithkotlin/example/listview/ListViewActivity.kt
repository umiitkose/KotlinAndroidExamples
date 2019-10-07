package com.umiitkose.androidexampleswithkotlin.example.listview

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.umiitkose.androidexampleswithkotlin.R

class ListViewActivity : AppCompatActivity(){

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.list_view_example)

        listView = findViewById(R.id.lv_android_list)

        val androidVersion = listOf("Cupcake", "Eclair", "Froyo", "GinderBread","HoneyComb", "IcreCreamSandviec","Jelly Bean", " KitKat", "Lollipop",
            "Marsmallow","Nougat","Oreo","Pie")

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, androidVersion)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->

            val selectedItem = adapterView.getItemAtPosition(i) as String

            Toast.makeText(this,"Seçtiniğiniz Versiyon \n $selectedItem", Toast.LENGTH_SHORT).show()

        }


    }
}
package com.umiitkose.androidexampleswithkotlin.example.materialdesign.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_toolbar.*

class ToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        var tv= toolbar.findViewById<TextView>(R.id.toolbar_text)
        tv.text="Test"

    }
}

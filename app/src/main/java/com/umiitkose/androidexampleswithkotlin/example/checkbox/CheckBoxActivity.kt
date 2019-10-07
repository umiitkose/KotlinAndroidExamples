package com.umiitkose.androidexampleswithkotlin.example.checkbox

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.umiitkose.androidexampleswithkotlin.R


class CheckBoxActivity : AppCompatActivity(){

    /* Kotlin 'de değer atamadan geçiş sağlayamıyoruz. Nullsafe 'i korumak amaç.
    Lakin lateinit ile başka bir class içerisinde init edeceğimizin garantisini veriyoruz.

    */

    private lateinit var btnSonuc: Button
    private lateinit var cb_android : CheckBox
    private lateinit var cb_kotlin: CheckBox

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.check_box_example)

        btnSonuc = findViewById(R.id.btn_sonuc)
        cb_android = findViewById(R.id.cb_android)
        cb_kotlin = findViewById(R.id.cb_kotlin)

        btnSonuc.setOnClickListener {
            var result = "Selected Programming Language"
            if (cb_android.isChecked) {
                result = "\nandroid"
            }
            if (cb_kotlin.isChecked) {
                result = "\nkotlin"
            }
            Toast.makeText(this, result, Toast.LENGTH_LONG)
        }
    }
}
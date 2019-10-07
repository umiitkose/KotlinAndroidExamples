package com.umiitkose.androidexampleswithkotlin.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.umiitkose.androidexampleswithkotlin.R
import com.umiitkose.androidexampleswithkotlin.example.intent.constants.Constants

class OneActivity : AppCompatActivity() {

    private lateinit var btnGecis: Button
    private lateinit var etName: EditText

    companion object{
        val TAG: String = "OneActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        Log.d(TAG,"OnCreate")

        btnGecis = findViewById(R.id.btn_intentexp)
        etName = findViewById(R.id.et_nameintent)

        btnGecis.setOnClickListener {
            var isim= etName.text.toString()
            var intent = Intent(this,TwoActivity::class.java)
            intent.putExtra(Constants.EXTRA_NAME,isim)
            startActivity(intent)
        }

    }
}

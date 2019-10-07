package com.umiitkose.androidexampleswithkotlin.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umiitkose.androidexampleswithkotlin.R
import com.umiitkose.androidexampleswithkotlin.example.intent.constants.Constants
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        var isimIntent: String? = getIntent().getStringExtra(Constants.EXTRA_NAME)

        tv_hosgeldiniz.text = "Hoşgeldiniz $isimIntent"


        /* Bundle Example
        var extras: Bundle = isimIntent.extras
        var isim: String = extras.getString(Constans.EXTRA_NAME)
        tv_gosterim.text = "Hoşgeldiniz $isimIntent"
        * */

    }
}

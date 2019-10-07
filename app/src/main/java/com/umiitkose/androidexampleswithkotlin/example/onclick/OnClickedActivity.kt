package com.umiitkose.androidexampleswithkotlin.example.onclick

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.ui_onclick_example.*


class OnClickedActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        val TAG: String = "MainActivity"
    }

    private lateinit var tv_gosterim:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_onclick_example)

        tv_gosterim = findViewById(R.id.tv_gosterim)
        btn_tiklama2.setOnClickListener {
            Toast.makeText(this,"Button 2 'ye basıldı",Toast.LENGTH_LONG).show()
            tv_gosterim.setText("Btn 2 'ye tıklandı") }
            Log.i(TAG,"Main Activity Log")

    }

        fun onButtonClicked(view: View){
            when(view.id){
                R.id.btn_tiklama ->tv_gosterim.text = ("Buttona Tıklandı")
                R.id.btn_tiklama1 ->tv_gosterim.text = ("Button1 Tıklandı")

            }

        }

    override fun onClick(view: View?) {
        if (view != null) {
            when(view.id){
                //kodlar

            }
        }
    }

}
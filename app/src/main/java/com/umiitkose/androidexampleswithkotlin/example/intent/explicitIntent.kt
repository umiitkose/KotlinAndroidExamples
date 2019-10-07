package com.umiitkose.androidexampleswithkotlin.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class explicitIntent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        /*Detay İçin :  https://developer.android.com/guide/components/intents-common*/

        btn_map.setOnClickListener { haritadaGoster() }
        btn_webview.setOnClickListener {  webSayfasiAc()}
        btn_paylas.setOnClickListener {  paylas()}
    }

    fun haritadaGoster(){
        val location = Uri.parse("geo:32.3645,-122.4194")
        var mapIntent = Intent(Intent.ACTION_VIEW,location)
        if(mapIntent.resolveActivity(packageManager) !=null){
            startActivity(mapIntent)
        }
    }

    fun webSayfasiAc(){
        val webpage= Uri.parse("http://google.com")
        val webIntent = Intent(Intent.ACTION_VIEW,webpage)
        if(webIntent.resolveActivity(packageManager)!= null){
            startActivity(webIntent)
        }
    }

    fun paylas(){
        val paylasIntent=Intent()
        paylasIntent.setAction(Intent.ACTION_SEND)
        paylasIntent.putExtra(Intent.EXTRA_TEXT,"Uygulamayı indirmek için http://play...")
        paylasIntent.setType("text/plain")
        startActivity(paylasIntent)

    }


}

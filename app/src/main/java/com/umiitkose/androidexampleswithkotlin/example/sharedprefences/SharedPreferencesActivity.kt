package com.umiitkose.androidexampleswithkotlin.example.sharedprefences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_explicit_intent.*
import kotlinx.android.synthetic.main.activity_shared_preferences.*
import java.util.prefs.Preferences

class SharedPreferencesActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences
    private lateinit var prefs: SharedPreferences

    companion object{
        val PREFERENCE_FILE_KEY = "my_pref_key"
        val EDT_KEY = "edk_key"
        val CHB_KEY = "chb_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        // Başka uygulamaların erişimini kapatmak için MODE_PRIVATE yaptık. Yalnızca bu uygulamadan okuyacağız. İlk parametre de xml dosya yolu
        sharedPref = getSharedPreferences(PREFERENCE_FILE_KEY, Context.MODE_PRIVATE)
        prefs = getPreferences(Context.MODE_PRIVATE)

        readValues()

        btn_spclick.setOnClickListener {
            saveChbValue()
            saveEdtValue()
        }

    }

    private fun saveChbValue() {
        val chbEditor: SharedPreferences.Editor = prefs.edit()

        chbEditor.apply(){
            putBoolean(CHB_KEY,chb_kontrol.isChecked)
            apply()
        }

    }

    private fun saveEdtValue(){
        //Sharedpreferences yazma işlemi
        val editor: SharedPreferences.Editor = sharedPref.edit().apply(){
            putString(EDT_KEY,et_sp.text.toString())
            apply()
        }
    }

    private fun readValues(){
        val value = sharedPref.getString(EDT_KEY,"none")

        textView.text = value


        val chbValue = prefs.getBoolean(CHB_KEY,false)
        chb_kontrol.isChecked = chbValue

        tv_sp.text = value

    }
}

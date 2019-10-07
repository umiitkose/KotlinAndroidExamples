package com.umiitkose.androidexampleswithkotlin.example.activity.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.umiitkose.androidexampleswithkotlin.R

class LifecycleActivity : AppCompatActivity() {

    companion object{
        val TAG: String = "LifecycleActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        Log.d(TAG,"onCreate Metodu çalıştırıldı.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Metodu çalıştırıldı.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Metodu çalıştırıldı.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Metodu çalıştırıldı.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Metodu çalıştırıldı.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Metodu çalıştırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Metodu çalıştırıldı.")
    }



}

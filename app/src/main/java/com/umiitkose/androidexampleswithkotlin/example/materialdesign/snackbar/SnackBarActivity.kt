package com.umiitkose.androidexampleswithkotlin.example.materialdesign.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        val cl = findViewById<CoordinatorLayout>(R.id.coordinator_layout)

        bt_snackbar.setOnClickListener {
            val snackBar = Snackbar.make(cl,"Merhaba SnackBar",Snackbar.LENGTH_LONG)
                .setAction("Geri Al",{view ->
                    val snackbar2 = Snackbar.make(cl,"Mesaj Silinmedi",Snackbar.LENGTH_LONG).show()
                }).show()
        }

    }
}

package com.umiitkose.androidexampleswithkotlin.example.materialdesign.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.umiitkose.androidexampleswithkotlin.R
import com.umiitkose.androidexampleswithkotlin.example.materialdesign.alertdialog.custom.CustomDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn_alert_dialog.setOnClickListener {
            val build: AlertDialog.Builder = AlertDialog.Builder(this@AlertDialogActivity)
            build.setMessage("Çıkış Yapılsın mı ?")
                .setTitle("Çıkış")
                .setPositiveButton("Evet",DialogInterface.OnClickListener{dialog,which ->
                    Toast.makeText(this,"Evet",Toast.LENGTH_LONG).show()
                })
                //Alttaki kısımda lambda ile kısalttık.
                .setNegativeButton("Hayır", { dialog, which ->
                    Toast.makeText(this,"Hayır",Toast.LENGTH_LONG).show()
                })
                .setNeutralButton("Test", {dialog,which ->
                    Toast.makeText(this,"Nötr Button",Toast.LENGTH_LONG).show()
                })


            val dialog: AlertDialog = build.create()
            dialog.show()
        }

        btn_alert_list.setOnClickListener {

            val lessons = resources.getStringArray(R.array.lessons_array)
            val builder = AlertDialog.Builder(this@AlertDialogActivity)
            builder.setTitle("Renk Seçimi")
                .setItems(R.array.lessons_array, { dialog, which ->

                    Toast.makeText(this,lessons.get(which).toString(),Toast.LENGTH_LONG).show()
                })
            builder.create().show()

        }

        bt_customalert.setOnClickListener {

          val customDialog: CustomDialog = CustomDialog()
            customDialog.show(supportFragmentManager,"Custom Dialog")

        }



    }
}

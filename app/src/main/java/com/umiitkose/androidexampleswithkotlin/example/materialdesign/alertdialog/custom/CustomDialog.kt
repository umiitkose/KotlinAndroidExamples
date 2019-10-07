package com.umiitkose.androidexampleswithkotlin.example.materialdesign.alertdialog.custom

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.umiitkose.androidexampleswithkotlin.R

class CustomDialog: DialogFragment(){

    private lateinit var etCustomDialogName: EditText
    private lateinit var etCustomDialogPassword: EditText

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        val view: View? = activity?.layoutInflater?.inflate(R.layout.custom_dialog,null)

        builder.setView(view).setPositiveButton("Login", {dialogInterface, i ->


        }).setNegativeButton("Cancel",{dialogInterface, i ->


        })

        etCustomDialogName = view!!.findViewById(R.id.et_customalertname)
        etCustomDialogPassword = view!!.findViewById(R.id.et_customalertpassword)

        return builder.create()
    }

}
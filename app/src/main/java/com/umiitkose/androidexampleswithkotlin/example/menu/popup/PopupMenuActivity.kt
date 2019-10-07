package com.umiitkose.androidexampleswithkotlin.example.menu.popup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.umiitkose.androidexampleswithkotlin.R

class PopupMenuActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)
    }

    fun showPopup(view: View){
        val popup = PopupMenu(this, view)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.menu_popup,popup.menu)
        popup.setOnMenuItemClickListener(this)
        popup.show()
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {

        return when(item?.itemId){
            R.id.action_mail -> {Toast.makeText(this,"Mail",Toast.LENGTH_LONG).show()
            true
            }
            R.id.action_upload -> {Toast.makeText(this,"Upload",Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_share -> {Toast.makeText(this,"Share",Toast.LENGTH_LONG).show()
                true
            }

            else -> false
        }

    }


}

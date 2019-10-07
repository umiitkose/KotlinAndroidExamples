package com.umiitkose.androidexampleswithkotlin.example.menu.option

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.umiitkose.androidexampleswithkotlin.R
import com.umiitkose.androidexampleswithkotlin.example.menu.context.ContextMenuActivity
import com.umiitkose.androidexampleswithkotlin.example.menu.popup.PopupMenuActivity

class OptionMenuActivity : AppCompatActivity() {

    /* https://developer.android.com/guide/topics/ui/menus */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_option,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId){
            R.id.action_settings ->{ Toast.makeText(this, "Ayarlar",Toast.LENGTH_LONG).show()
            true
            }
            R.id.action_about ->{ Toast.makeText(this, "Hakkında",Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_help ->{ Toast.makeText(this, "Yardım",Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_context_menu ->{
                startActivity(Intent(this,ContextMenuActivity::class.java))
                true
            }
            R.id.action_popup_menu ->{
                startActivity(Intent(this,PopupMenuActivity::class.java))
                true
            }
            else ->  super.onOptionsItemSelected(item)
        }
    }

}

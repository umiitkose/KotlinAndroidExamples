package com.umiitkose.androidexampleswithkotlin.example.menu.context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.umiitkose.androidexampleswithkotlin.R
import java.util.zip.Inflater

class ContextMenuActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        imageView = findViewById(R.id.imageView)
        registerForContextMenu(imageView)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_context, menu)
        menu?.setHeaderTitle("Seçenekler")

        /* menu_context xml 'i oluşturmadan tasarlamak için :
        *
        menu?.setHeaderTitle("Context Menu")
        menu?.add(0, v?.id!!, 0, "Call")
        menu?.add(0, v?.id!!, 1, "SMS")
        menu?.add(1, v?.id!!, 0, "Search")
        * */
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId){
            R.id.action_add -> {Toast.makeText(this,"Ekle", Toast.LENGTH_LONG).show()
            true
            }
            R.id.action_delete -> {Toast.makeText(this,"Sil", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_update -> {Toast.makeText(this,"Güncelle", Toast.LENGTH_LONG).show()
                true
            }

            else -> super.onContextItemSelected(item)
        }

        /*  title 'dan kontrol için :

         when {
            item?.title == "Call" -> {
                Toast.makeText(applicationContext, "Call", Toast.LENGTH_LONG).show()
                return true
            }
            item?.title == "SMS" -> {
                Toast.makeText(applicationContext, "SMS", Toast.LENGTH_LONG).show()
                return true
            }
            item?.title == "Search" -> {
                Toast.makeText(applicationContext, "Search", Toast.LENGTH_LONG).show()
                return true
            }
            else -> return super.onContextItemSelected(item)
        }
        */
    }

}

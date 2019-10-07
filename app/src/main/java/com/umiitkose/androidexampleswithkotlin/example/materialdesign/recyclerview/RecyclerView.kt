package com.umiitkose.androidexampleswithkotlin.example.materialdesign.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity(), OnUserItemClickListener {
/* Listview üzerinde item tasarımdaki her bir nesne için yeni bir instance oluşurken, recycler view 'da sadece ekranda oluşan itemlar gözükür.
* Scroll edildikçe işi biten itemlar diğer itemlarla yer değiştiriyor. Recyclerview veri vs fazla ise kesinlikle kullanılmalı.
*
* 3 Tane görünüm türü var.
*
* LinearLayoutManager = Yatay ve Dikey görünüm için
* GridLayoutManager = Grid Olarak kullanılıyor
* StaggeredLayoutManager = Farklı Boyuttaki resimler kendi boyutunda gösterilebilir.
* */
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val userList = arrayListOf<User>(
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background),
            User("Ali Candan", R.drawable.ic_launcher_background)
        )

        rv_lists.layoutManager = LinearLayoutManager(this)
        rv_lists.adapter = UserAdapter(userList,this)

    }

    override fun onUserItemClickList(user: User) {
        Toast.makeText(this,user.name,Toast.LENGTH_LONG).show()
    }
}

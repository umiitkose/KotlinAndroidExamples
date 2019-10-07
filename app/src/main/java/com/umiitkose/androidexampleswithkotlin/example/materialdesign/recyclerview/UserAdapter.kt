package com.umiitkose.androidexampleswithkotlin.example.materialdesign.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.umiitkose.androidexampleswithkotlin.R


class UserAdapter(var userList: ArrayList<User>, var onUserItemClickListener: OnUserItemClickListener) : androidx.recyclerview.widget.RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item_cardview,parent,false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int  = userList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userName.text = userList[position].name
        holder.userImg.setImageResource(userList[position].image)

        holder.itemView.setOnClickListener {
            onUserItemClickListener.onUserItemClickList(userList[position])
        }
    }


    class ViewHolder(view: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(view){

        val userName = view.findViewById<TextView>(R.id.tV_username)
        val userImg= view.findViewById<ImageView>(R.id.img_user)

    }

}
package com.umiitkose.androidexampleswithkotlin.example.custom.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.umiitkose.androidexampleswithkotlin.R
import kotlinx.android.synthetic.main.item_country_list.view.*

class CountryAdapter(var context: Context, var countryList: ArrayList<Country>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder: ViewHolder?

        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_country_list,parent,false)
            viewHolder = ViewHolder(view)
            /*
View ile ViewHolder ilişkilendirilmezse listviewdeki itemler gösterilmeyecektir. Mutlaka ilişkilendirilmesi gerekiyor.
 Bunun içinde view.tag metod kullanıyoruz. Parametre olarak vermek ilişkilendirme olmuyor tam olarak. ListView adapterde tag kullanmalısın.*/
            view.tag = viewHolder

        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var country: Country = getItem(position) as Country
        viewHolder.tvCountryName?.text = country.name
        viewHolder.imgFlag?.setImageResource(country.flag)

        return view as View
    }

    override fun getItem(position: Int): Any = countryList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = countryList.size

    private class ViewHolder(view: View?){

        var tvCountryName: TextView?
        var imgFlag: ImageView?

        init {
            tvCountryName = view?.findViewById<TextView>(R.id.tv_country_name)
            imgFlag = view?.findViewById<ImageView>(R.id.img_country_flag)
        }

    }

    }
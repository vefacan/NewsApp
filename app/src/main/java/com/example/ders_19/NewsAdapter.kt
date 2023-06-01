package com.example.ders_19

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class NewsAdapter(private val context: Activity, private val list: List<News>): ArrayAdapter<News>(context, R.layout.custom_listview_news,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val rootView = context.layoutInflater.inflate(R.layout.custom_listview_news,null,true)

        val newsImg = rootView.findViewById<ImageView>(R.id.news_img)
        val newsTitle = rootView.findViewById<TextView>(R.id.news_title)


        val user = list.get(position)

        Glide.with(context).load(user.img).into(newsImg)
        newsTitle.text = user.title


        return rootView
    }

    override fun getItem(position: Int): News? {
        return list[position]
    }

}
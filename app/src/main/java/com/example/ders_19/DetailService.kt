package com.example.ders_19

import android.util.Log


class DetailService {

    fun newsServices():List<News>{

        var newsArr = mutableListOf<News>()
        var result = Result()

            val list = result.news()


        for (item in 0..list.size-1){
            val u1 = News(list.get(item).title,list.get(item).img,list.get(item).href)
            newsArr.add(u1)
        }

        return newsArr
    }



}


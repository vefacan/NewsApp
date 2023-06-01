package com.example.ders_19

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

class Result {
    val arr = mutableListOf<News>()

    fun news() : MutableList<News> {
        val url = "https://www.haberler.com"
        val doc: Document = Jsoup.connect(url).timeout(15000).get()

        val elements: Elements = doc.getElementsByAttribute("data-headlinenumber")
        for (item in elements) {

            val img = item.getElementsByTag("img")

            val href = item.attr("abs:href")
            val image = img.attr("data-src")
            val title = img.attr("alt")

            if (title != "" && image != "" && href!=""){
                val news = News(title,image,href)
                arr.add(news)
            }
        }
        return arr
    }
}
package com.example.ders_19

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val detailService = DetailService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var result = Result()
        val run = Runnable {
            val list = result.news()
            val customAdapter = NewsAdapter(this,detailService.newsServices())

            custom_listview.setOnItemClickListener { parent, view, position, id ->
                val element = customAdapter.getItem(position)
                val intent = Intent(this,WebViewPage::class.java)
                intent.putExtra("data",list.get(position).href)
                startActivity(intent)
            }

            runOnUiThread {
                 custom_listview.adapter = customAdapter
            }

        }
        Thread(run).start()


    }
}
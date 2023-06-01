package com.example.ders_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view_page.*

class WebViewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_page)

        val data = intent.getStringExtra("data")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient =  customWebViewClient()
        webView.loadUrl(data!!)
    }
}

class customWebViewClient : WebViewClient(){

    override fun shouldOverrideUrlLoading(
        view: WebView?,
        request: WebResourceRequest?
    ): Boolean {
        return super.shouldOverrideUrlLoading(view, request)
    }

    override fun onLoadResource(view: WebView?, url: String?) {
        super.onLoadResource(view, url)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
    }
}
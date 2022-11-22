package com.wil.calcwebintentweb

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Webactivity : AppCompatActivity() {
    lateinit var  mywebview:WebView

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webactivity)
        mywebview=findViewById(R.id.webView)
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    //this function redirects to url selected
    private fun webview(){
        mywebview.webViewClient= WebViewClient()

        mywebview.apply {
            loadUrl("https://www.emobilis.ac.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
//this function enables web page to go back to previous page
    override fun onBackPressed() {
        if (mywebview.canGoBack())mywebview.goBack()else
            super.onBackPressed()
                    }

    }

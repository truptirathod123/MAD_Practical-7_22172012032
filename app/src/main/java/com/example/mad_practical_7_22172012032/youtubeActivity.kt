package com.example.mad_practical_7_22172012003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import android.webkit.WebSettings
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
}
    fun intYoutubePlayer(){
        val youtubeId = "fJn9B64Znrk"
        val youtubeWebView = findViewById<WebView>(R.id.WebView2)
        val webSettings: WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

    }
}

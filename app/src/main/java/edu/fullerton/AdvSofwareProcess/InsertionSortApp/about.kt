package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class about : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val wv = WebView(this)
        setContentView(wv)
        wv.settings.javaScriptEnabled = true
        wv.settings.domStorageEnabled = true
        wv.overScrollMode = WebView.OVER_SCROLL_NEVER
        wv.loadUrl("file:///android_asset/about.html")


    }






}

package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView

class about : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        this.title ="About Us"
        val wv = WebView(this)
        setContentView(wv)
        wv.settings.javaScriptEnabled = true
        wv.settings.domStorageEnabled = true
        wv.overScrollMode = WebView.OVER_SCROLL_NEVER
        wv.loadUrl("file:///android_asset/about.html")


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.actionbar_items, menu)
        menu.removeItem(R.id.aboutus)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {


            R.id.sorting -> {

                val intent = Intent(this, sort::class.java)
                startActivity(intent)



                true;
            }

            R.id.records -> {

                val intent = Intent(this, record::class.java)
                startActivity(intent)



                true;
            }


            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }




}

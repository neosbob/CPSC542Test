package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title ="Home"

        val welcome_logo = findViewById<ImageView>(R.id.main_logo)
        val welcome_title = findViewById<TextView>(R.id.welcome_title_text)
        welcome_logo.animate().alpha(1f).setDuration(1500)
        welcome_title.animate().alpha(1f).setDuration(2500)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.actionbar_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {

            R.id.sorting -> {
                val intentS = Intent(this, sort::class.java)

                startActivity(intentS)

                true;

            }




            R.id.records -> {

                val intent = Intent(this, record::class.java)
                startActivity(intent)



                true;
            }

            R.id.aboutus -> {

                val intent = Intent(this, about::class.java)
                startActivity(intent)



                true;
            }


            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}
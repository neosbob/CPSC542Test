package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.actionbar_items, menu)
        return true
    }
    /*
    override fun onResume() {


        Handler().postDelayed({

            val intentS = Intent(this, sort::class.java)

            startActivity(intentS)

        }, 3000)
        super.onResume()
    }
    */
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
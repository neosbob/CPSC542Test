package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.cursoradapter.widget.CursorAdapter

import kotlinx.android.synthetic.main.activity_record.*

import androidx.cursoradapter.widget.SimpleCursorAdapter
import kotlinx.android.synthetic.main.customlistview.*


class record : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        this.title ="Records"
        val db = AppDatabase.getInstance(this)


        val allresult = db.RecordsDao().getAll()
     

        val adapter = SimpleCursorAdapter(
            this,
            R.layout.customlistview,
            allresult,
            arrayOf( "input", "result", "date"),
            intArrayOf( R.id.textinput, R.id.textresult , R.id.textdate),0
        )
        
        roomview.adapter = adapter
        db.close()

    }





    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.actionbar_items, menu)
        menu.removeItem(R.id.records)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {


            R.id.sorting -> {

                val intent = Intent(this, sort::class.java)
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

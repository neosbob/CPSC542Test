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
        /*
        Log.i("result", allresult.toString())
        val adapter = object :
            ArrayAdapter <records>(this, R.layout.customlistview ,R.id.textinput, allresult ) {

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val row = super.getView(position, convertView, parent)


                val text1 = row.findViewById<TextView>(R.id.textinput)
                val text2 = row.findViewById<TextView>(R.id.textresult)


                text1.text=  allresult[position].input

                text2.text=  allresult[position].result
                Log.i("ad", row.toString())


                return row
            }
        }

*/


        val adapter = SimpleCursorAdapter(
            this,
          R.layout.customlistview,
            allresult,
            arrayOf( "input", "result", "date"),
            intArrayOf( R.id.textinput, R.id.textresult , R.id.textdate)
        )

        roomview.adapter = adapter




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

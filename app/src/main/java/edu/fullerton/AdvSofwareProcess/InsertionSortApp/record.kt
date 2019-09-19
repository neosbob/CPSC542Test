package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_record.*

import androidx.cursoradapter.widget.SimpleCursorAdapter





class record : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)


        val db = AppDatabase.getInstance(this)


        val allresult = db.RecordsDao().getAll()

        /*
        val adapter = object :
            ArrayAdapter<records>(this, android.R.layout.simple_expandable_list_item_2, android.R.id.text1, allresult ) {

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val row = super.getView(position, convertView, parent)


                val text1 = row.findViewById<TextView>(android.R.id.text1)
                val text2 = row.findViewById<TextView>(android.R.id.text2)
                text1.text= "User Input: " + allresult[position].input

                text2.text= "User Result: " + allresult[position].result


                return row
            }
        }

         */



        val adapter = SimpleCursorAdapter(
            this,
            android.R.layout.simple_list_item_2,
            allresult, // Pass in the cursor to bind to.
            arrayOf("_id", "input", "result"), // Array of cursor columns to bind to.
            intArrayOf(android.R.id.text1, android.R.id.text1, android.R.id.text2)
        )  // Parallel array of which template objects to bind to those columns.

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

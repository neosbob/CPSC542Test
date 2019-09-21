package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ArrayAdapter
import android.widget.Toast
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_sort.*
import java.lang.NumberFormatException
import java.time.LocalDateTime


class sort : AppCompatActivity()  {


    val Datas = ArrayList<Int>();
    val result = ArrayList<String>();
    var t = ArrayList<String>();
    var recordst= records(0,null,null, null)

    /*
    Pseudo-code

    for i from 1 to N
       key = a[i]
       j = i - 1
       while j >= 0 and a[j] > key
          a[j+1] = a[j]
          j = j - 1
       a[j+1] = key


     */
    fun InsertionSort(arrays: ArrayList<Int>): ArrayList<Int> {

        val size = arrays.size;


        for (i in 1 until size) {


            val Initial_Value = arrays[i]

            var j = i - 1

            if (!result.contains(arrays.toString())) {
                result.add(arrays.toString());
            }

            while (j >= 0 && arrays[j] > Initial_Value) {


                arrays[j + 1] = arrays[j]

                j -= 1


            }

            arrays[j + 1] = Initial_Value

        }

        return arrays;
    }

    /* condition


    Input consists of a set of Integer numbers. Integer numbers will be one among the
    integer set [0 to 9]. If input does not meet the min/max numbers, issue an error
    message, and ask to correct for another chance. Use an array to align input values. Array
    index value starts from 0.
    

     */
    fun Condition_add(num: Int): Boolean {

        if (num in 0.rangeTo(9)) {

            Datas.add(num)
            result.add(Datas.toString())
            return true
        }
        result.clear();
        return false

    }

    /*

    The maximum input size = 8 (maximum number of numbers to sort)
     The minimum input size = 2 (otherwise, issue an error message)

     */
    fun Check_Size(arrays: ArrayList<Int>): Int {

        if (arrays.size < 2) {
            result.clear();
            return 1
        } else if (arrays.size > 8) {
            result.clear();
            return 2

        } else {

            InsertionSort(arrays)

            return 0
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)
        val db = AppDatabase.getInstance(this)
        this.title="Sorting"

        // make an contructor for simple textview in the datas array
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, result)
        // connect the adapter with the listview ( id: Lists)
        Lists.adapter = adapter

        // adding clear button for user when the want a new set of arrays
        clear.visibility = INVISIBLE

        // add button to check all the condition need 0 -9 integers
        add!!.setOnClickListener {
            // toast function using for make an little message at the bottom of screen
            val Uinput = input.text.toString().trim()

            if (Uinput.isEmpty()) {
                Toasty.error(this, "No Numbers input ", Toast.LENGTH_LONG).show()
                input.text?.clear()
            }else if(Uinput.contains(".")){
                Toasty.error(this, "Input should be in Integer type ", Toast.LENGTH_LONG).show()
                input.text?.clear()

            }
            else {
                t = Uinput.split(" ", ",") as ArrayList<String>
                var check = true

                recordst.input = t.toString()
                recordst.date = LocalDateTime.now().toString()


                t.forEach() {
                    try {

                        if (!Condition_add(it.toInt())) {

                            Toasty.error(
                                this,
                                "Your Input not in Range 0-9",
                                Toast.LENGTH_LONG,
                                true
                            )
                                .show()
                            input.text?.clear()

                            Datas.clear()
                        }
                        adapter.notifyDataSetChanged()
                        // this is the internal function use for notify the list change and update layout

                    }catch (e: NumberFormatException) {
                        check = false
                    }
                    if (check)
                        println(" is a number")
                    else {
                        Toasty.error(
                            this,
                            "Your input not in Integer Type",
                            Toast.LENGTH_LONG,
                            true
                        )
                            .show()
                        input.text?.clear()

                    }}
            }
        }
        // process sort button for sorting the datas ( array)
        process.setOnClickListener {



            result.clear()


            Toasty.Config.getInstance().tintIcon(true).apply()

            if (Check_Size(Datas) == 1) {
                Datas.clear()


                Toasty.error(this, "Minimum Two Numbers For Sorting", Toast.LENGTH_SHORT, true)
                    .show()

            } else if (Check_Size(Datas) == 2) {
                Datas.clear()
                Toasty.error(this, "Maximum Eight Numbers For Sorting", Toast.LENGTH_SHORT, true)
                    .show()

            } else {

                clear.visibility = VISIBLE
                recordst.result= result.toString()
                db.RecordsDao().insertAll(recordst)
                db.close()

            }
            adapter.notifyDataSetChanged()


        }

        // clear button press only show up when the sorting already done
        clear.setOnClickListener {

            Datas.clear()
            result.clear()
            t.clear()
            adapter.notifyDataSetChanged()
            clear.visibility = INVISIBLE


        }




    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.actionbar_items, menu)
        menu.removeItem(R.id.sorting)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {


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

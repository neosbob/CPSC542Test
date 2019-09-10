package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sort.*
import kotlinx.android.synthetic.main.activity_sort.view.*


class sort : AppCompatActivity() {
    val Datas = ArrayList<Int>();
    val result = ArrayList<String>();
    var t = ArrayList<String>();
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
    fun InsertionSort (arrays: ArrayList<Int>){

        val  size = arrays.size;



        for (i in 1 until size) {




            val Initial_Value = arrays[i]

            var j = i - 1

            if( !result.contains(arrays.toString())){
                result.add(arrays.toString());

            }

            while (j >= 0 && arrays[j] > Initial_Value) {


                arrays[j + 1] = arrays[j]

                j -= 1



            }



            arrays[j + 1] = Initial_Value





        }
        Log.i("t", result.size.toString());


        Log.i("t", result.toString());

    }
    /* condition


    Input consists of a set of Integer numbers. Integer numbers will be one among the
    integer set [0 to 9]. If input does not meet the min/max numbers, issue an error
    message, and ask to correct for another chance. Use an array to align input values. Array
    index value starts from 0.
    

     */
    fun Condition_add(num: Int) : String {

        if (num >=  0 && num <= 9 ){

            Datas.add(num)
            result.add(Datas.toString())
            return ""
        }

        else{
            return "Your Input not in range 0-9"
        }

    }
    /*

    The maximum input size = 8 (maximum number of numbers to sort)
     The minimum input size = 2 (otherwise, issue an error message)

     */
    fun Check_Size (arrays: ArrayList<Int>):String{

        if ( arrays.size < 2 )
        {
            return "Minimum two integers in order to sort"
        }
        else if ( arrays.size > 8 ){
            return "Maximum  eight numbers in order to sort"

        }
        else{

            InsertionSort(arrays)

            return ""
        }

    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)


        // make an contructor for simple textview in the datas array
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result)
        // connect the adapter with the listview ( id: Lists)
        Lists.adapter = adapter

        // adding clear button for user when the want a new set of arrays
        clear.visibility = INVISIBLE

        // add button to check all the condition need 0 -9 integers
        add!!.setOnClickListener{
            // toast function using for make an little message at the bottom of screen
            val input = input.text.toString().trim()

            if(input.isEmpty()){
                Toast.makeText(this, "No Numbers input ", Toast.LENGTH_LONG).show()

            }

            else {
             t = input.split(" ",",") as ArrayList<String>

                Log.i("string", t.toString());

                t.forEach() {


                    Toast.makeText(this, Condition_add(it.toInt()), Toast.LENGTH_LONG).show()
                    adapter.notifyDataSetChanged()
                    // this is the internal function use for notify the list change and update layout
                }
            }
        }
        // process sort button for sorting the datas ( array)
        process.setOnClickListener {

            result.clear()
            Toast.makeText(this,  Check_Size(Datas), Toast.LENGTH_LONG).show()


            if( Check_Size(Datas) == "") {
                clear.visibility = VISIBLE
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


}

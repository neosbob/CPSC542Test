package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler





class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }


    override fun onResume() {


        Handler().postDelayed({

            val intentS = Intent(this, sort::class.java)

            startActivity(intentS)

        }, 3000)
        super.onResume()
    }

}
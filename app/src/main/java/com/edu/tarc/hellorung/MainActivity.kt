package com.edu.tarc.hellorung

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instant Name: Class Name
class MainActivity : AppCompatActivity() {
    //OnCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Write UI Handler here
        //Variable declaration; 1) val = value; 2)var = variable;
        val textViewName: TextView = findViewById(R.id.Name)
        val imageViewQRcode = findViewById<ImageView>(R.id.imageViewQRcode)
        val buttonshow: Button = findViewById(R.id.buttonshow)
        val buttonhide: Button = findViewById(R.id.buttonhide)

        buttonshow.setOnClickListener {
            textViewName.visibility = View.VISIBLE
            imageViewQRcode.visibility = View.VISIBLE
        }

        buttonhide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQRcode.visibility = View.INVISIBLE

        }
    }
}
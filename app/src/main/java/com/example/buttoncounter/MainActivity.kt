package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textv:TextView
    lateinit var btnadd: Button
    lateinit var btnsub:Button
              var point=26

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textv = findViewById(R.id.tv)
        btnadd = findViewById(R.id.btnAdd)
        btnsub= findViewById(R.id.btnsub)
        btnadd.setOnClickListener {
          point++
            textv.setText("plus one Added $point")

        }

        btnsub.setOnClickListener {
            point--
            textv.setText("Subtract number one $point")


        }
    }








}
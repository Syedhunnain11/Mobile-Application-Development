package com.example.kfcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.buttonLogin)
        button1.setOnClickListener {
            open2ndactivity()
        }
    }
    fun open2ndactivity(){
        val intent = Intent(this,MainActivity2::class.java )
        startActivity(intent)
    }


}
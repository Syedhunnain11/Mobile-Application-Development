package com.example.labterminal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_services.*

class Services : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)
        btnstart.setOnClickListener{
            Intent(this,MyService::class.java).also {
                startService(it)
                txt1.text="Services start"
            }
        }
        btnstop.setOnClickListener{
            Intent(this,MyService::class.java).also {
                stopService(it)
                txt1.text="Services end"
            }
        }

    }
}
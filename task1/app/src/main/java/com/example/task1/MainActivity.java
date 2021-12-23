package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    override fun onCreate(Bundle savedInstanceState) {
        val btn1: Button=findViewById(R.id.button5)

        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.task1, menu);
        return true;
    }



}
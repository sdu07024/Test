package com.landvibe.test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun on1(v: View){
        Toast.makeText(applicationContext, "Button이 눌렸습니다.",Toast.LENGTH_SHORT).show();
    }
}



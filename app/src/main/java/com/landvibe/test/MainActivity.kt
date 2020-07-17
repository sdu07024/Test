package com.landvibe.test

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("msg",tv_msg.text.toString())
            startActivity(intent)
            finish()
        }
    }

    fun on1(v: View) {
        Toast.makeText(applicationContext, "Button이 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }

}



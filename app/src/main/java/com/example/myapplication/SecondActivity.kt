package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName=intent.getStringExtra("USER")
        val textView=findViewById<TextView>(R.id.tv_offers)
        val message="$userName,you will get free access to all the contents for one month"
        textView.text=message
    }
}
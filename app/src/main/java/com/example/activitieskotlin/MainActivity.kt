package com.example.activitieskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val myActivity:String="MyActivity"
        super.onCreate(savedInstanceState)
        Log.d(myActivity,"onCreate()")
        setContentView(R.layout.activity_main)
    }
}
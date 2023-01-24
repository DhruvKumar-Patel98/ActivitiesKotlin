package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity :Activity(){
    val myStateChangeActivity:String="MyStateChangeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(myStateChangeActivity,"onCreate()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(myStateChangeActivity,"onRestoreInstanceState()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(myStateChangeActivity,"onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(myStateChangeActivity,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(myStateChangeActivity,"onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(myStateChangeActivity,"onSaveInstanceState()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(myStateChangeActivity,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(myStateChangeActivity,"onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(myStateChangeActivity,"onDestroy()")
    }
}
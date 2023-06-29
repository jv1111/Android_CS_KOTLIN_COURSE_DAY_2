package com.example.d1kotlin

import android.util.Log

class Car {
    var maxSpeed = 30;
    fun start(){
        Log.i("MYTAG","Car is starting");
        Log.i("MYTAG","speed $maxSpeed");
    }
}
package com.example.d1kotlin

import android.util.Log

//inheritance/extends in java
class MyCar : Car(){

//    override the car function
    override fun start() {
        Log.i("MYTAG", "My car is starting")
    }

}
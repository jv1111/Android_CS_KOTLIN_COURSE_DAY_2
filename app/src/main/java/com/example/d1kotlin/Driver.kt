package com.example.d1kotlin

import android.util.Log

class Driver(name : String) {
    var driverName = "";

    init{
        driverName = name;
    }

    fun showDetails(){
        Log.i("MYTAG","name of the driver is $driverName")
    }

}
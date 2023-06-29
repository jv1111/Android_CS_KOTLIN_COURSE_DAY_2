package com.example.d1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG","Main activity on create");

        val car = Car();//reference variable (object/instance)
        car.start();

        val driver = Driver("MR.D");
        driver.showDetails();

        val myCar = MyCar();
        myCar.start();

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","Main activity destroyed");
    }
}
package com.example.d1kotlin

interface SpeedController {

//    ABSTRACT METHOD
    fun accelerate()
    fun decelerate()

    fun getBrandId():String{
        return "DW12312S"
    }
}
package com.example.kotlin_demo

class Student {
    private var mName: String = ""
    private var mYear: Int = 0
    private var mGPA: Float = 1f


    constructor()

    constructor(name: String, year: Int, fpa: Float) {
        this.mName = name
        this.mYear = year
        this.mGPA = fpa
    }

    override fun toString(): String {
        return "Student(name='$mName', year=$mYear, fpa=$mGPA)"
    }

    fun setYear(year: Int) {
        if(year < 2020){
            mYear = year
        }else{
            return
        }
    }



    fun getYear(): Int {
        return mYear
    }

}
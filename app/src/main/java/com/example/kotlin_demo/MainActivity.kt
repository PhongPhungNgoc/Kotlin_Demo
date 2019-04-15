package com.example.kotlin_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         *
         * Khai bao du lieu
         *
         *
        var a : String = ""
        a = "phong"
        a.toInt()

        val b : String = "phat" // Tu khoa val: Chi co the read ma ko the gan lai = final trong java
         */

        ///////////////////////


        /**
         *
         * Null Safety
         *
         *  var ten : String? = "phong"!! // Dau ? : Null Safety: Gan cho gia tri nao do la null: String?
        // Dau !!: Gia tri ko duoc phep null
        ten = null
         *
         */

        //////////////////


        /**
         *
         * If - else
         *
        var a: Int = 10
        var b: Int = 15

        if (a > b) {
        Log.d("AAA", "Max " + a)
        } else {
        Log.d("AAA", "Max " + b)
        }
         *
         */

        ////////////////////

        /**
         *  When = Switch(Java)
         *
         *
         *
         *
         * //        var a : String = "phong"
        //
        //        when(a){
        //            "long" -> Log.d("AAA" , "Long")
        //            "phong" -> Log.d("AAA", "Phong")
        //        }

        //        var a : Int = 7
        //
        //        when(a){
        //            1,2,3 -> Log.d("AAA", "Quy 1")
        //            in 4..6 -> Log.d("AAA", "Quy 2")
        //            else ->Log.d("AAA", "No")
        //        }
         */

        /////////////////////

        /**
         *
         * While
         *
         *
        var a : Int = 0 ;

        while (a < 10){
        Log.d("AAA", a.toString())
        a++;
        }
         *
         */

        /////////////

        /**
         * For trong Kotlin
         */

//        for (i in 0..10) {
//            Log.d("AAA", "Vi tri thuc hien" + i);
//        }

//        var a : Int = 5;
//        for (i in 0 until a) {
//            Log.d("AAA", "Vi tri " + i);
//        }

//        var a = 5
//        for(i in a downTo 0){
//            Log.d("AAA", "Vi tri "+ i);
//        }

//        var a = 5;
//        for (i in 0 until a step 2) {
//            Log.d("AAA", "Vi tri " + i);
//        }

        ///////////////////////

        /**
         * Mang trong Kotlin
         */

        //C1.
//        var array = floatArrayOf(1.0f,2f,5f) // Khong co StringArray
//        Log.d("AAA", " " + array.get(1))

        //C2.
//        var arrayName : List<String> = listOf("phong", "tuan");
//        Log.d("AAA", ""+ arrayName.get(1))
//
//        for(i in 0 until arrayName.size){
//            Log.d("AAA", arrayName.get(i))
//        }

        //C3.
//        var arrayName: ArrayList<String> = ArrayList();
//        arrayName.add("hoa");
//        arrayName.add("huy");
//        arrayName.add("nam");
//
//        for (i in 0 until arrayName.size) {
//            Log.d("AAA", "" + arrayName.get(i))
//        }
//
//        arrayName.removeAt(0)
//        for(i in 0..arrayName.size){
//            Log.d("AAA", "" + arrayName.get(i))
//        }

//        arrayName.set(1,"Vinh")
//        for(i in 0 until arrayName.size){
//            Log.d("AAA", "" + arrayName.get(i))
//        }


        ////////////////////////////

        /**
         * Function trong Kotlin
         */

//        showName(1f)


        ////////////////////////

        /**
         * OOP trong Kotlin
         */

//        var sv1 : Student  = Student("Nam", 3, 4f)
//
//        sv1.setYear(3000)
//
//        Log.d("AAA", sv1.toString())


//        val dataClass : DataClass = DataClass("Bike", 3)
//        Log.d("AAA", dataClass.name)

        ///////////////

//        tvName.text = "Vui"
//
//        buttonClick.setOnClickListener {
//            Toast.makeText(this, tvName.text, Toast.LENGTH_SHORT).show()
//        }

//        buttonClick.setOnClickListener {
//            object : View.OnClickListener {
//                override fun onClick(v: View?) {
//                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//                }//        }
//
//            }


        ////////////////////////

        /**
         *  Application Plus, Subtract, Multiply, Divide
         */


//        btnPlus.setOnClickListener {
//            val number1: String = edtNumber1.text.toString()
//            val number2: String = edtNumber2.text.toString()
//            var result: Int = plus(number1.toInt(), number2.toInt())
//            tvResult.text = result.toString()
//        }


        //////////////////////////

        /**
         *
         * ListView Basic
         *
         */

//        var arrayList : ArrayList<Int> = ArrayList();
//
//        for(i in 0 until 10){
//            arrayList.add(i);
//        }
//
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        /**
         *
         * ListView Advance
         *
         */

//        var arrFood : ArrayList<Food> = ArrayList();
//        arrFood.add(Food("AA", R.drawable.ic_launcher_background))
//        arrFood.add(Food("BB", R.drawable.ic_launcher_foreground))
//
//        listView.adapter = CustomAdapter(this, arrFood)


        /**
         *
         * RecycleView
         *
         */
        var arrFood: ArrayList<Food> = ArrayList();
        arrFood.add(Food("AA", R.drawable.ic_launcher_background))
        arrFood.add(Food("BB", R.drawable.ic_launcher_foreground))


        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleViewFood.layoutManager = layoutManager

        recycleViewFood.adapter = RecycleFoodAdapter(this, arrFood)

        /**
         *
         * Intent
         *
         */


    }

//    private fun plus(number1: Int, number2: Int): Int {
//        var result: Int = number1 + number2
//        return result
//    }

//    fun showName(name : Float){
//        Log.d("AAA", "Function " + name)
//    }
}

package com.example.cl5kot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { tv1.text=filterNumberList(numbersList).toString() }
        button2.setOnClickListener { tv1.text=filterInstanceList(instanceList as List<Any>).toString() }
        button3.setOnClickListener { tv1.text=filterNumbersMap(numbersMap).toString() }
        button4.setOnClickListener { tv1.text=filterUnsortedList(unsortedList).toString() }
    }

    private val numbersList = listOf(  "one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, " two ", 3.0, "four")
    private val numbersMap = mapOf(" key1 " to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    fun filterNumberList(cualquierlista1:List<String>):List<String>{
        return cualquierlista1.filter { it.startsWith("t") }
    }
    fun filterInstanceList(cualquierlista2:List<Any>):List<Any>{
        return cualquierlista2.filter { it == "two" }
    }
    fun filterNumbersMap(cualquierlista3: Map<String, Int>):Map<String,Int>{
        return cualquierlista3.filter {it.key> 2.toString() }
    }
    fun filterUnsortedList(cualquierlista4:List<Int>):List<Int>{
        return cualquierlista4.filter { it<7  }
    }

}


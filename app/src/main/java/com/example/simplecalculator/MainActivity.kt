package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var multi : Button
    lateinit var dev : Button
    lateinit var ETnum1 : EditText
    lateinit var ETnum2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add= findViewById(R.id.add)
        sub= findViewById(R.id.sub)
        multi= findViewById(R.id.multi)
        dev= findViewById(R.id.dev)

        tv= findViewById(R.id.tv)
        ETnum1= findViewById(R.id.num1)
        ETnum2= findViewById(R.id.num2)

        add.setOnClickListener {
            val num1 = ETnum1.text.toString().toDouble()
            val num2 = ETnum2.text.toString().toDouble()
            var i =  sum(num1,num2)
            tv.text = "$num1 + $num2 = $i"
        }

        sub.setOnClickListener {
            val num1 = ETnum1.text.toString().toDouble()
            val num2 = ETnum2.text.toString().toDouble()
            var i = sub(num1,num2)
            tv.text = "$num1 - $num2 = $i"
        }

        multi.setOnClickListener {
            val num1 = ETnum1.text.toString().toDouble()
            val num2 = ETnum2.text.toString().toDouble()
            var i = multi(num1,num2)
            tv.text = "$num1 * $num2 = $i"
        }

        dev.setOnClickListener {
            val num1 = ETnum1.text.toString().toDouble()
            val num2 = ETnum2.text.toString().toDouble()
            var i = dev(num1,num2)
            tv.text = "$num1 / $num2 = $i"
        }

    }
    fun sub (num1 : Double , num2 : Double) : Double {
        return num1-num2
    }
    fun sum (num1 : Double , num2 : Double) : Double {
        return num1+num2
    }
    fun multi (num1 : Double , num2 : Double) : Double {
        return num1*num2
    }
    fun dev (num1 : Double , num2 : Double) : Double {
        return num1/num2
    }
}
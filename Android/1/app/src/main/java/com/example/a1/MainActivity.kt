package com.example.a1

import android.icu.number.Precision.integer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.reflect.Array.set

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_add = findViewById<Button>(R.id.btn_add)
        val btn_min = findViewById<Button>(R.id.btn_min)
        val reset = findViewById<Button>(R.id.reset)
        val set = findViewById<Button>(R.id.set)
        var countText = findViewById<TextView>(R.id.countText)
        val number = findViewById<EditText>(R.id.number)
        var count:Int = 0

        btn_add.setOnClickListener{
            count++
            countText.text = count.toString()
        }

        btn_min.setOnClickListener{
            count--
            countText.text = count.toString()
        }

        reset.setOnClickListener{
            count = 0
            countText.text = count.toString()
        }

        set.setOnClickListener {
            countText.text = number.text
            count = Integer.parseInt(countText.text.toString())
        }
    }
}
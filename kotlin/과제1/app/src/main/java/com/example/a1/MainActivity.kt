package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext = findViewById<EditText>(R.id.editText)
        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        var ran = Random().nextInt(99)+1

        btn1.setOnClickListener {
            if(ran == Integer.parseInt(edittext.text.toString())){
                Toast.makeText(this@MainActivity, "맞췄습니다." , Toast.LENGTH_SHORT).show()
            }
            else{
               if(ran > Integer.parseInt(edittext.text.toString())){
                   Toast.makeText(this@MainActivity, "너무 작습니다" , Toast.LENGTH_SHORT).show()
               }
               else if(ran < Integer.parseInt(edittext.text.toString())){
                   Toast.makeText(this@MainActivity, "너무 큽니다" , Toast.LENGTH_SHORT).show()
               }
            }
        }
        btn2.setOnClickListener {
            ran = Random().nextInt(99)+1
            Toast.makeText(this@MainActivity, "리셋되었습니다." , Toast.LENGTH_SHORT).show()
        }
    }
}
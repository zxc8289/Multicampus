package com.example.a3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    var num = arrayOf(1,2,3,4,5,6,7,8,9)
    var data:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSpinnerNum()
        setButton()
        val start = findViewById<Button>(R.id.start)

        start.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("Data", data)
            startActivity(intent)
        }
    }

    fun setButton(){
        val setButton = findViewById<Button>(R.id.set)
        val spinner1 = findViewById<Spinner>(R.id.spinner1)

        setButton.setOnClickListener {
            data = spinner1.selectedItem.toString()
        }
    }

    fun setupSpinnerNum(){
        // 어댑터에 배열과 xml을 적용
        val adapter = ArrayAdapter(this, R.layout.item_spinner, num)

        // spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner1)
        spinner.adapter = adapter
    }
}
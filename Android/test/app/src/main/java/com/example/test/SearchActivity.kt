package com.example.abook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import com.example.test.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var dbHelper: DBHelper = DBHelper(applicationContext, "ABOOK.db", null, 1)

        val DatePicker2 = findViewById<DatePicker>(R.id.DatePicker2)
        val DataEditText = findViewById<TextView>(R.id.DataEditText)
        val Search_Button = findViewById<Button>(R.id.Search_Button)
        Search_Button.setOnClickListener{
            val Picker = DatePicker2.year.toString() + (DatePicker2.month + 1).toString() + DatePicker2.dayOfMonth.toString()

        }
    }
}

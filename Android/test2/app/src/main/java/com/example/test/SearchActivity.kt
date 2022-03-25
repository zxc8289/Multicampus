package com.example.test

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var dbHelper: DBHelper = DBHelper(applicationContext, "ABOOK.db", null, 1)
        var database = dbHelper.writableDatabase

        val DatePicker2 = findViewById<DatePicker>(R.id.DatePicker2)
        val DataEditText = findViewById<EditText>(R.id.DataEditText)
        val Search_Button = findViewById<Button>(R.id.Search_Button)
        val test10 = findViewById<EditText>(R.id.test10)

        Search_Button.setOnClickListener{
            val test = test10.text

            val result =  dbHelper!!.select(database, test.toString())
            Log.d("태그", "result : " + result)
            DataEditText.setText(result)
        }
    }
}
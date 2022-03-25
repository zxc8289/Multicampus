package com.example.member

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class searchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        var searchEditText = findViewById<EditText>(R.id.searchEditText)
        var searchButton = findViewById<Button>(R.id.searchButton)
        val dataText = findViewById<EditText>(R.id.dataEditText)

        searchButton.setOnClickListener {
            val txt = searchEditText.text.toString()
            val resultTxt = dbHelper!!.select(database, txt)
            dataText.setText(resultTxt)
        }
    }
}
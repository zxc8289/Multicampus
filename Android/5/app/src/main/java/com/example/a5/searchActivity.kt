package com.example.a5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class searchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val searchButton = findViewById<Button>(R.id.search_button)
        val searchText = findViewById<EditText>(R.id.search_EditText)
        val textView = findViewById<TextView>(R.id.textView7)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)

        searchButton.setOnClickListener {
            val txt = searchText.text

            val resultTxt = dbHelper.search(txt.toString())
            textView.text = resultTxt.toString()

        }
    }
}
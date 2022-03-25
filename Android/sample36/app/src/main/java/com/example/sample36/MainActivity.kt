package com.example.sample36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AddButton = findViewById<Button>(R.id.AddButton)
        val SearchButton = findViewById<Button>(R.id.SearchButton)
        val TurmButton = findViewById<Button>(R.id.TermButton)

        AddButton.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }

        SearchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        TurmButton.setOnClickListener {
            val intent = Intent(this, termSearchActivity::class.java)
            startActivity(intent)
        }
    }
}
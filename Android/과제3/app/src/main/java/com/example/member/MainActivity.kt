package com.example.member

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertBtn = findViewById<Button>(R.id.insertBtn)
        val deleteBtn = findViewById<Button>(R.id.deleteBtn)
        val searchBtn = findViewById<Button>(R.id.searchBtn)

        insertBtn.setOnClickListener {
            startActivity(Intent(this, InsertActivity::class.java))
        }

        deleteBtn.setOnClickListener {
            startActivity(Intent(this, deleteActivity::class.java))
        }

        searchBtn.setOnClickListener {
            startActivity(Intent(this, searchActivity::class.java))
        }
    }
}








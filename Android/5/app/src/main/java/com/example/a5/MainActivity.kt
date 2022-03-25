package com.example.a5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val searchButton = findViewById<Button>(R.id.searchButton)
        val updateButton = findViewById<Button>(R.id.updateButton)
        addButton.setOnClickListener {
            val intent = Intent(this, addActivity::class.java)
            startActivity(intent)
        }

        deleteButton.setOnClickListener {
            val intent = Intent(this, deleteActivity::class.java)
            startActivity(intent)
        }

        searchButton.setOnClickListener {
            val intent = Intent(this, searchActivity::class.java)
            startActivity(intent)
        }

        updateButton.setOnClickListener {
            val intent = Intent(this, updateActivity::class.java)
            startActivity(intent)
        }
    }
}
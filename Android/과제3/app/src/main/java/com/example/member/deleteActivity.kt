package com.example.member

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class deleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase
        setContentView(R.layout.activity_delete)
        val deleteEditText = findViewById<EditText>(R.id.deleteEditText)
        val deleteButton = findViewById<Button>(R.id.deleteButton)


        deleteButton.setOnClickListener {
            dbHelper.delete(database, deleteEditText.text.toString())
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
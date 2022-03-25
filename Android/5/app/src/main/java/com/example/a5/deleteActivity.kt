package com.example.a5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class deleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)
        val deleteButton = findViewById<Button>(R.id.delete_Button)
        val deleteText = findViewById<EditText>(R.id.delete_EditText)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)

        deleteButton.setOnClickListener {
            dbHelper.delete(deleteText.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
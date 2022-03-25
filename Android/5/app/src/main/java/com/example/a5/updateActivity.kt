package com.example.a5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class updateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)

        val updateButton = findViewById<Button>(R.id.update_button)
        val nameEditText = findViewById<EditText>(R.id.update_name_EditText)
        val ageEditText = findViewById<EditText>(R.id.update_age_EditText)
        val addEditText = findViewById<EditText>(R.id.update_add_EditText)

        updateButton.setOnClickListener {
            var name = nameEditText.text.toString()
            var age = ageEditText.text.toString()
            var address = addEditText.text.toString()

            dbHelper.update(name,age,address)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}
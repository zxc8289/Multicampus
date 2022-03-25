package com.example.a5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class addActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)

        val addBtn = findViewById<Button>(R.id.add_Button)
        val nameText = findViewById<EditText>(R.id.name_EditText)
        val ageText = findViewById<EditText>(R.id.age_EditText)
        val addText = findViewById<EditText>(R.id.add_EditText)

        addBtn.setOnClickListener {
            var name = nameText.text.toString()
            var age = ageText.text.toString()
            var address = addText.text.toString()

            dbHelper.insert(name, age, address)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }




}
package com.example.member

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InsertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        setContentView(R.layout.activity_insert)

        val insert = findViewById<Button>(R.id.insert)

        val insertName = findViewById<EditText>(R.id.insertName)
        val insertAge = findViewById<EditText>(R.id.insertAge)
        var insertRelationship = findViewById<EditText>(R.id.insertRelationship)
        var insertJob = findViewById<EditText>(R.id.insertJob)
        val insertAddress = findViewById<EditText>(R.id.insertAddress)
        val insertPhone = findViewById<EditText>(R.id.insertPhone)

        insert.setOnClickListener {

            val mem = Member(0,
                            insertName.text.toString(),
                            insertAge.text.toString().toInt(),
                            insertRelationship.text.toString(),
                            insertJob.text.toString(),
                            insertAddress.text.toString(),
                            insertPhone.text.toString()
                )

            dbHelper.insert(database, mem)

            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}
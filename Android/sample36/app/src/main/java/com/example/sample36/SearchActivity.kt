package com.example.sample36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        val selectBtn = findViewById<Button>(R.id.Search_Button)
        val editSelectresult = findViewById<EditText>(R.id.DataEditText)
        val picker = findViewById<DatePicker>(R.id.DatePicker2)
        val menuButton = findViewById<Button>(R.id.menu_Button)

        selectBtn.setOnClickListener {
            //val txt = editSelect.text
            val txt = picker.year.toString() + (picker.month + 1).toString() + picker.dayOfMonth.toString()
            val resultTxt = dbHelper!!.select(database, txt)
            editSelectresult.setText(resultTxt)
        }

        menuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
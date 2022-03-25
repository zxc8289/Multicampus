package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioGroup

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        val radioGroup = findViewById<RadioGroup>(R.id.RadioGroup)
        val DatePicker = findViewById<DatePicker>(R.id.DatePicker)
        val title = findViewById<EditText>(R.id.TitleEditText)
        val price = findViewById<EditText>(R.id.PriceEditText)
        val contents = findViewById<EditText>(R.id.MemoEditText)
        val AddButton = findViewById<Button>(R.id.AddButton)
        val MenuButton = findViewById<Button>(R.id.MenuButton)

        var RGroup:String = null.toString()
        radioGroup.setOnCheckedChangeListener{_, checkedId ->
            Log.d("RadioButton", "radio 버튼 클릭")
            when(checkedId){
                R.id.radio1 -> {
                    RGroup = "수입"
                }
                R.id.radio2 -> {
                    RGroup = "지출"
                }
            }
        }

        AddButton.setOnClickListener {
            val Title = title.text.toString()
            val Price = price.text.toString()
            val Contents = contents.text.toString()
            val Picker = DatePicker.year.toString() + (DatePicker.month + 1).toString() + DatePicker.dayOfMonth.toString()

            dbHelper.insert(database, RGroup , Title, Picker , Price, Contents)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        MenuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
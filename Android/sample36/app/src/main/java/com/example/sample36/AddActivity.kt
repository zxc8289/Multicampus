package com.example.sample36

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

        val insertBtn = findViewById<Button>(R.id.insertBtn)
        val TitleEditText = findViewById<EditText>(R.id.TitleEditText)
        val radioGroup = findViewById<RadioGroup>(R.id.RadioGroup)
        val DatePicker = findViewById<DatePicker>(R.id.DatePicker)
        val price = findViewById<EditText>(R.id.PriceEditText)
        val contents = findViewById<EditText>(R.id.MemoEditText)
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

        var dbHelper = DBHelper(this, "mydb.db", null, 1)

        var database = dbHelper.writableDatabase

        insertBtn.setOnClickListener {
            val txt = TitleEditText.text
            val Price = price.text
            val Contents = contents.text
            val Picker = DatePicker.year.toString() + (DatePicker.month + 1).toString() + DatePicker.dayOfMonth.toString()

            dbHelper.insert(database, RGroup,txt.toString(),Picker, Price.toString(), Contents.toString() )
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
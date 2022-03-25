package com.example.abook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.test.R
import java.util.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)
        var database = dbHelper.writableDatabase

        val RadioGroup = findViewById<RadioGroup>(R.id.RadioGroup)
        val DatePicker = findViewById<DatePicker>(R.id.DatePicker)
        val title = findViewById<EditText>(R.id.TitleEditText)
        val price = findViewById<EditText>(R.id.PriceEditText)
        val contents = findViewById<EditText>(R.id.MemoEditText)
        val AddButton = findViewById<Button>(R.id.AddButton)
        val MenuButton = findViewById<Button>(R.id.MenuButton)

        var RGroup:String = null.toString()
        RadioGroup.setOnCheckedChangeListener{_, checkedId ->
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


            dbHelper.insert(database,RGroup, Title, Price, Contents, Picker)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        MenuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
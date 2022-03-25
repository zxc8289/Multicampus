package com.example.accountbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample36.CustomAdapter
import com.example.sample36.DBHelper
import com.example.sample36.DataVo

class termSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_term_search)

        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        val selectBtn = findViewById<Button>(R.id.search_Button2)

        val picker1 = findViewById<DatePicker>(R.id.datePicker3)
        val picker2 = findViewById<DatePicker>(R.id.datePicker4)
        val menuButton = findViewById<Button>(R.id.menu_Button3)
        var recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        selectBtn.setOnClickListener {
            //val txt = editSelect.text
            val txt1 = picker1.year.toString() + (picker1.month + 1).toString() + picker1.dayOfMonth.toString()
            val txt2 = picker1.year.toString() + (picker2.month + 1).toString() + picker2.dayOfMonth.toString()


            val resultTxt1 = dbHelper!!.turmselect(database, txt1, txt2)

            var List = arrayListOf<DataVo>(
                DataVo(resultTxt1)
            )
            val mAdapter = CustomAdapter(this, List)
            recycleView.adapter = mAdapter

            val layout = LinearLayoutManager(this)
            recycleView.layoutManager = layout

            recycleView.setHasFixedSize(true)

        }

        menuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
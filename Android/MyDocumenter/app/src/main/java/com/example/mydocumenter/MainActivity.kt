package com.example.mydocumenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample30.CustomAdapter
import com.example.sample30.DataVo
import com.example.sample36.DBHelper

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertBtn = findViewById<Button>(R.id.insertBtn)
        var recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase



        var List = arrayListOf<DataVo>(
            DataVo("a","b",dbHelper.select(database),"d","e","kim"),
            )


        val mAdapter = CustomAdapter(this, List)
        recycleView.adapter = mAdapter

        val layout = LinearLayoutManager(this)
        recycleView.layoutManager = layout

        recycleView.setHasFixedSize(true)

        insertBtn.setOnClickListener {
            val intent = Intent(this, InsertActivity::class.java)
            startActivity(intent)
        }


    }
}
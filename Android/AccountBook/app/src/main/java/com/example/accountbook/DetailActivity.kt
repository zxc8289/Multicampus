package com.example.accountbook

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sample36.DataVo

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 짐풀러!
        val data = intent.getParcelableExtra<DataVo>("data")
        println(data?.text1)

        val Data = findViewById<TextView>(R.id.data)

        Data.text = data?.text1

    }

}
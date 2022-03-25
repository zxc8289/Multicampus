package com.example.sample08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    /*메뉴바*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    /*메뉴를 클릭하였을 때*/
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        println("onOptionItemSelected~!")
        val textView:TextView = findViewById<TextView>(R.id.textView)
        when(item.itemId){
            R.id.menu_search -> textView.text = "검색 클릭"

            R.id.menu_chat -> textView.text = "채팅 클릭"

            R.id.menu_email -> textView.text = "이메일 클릭"

            R.id.action_setting -> textView.text = "세팅 클릭"

        }
        return super.onOptionsItemSelected(item)
    }
}
package com.example.a3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as Random1

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val linerLayout = findViewById<LinearLayout>(R.id.linerLayout)
        val restart = findViewById<Button>(R.id.restart)
        var childLayout: LinearLayout? = null

        var btnCount = intent.getStringExtra("Data")?.toInt()

        for(i in 0 until btnCount!!){
            if(i % 3 == 0) {
                childLayout = LinearLayout(this)
                childLayout.orientation = LinearLayout.HORIZONTAL
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 200)
                childLayout.layoutParams = layoutParams
            }

            // 가로 세로 매치
            val btnParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
            btnParams.weight = 1.0f

            val normalBtn = Button(this).apply {

                text = (i + 1).toString()
                layoutParams = btnParams
                id = i

                setOnClickListener {
                    val com = listOf("safe","bingo")
                    val random = Random()
                    val num = random.nextInt(com.size)

                    text = com[num]
                    isEnabled = false

                }
            }

            childLayout?.addView(normalBtn)

            if(i % 3 == 2 || i == (btnCount -1)){
                linerLayout.addView(childLayout)
            }
        }

        restart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
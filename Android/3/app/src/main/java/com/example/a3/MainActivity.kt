package com.example.a3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

var ran1 = 0
var ran2 = 0
var ran3 = 0


class MainActivity : AppCompatActivity() {
    var num = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSpinnerAge()
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val textView1 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView3)
        val Count = findViewById<TextView>(R.id.textCount)

        reset()

        // play버튼을 눌렸을 때
        btn1.setOnClickListener {
            val userNum1 = spinner1.selectedItem
            val userNum2 = spinner2.selectedItem
            val userNum3 = spinner3.selectedItem
            var strike = 0
            var ball = 0

            // 입력한 숫자와 랜덤 숫자 3개 비교
            if (ran1 == userNum1) strike++
            else if ((ran1 == userNum2) or (ran1 == userNum3)) ball++

            if (ran2 == userNum2) strike++
            else if ((ran2 == userNum1) or (ran2 == userNum3)) ball++

            if (ran3 == userNum3) strike++
            else if ((ran3 == userNum1) or (ran3 == userNum2)) ball++

            textView1.text = strike.toString()
            textView2.text = ball.toString()

            count++
            Count.text = count.toString() + " 번째"

            if (strike == 3) {
                Toast.makeText(this@MainActivity, "이겼습니다.", Toast.LENGTH_SHORT).show()
                spinner1.setSelection(0)
                spinner2.setSelection(0)
                spinner3.setSelection(0)

                // strike, ball 초기화
                strike = 0
                ball = 0
                textView1.text = strike.toString()
                textView2.text = ball.toString()

                // count 초기화
                count = 0
                Count.text = count.toString() + " 번째"

                // 랜덤함수 재설정
                reset()
            }

            if (count == 11) {
                Toast.makeText(this@MainActivity, "기회 10번을 모두 소진하셨습니다.", Toast.LENGTH_SHORT).show()
                spinner1.setSelection(0)
                spinner2.setSelection(0)
                spinner3.setSelection(0)

                // strike, ball 초기화
                strike = 0
                ball = 0
                textView1.text = strike.toString()
                textView2.text = ball.toString()

                // count 초기화
                count = 0
                Count.text = count.toString() + " 번째"
                reset()
            }


        }

        // replay 버튼
        btn2.setOnClickListener{
            spinner1.setSelection(0)
            spinner2.setSelection(0)
            spinner3.setSelection(0)

            // strike, ball 초기화
            var strike = 0
            var ball = 0
            textView1.text = strike.toString()
            textView2.text = ball.toString()

            count = 0
            Count.text = count.toString() + " 번째"

            reset()
        }

    }

    fun reset(){
        // 랜덤함수
        ran1 = Random().nextInt(10)+1
        ran2 = Random().nextInt(10)+1
        ran3 = Random().nextInt(10)+1

        //중복방지 while문
        while(ran2 == ran1)
            ran2 = Random().nextInt(10)+1

        while((ran3 == ran2) or (ran3 == ran1))
            ran3 = Random().nextInt(10)+1
    }

    fun setupSpinnerAge(){
        // 어댑터에 배열과 xml을 적용
        val adapter = ArrayAdapter(this, R.layout.item_spinner, num)

        // spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner1)
        spinner.adapter = adapter

        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        spinner2.adapter = adapter

        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        spinner3.adapter = adapter
    }

}
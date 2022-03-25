package com.example.a2

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    var age = arrayOf("10대", "20대", "30대", "40대", "50대", "60대", "70대이상")
    var data:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog = AlertDialog.Builder(this)
        val btn = findViewById<Button>(R.id.button)

        val EditText1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val EditText2 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val checkbox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkbox2 = findViewById<CheckBox>(R.id.checkBox2)
        val spinner = findViewById<Spinner>(R.id.spinner)
        setupSpinnerAge()


        var RGroup:String = null.toString()
        radioGroup.setOnCheckedChangeListener{_, checkedId ->
            Log.d("RadioButton", "radio 버튼 클릭")
            when(checkedId){
                R.id.radioButton1 -> {
                    RGroup = "예"
                }
                R.id.radioButton2 -> {
                    RGroup = "아니오"
                }
                R.id.radioButton3 -> {
                    RGroup = "모르겠습니다."
                }
            }
        }

        var CheckGroup:String = null.toString()
        var listener = CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if(isChecked){
                when(buttonView.id) {
                    R.id.checkBox -> {
                        CheckGroup = "독일어"
                    }
                    R.id.checkBox2 -> {
                        CheckGroup = "프랑스어"
                    }
                }
            }
        }
        checkbox1.setOnCheckedChangeListener(listener)
        checkbox2.setOnCheckedChangeListener(listener)


        btn.setOnClickListener {
            data = spinner.selectedItem.toString()

            val result = "이름 : ${EditText1.text}\n\n" + "질문1) : ${RGroup}\n\n" + "질문2) : ${CheckGroup}\n\n" + "질문3) : ${EditText2.text}\n\n" + "질문4) : ${data}"

            dialog.setTitle("설문조사\n").setMessage(result).setPositiveButton("확인", { dialog, id -> ""})
            dialog.show()
        }

    }

    fun setupSpinnerAge(){
        // 어댑터에 배열과 xml을 적용
        val adapter = ArrayAdapter(this, R.layout.item_spinner, age)

        // spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }
}
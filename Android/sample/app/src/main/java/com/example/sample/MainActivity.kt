package com.example.sample

import android.content.ContentValues
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        /*
        setContentView(binding.root)

        binding.btnSay.setOnClickListener {
            Log.i(ContentValues.TAG, "btnSay 클릭")
            println("btnSay 클릭")

            binding.textSay.setText("Hello Android")
        }
        */

        setContentView(R.layout.activity_main)

        val textSay = findViewById<TextView>(R.id.textSay)
        val btnSay = findViewById<Button>(R.id.btnSay)

        btnSay.setOnClickListener{
            textSay.text = "Android World!"

            // Toast
            val toast = Toast.makeText(this.applicationContext, "버튼 클릭", Toast.LENGTH_SHORT)
            toast.show()

            AlertDialog.Builder(this@MainActivity)
                .setTitle("Welcome")
                .setMessage("어서오세요")
                .setCancelable(false)
                .setNeutralButton("닫기", DialogInterface.OnClickListener{
                    dialog, which ->
                }).show()
        }

        Log.i(ContentValues.TAG, "onCreate 실행")
    }

    override fun onStart() {
        super.onStart()
        Log.i(ContentValues.TAG, "onStart 실행")
    }

    override fun onResume() {
        super.onResume()
        Log.i(ContentValues.TAG, "onResume 실행")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(ContentValues.TAG, "onRestart 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.i(ContentValues.TAG, "onPause 실행")
    }

    override fun onStop() {
        super.onStop()
        Log.i(ContentValues.TAG, "onStop 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(ContentValues.TAG, "onDestroy 실행")
    }
}
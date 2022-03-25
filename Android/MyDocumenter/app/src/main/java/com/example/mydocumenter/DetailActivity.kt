package com.example.mydocumenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.sample30.DataVo

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 짐풀러!
        val data = intent.getParcelableExtra<DataVo>("data")

        val imageView = findViewById<ImageView>(R.id.img_profile)
        val userId = findViewById<TextView>(R.id.user_id)
        val userName = findViewById<TextView>(R.id.user_name)
        val userPay = findViewById<TextView>(R.id.user_pay)

        // imageView.setImageResource(R.drawable.kim)
        // imageView 에 data?.photo 명의 이미지를 drawing 하라
        Glide.with(this).load(getImage(data?.photo)).into(imageView)

        userId.text = data?.title
        userName.text = data?.regDate

    }

    fun getImage(imageName:String?) : Int{
        return resources.getIdentifier(imageName, "drawable", packageName)
    }

}
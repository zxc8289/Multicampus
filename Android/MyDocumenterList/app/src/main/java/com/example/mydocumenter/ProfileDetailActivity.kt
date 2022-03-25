package com.example.mydocumenter

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProfileDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)

        val dto = intent.getParcelableExtra<DataVo>("data")
        println("dto:${dto?.path}")

        // 짐풀러!
        val data = intent.getParcelableExtra<DataVo>("data")
        println(data?.content + " " + data?.reg)

        val imageView = findViewById<ImageView>(R.id.img_profile)
        val content = findViewById<TextView>(R.id.ContentText)
        val date = findViewById<TextView>(R.id.DateText)

        val myBitmap = BitmapFactory.decodeFile(dto?.path)
        imageView.setImageBitmap(myBitmap)

        content.text = data?.content
        date.text = data?.reg

    }

    fun getImage(imageName:String?) : Int{
        return resources.getIdentifier(imageName, "drawable", packageName)
    }

}
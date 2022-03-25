package com.example.mydocumenter

import android.graphics.BitmapFactory
import android.location.Address
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dto = intent.getParcelableExtra<DataVo>("data")
        println("dto:${dto?.path}")

        val detailImageView = findViewById<ImageView>(R.id.detailImageView)
        val detailContentText = findViewById<TextView>(R.id.detailContentText)
        val detailDateText = findViewById<TextView>(R.id.detailDateText)

        val myBitmap = BitmapFactory.decodeFile(dto?.path)
        detailImageView.setImageBitmap(myBitmap)

        detailContentText.text = dto?.content
        detailDateText.text = dto?.reg

        // map
        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        val mapsFragment = MapsFragment(this)
        fragmentTransaction.add(R.id.content, mapsFragment) // <- 수정됨
        fragmentTransaction.commit()

        val geocoder: Geocoder = Geocoder(this)

        var list: List<Address>? = geocoder.getFromLocationName(
            dto?.address,  // 지역 이름
            10
        )

        val mapBtn = findViewById<Button>(R.id.mapBtn)
        mapBtn.setOnClickListener {
            mapsFragment.setLocation(list!![0].latitude, list!![0].longitude)
        }
    }
}
package com.example.membersqrrestful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Member


class MainActivity : AppCompatActivity() {

    val list = arrayListOf<MemberDto>(
        MemberDto("kim", "kkk", "김", "kim@naver.com", 3),
        MemberDto("lee", "lll", "이", "lee@naver.com", 3),
        MemberDto("jin", "jjj", "진", "jin@naver.com", 3),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val memlist = MemberDao.getInstance().allMember()
        println(memlist[0].name)

        val mAdapter = CustomAdapter(this, memlist)
        recyclerView.adapter = mAdapter

        val layout = LinearLayoutManager(this)
        recyclerView.layoutManager = layout
        recyclerView.setHasFixedSize(true)


    }
}
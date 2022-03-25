package com.example.membersqrrestful

import android.telecom.Call
import retrofit2.http.GET


interface MemberService{
    @GET("allMember")
    fun allMember(): retrofit2.Call<List<MemberDto>>
}


class MemberDao {

    companion object{
        var memberDao:MemberDao? = null
        fun getInstance():MemberDao{
            if(memberDao == null){
                memberDao = MemberDao()
            }
            return memberDao!!
        }
    }

    fun allMember(): ArrayList<MemberDto>{
        val retrofit = RetrofitClient.getInstance()

        val service = retrofit?.create(MemberService::class.java)

        val call = service?.allMember()

        val response = call?.execute()

        return response?.body() as ArrayList<MemberDto>
    }
}
package com.example.springrestfull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

data class  MemberDto(val id:String, val pwd:String, val name:String, val email:String, val auth:Int)

interface ReadyService{
    // 1. 문자열 받기
    @GET("/base")
    fun base(): Call<String>

    // 2. 문자열 보내고 받기
    @GET("connParamGet")
    fun connParamGet(@Query("title") title:String):Call<String>
    
    // 3. object 를 보내고 받기
    @POST("/getMember")
    fun getMember(@Body mem:MemberDto) :Call<MemberDto>  // Get일때는 Query를쓰고 POST일때는 Body

    @GET("/dbTest")
    fun dbTest() : Call<List<MemberDto>>

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Network 처리에 추가한다 == HttpURLConnection
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        // Gson은 Java 객체를 JSON으로 변환할 수 있다.

        val gson = GsonBuilder()
                    .setLenient()
                    .create()

        val retrofit = Retrofit.Builder().baseUrl("http://192.168.0.14:3000/")
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .addConverterFactory(ScalarsConverterFactory.create())  // 문자열 리턴 받는 경우
                        .build()

        val service = retrofit.create(ReadyService::class.java)

        // 1. 문자열 받기
        //val call = service.base()
        
        // 2. 문자열 보내고 받기
        //val call = service.connParamGet("제목입니다.")
        
        // 3. object 를 보내고 받기
        //val call = service.getMember(MemberDto("aaa", "AAA", "bbb","test@test.com", 3))

        // 4.
        val call = service.dbTest()

        val response = call.execute()

        if(response.isSuccessful){
            if(response.code() == 200){

                // 1.
                //val base: String? = response.body()
                //println("base:$base")

                // 2.
                //val str:String? = response.body()
                //println("str:$str")

                // 3.
                //val dto:MemberDto? = response.body()
                //println("dto:$dto")

                // 4.
                val list = response.body() as List<MemberDto>
                println("Dtolist:$list")
            }

        }

    }
}
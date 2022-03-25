package com.example.membersqrrestful

import android.os.StrictMode
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitClient {
    companion object{
        private var instance: Retrofit? = null

        fun getInstance(): Retrofit? {

            if(instance == null) {
                val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
                StrictMode.setThreadPolicy(policy)

                // Gson은 Java 객체를 JSON으로 변환할 수 있다.

                val gson = GsonBuilder()
                    .setLenient()
                    .create()

                instance = Retrofit.Builder().baseUrl("http://192.168.0.14:3000/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addConverterFactory(ScalarsConverterFactory.create())  // 문자열 리턴 받는 경우
                    .build()
            }
            return instance
        }
    }
}
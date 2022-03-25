package com.example.a5

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.execSQL(
                "CREATE TABLE MEMBER(NAME TEXT," +
                        "AGE TEXT, ADDRESS TEXT);"
            )

        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    fun insert(name: String, age: String, address: String){
        var db: SQLiteDatabase = writableDatabase

        db.execSQL(
            "INSERT INTO MEMBER VALUES('" + name + "'" + ", '" + age + "'" + ", '" + address + "');"
        )
        db.close()
    }

    fun delete(name: String){
        var db: SQLiteDatabase = writableDatabase
        db.execSQL("DELETE FROM MEMBER WHERE NAME = '" + name + "';")
        db.close()
    }

    fun search(name: String){
        var db: SQLiteDatabase = writableDatabase
        db.execSQL("SELECT * FROM MEMBER WHERE NAME = '" + name + "';")
        db.close()
    }

    fun update(name:String, age:String, address: String){
        var db: SQLiteDatabase = writableDatabase
        db.execSQL(
            "UPDATE MEMBER SET NAME = '" + name + "'" + ", AGE = '" + age + "'" + ", ADDRESS = '" + address + "'" +
                    "WHERE NAME = '" + name + "';"
        )

        db.close()
    }


}




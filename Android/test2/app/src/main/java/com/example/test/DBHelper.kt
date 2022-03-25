package com.example.test

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
            var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE2( " + " EQ TEXT, " + " TITLE TEXT, " + " DATA TEXT, " + " PRICE TEXT, " + " CONTENTS TEXT) "
            db?.execSQL(sql)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE2 "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, EQ:String , TITLE:String, DATA:String, PRICE:String, CONTENTS:String){
        var sql = " INSERT INTO MYTABLE2 " + " VALUES('${EQ}', '${TITLE}', '${DATA}', '${PRICE}', '${CONTENTS}') "

        db.execSQL(sql)
    }


    @SuppressLint("Range")
    fun select(db: SQLiteDatabase, TITLE: String) : String?{
        var sql = " SELECT * FROM MYTABLE2 " +
                "   WHERE TITLE='${TITLE}' "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("TITLE"))
        }

        return str
    }
}




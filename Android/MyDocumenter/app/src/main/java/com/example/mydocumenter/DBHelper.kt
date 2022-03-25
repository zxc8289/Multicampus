package com.example.sample36

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.location.Address


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE( " +
                "    SEQ INTEGER PRIMARY KEY AUTOINCREMENT, " + " TXT TEXT, " + " ADDRESS TEXT, " + " TITLE TEXT, " + " CONTENT TEXT, " + " REGDATE TEXT) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, txt:String, address: String, title:String, content:String, regdate:String){
        var sql = " INSERT INTO MYTABLE(TXT,ADDRESS,TITLE,CONTENT,REGDATE) " +
                "   VALUES('${txt}','${address}','${title}','${content}','${regdate}') "

        db.execSQL(sql)
    }

    @SuppressLint("Range")
    fun select(db: SQLiteDatabase) : String?{
        var sql = " SELECT * FROM MYTABLE "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("TITLE"))
        }

        return str
    }

}






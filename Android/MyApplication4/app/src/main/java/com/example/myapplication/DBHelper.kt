package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE3(  " + " EQ TEXT, " + " TXT TEXT, " + " DATA TEXT, " + " PRICE TEXT, " + " CONTENTS TEXT) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE3 "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, eq:String , txt:String, data:String, price:String, contents:String){
        var sql = " INSERT INTO MYTABLE3(TXT) " + "  VALUES('${eq}', '${txt}', '${data}', '${price}', '${contents}') "
        db.execSQL(sql)
    }

    fun delete(db: SQLiteDatabase, seq:Int){
        var sql = " DELETE FROM MYTABLE3 " +
                "   WHERE seq=${seq} "

        db.execSQL(sql)
    }

    @SuppressLint("Range")
    fun select(db: SQLiteDatabase, txt:String) : String?{
        var sql = " SELECT * FROM MYTABLE3 " +
                "   WHERE TXT='${txt}' "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("TXT"))
        }

        return str
    }


}




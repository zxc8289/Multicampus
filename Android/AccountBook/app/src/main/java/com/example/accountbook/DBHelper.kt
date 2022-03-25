package com.example.sample36

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE(  " + " EQ TEXT, " + " TITLE TEXT, " + " DATA TEXT, " + " PRICE TEXT, " + " CONTENTS TEXT) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, eq:String , title:String, data:String, price:String, contents:String){
        var sql = " INSERT INTO MYTABLE " + "  VALUES('${eq}', '${title}', '${data}', '${price}', '${contents}') "
        db.execSQL(sql)
    }

    fun delete(db: SQLiteDatabase, seq:Int){
        var sql = " DELETE FROM MYTABLE " +
                "   WHERE seq=${seq} "

        db.execSQL(sql)
    }

    @SuppressLint("Range")
    fun select(db: SQLiteDatabase, data:String) : String?{
        var sql = " SELECT * FROM MYTABLE " +
                "   WHERE DATA='${data}' "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += "---------------------------------------------------"+"날짜 : "+result.getString(result.getColumnIndex("DATA")) + "\n용도 : " + result.getString(result.getColumnIndex("EQ"))  + "\n제목 : " + result.getString(result.getColumnIndex("TITLE"))  + "\n금액 : " + result.getString(result.getColumnIndex("PRICE"))  + "\n내용 : " + result.getString(result.getColumnIndex("CONTENTS")) + "\n"
        }

        return str
    }

    @SuppressLint("Range")
    fun turmselect():ArrayList<DataVo>{


        var sql = " SELECT * FROM MYTABLE " +
                "   WHERE DATA BETWEEN('${data1}')AND('${data2}')"
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("TITLE"))+"\n "+result.getString(result.getColumnIndex("DATA"))+"\t "+result.getString(result.getColumnIndex("PRICE")) + "\n"
        }
        return str
    }
    }






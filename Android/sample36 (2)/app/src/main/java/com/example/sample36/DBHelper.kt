package com.example.sample36

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE( " +
                           "    SEQ INTEGER PRIMARY KEY AUTOINCREMENT, " +
                           "    EQ TEXT , " + " TITLE TEXT , " + " DATE TEXT , " + " PRICE TEXT , " + " CONTENTS TEXT) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, txt:String){
        var sql = " INSERT INTO MYTABLE(TXT) " +
                "   VALUES('${txt}') "

        db.execSQL(sql)
    }

    fun delete(db: SQLiteDatabase, eq:String, title:String, date:String, price:String, contents:String){
        var sql = " DELETE FROM MYTABLE " +
                "   WHERE EQ=${eq} TITLE=${title} DATE=${date} PRICE=${}"

        db.execSQL(sql)
    }

    fun select(db: SQLiteDatabase, txt:String) : String?{
        var sql = " SELECT * FROM MYTABLE " +
                "   WHERE TXT='${txt}' "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("SEQ")) + " " +
                    "" + result.getString(result.getColumnIndex("TXT"))
        }

        return str
    }


}




package com.example.abook

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = " CREATE TABLE IF NOT EXISTS MYTABLE( " +
                           "    SEQ INTEGER PRIMARY KEY AUTOINCREMENT, " + " EQ TEXT , " + " TITLE TEXT , " + " DATE TEXT , " + " PRICE TEXT , " + " CONTENTS TEXT) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, eq:String, title:String, date:String, price:String, contents:String){
        var sql = " INSERT INTO MYTABLE(TXT) " + " VALUES('" + eq + "'" + ", '" + title + "'" + ", '" + date + "' , '" + price + "' , '" + contents + "') "

        db.execSQL(sql)
    }

}




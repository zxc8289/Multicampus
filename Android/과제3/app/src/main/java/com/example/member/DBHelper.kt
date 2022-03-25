package com.example.member

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql:String = " CREATE TABLE IF NOT EXISTS MYTABLE( " +
                "  name string, " +
                "  age integer, " +
                "  relationship string, " +
                "  job string, " +
                "  address string, " +
                "  phone string ) "
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = " DROP TABLE IF EXISTS MYTABLE "
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, vo:Member){
        var sql = " INSERT INTO MYTABLE " +   " VALUES('${vo.name}', ${vo.age}, '${vo.relationship}' , '${vo.job}' , '${vo.address}' , '${vo.phone}') "
        var db = this.writableDatabase
        db.execSQL(sql)
    }

    fun delete(db: SQLiteDatabase, name:String){
        var sql = " DELETE FROM MYTABLE " +
                "   WHERE name=${name} "
        db.execSQL(sql)
    }

    @SuppressLint("Range")
    fun select(db: SQLiteDatabase, name:String) : String?{
        var sql = " SELECT * FROM MYTABLE " +
                "   WHERE name=${name} "
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while (result.moveToNext()){
            str += result.getString(result.getColumnIndex("name")) + "\n나이 : " + result.getString(result.getColumnIndex("age"))  + "\n관계 : " + result.getString(result.getColumnIndex("relationship"))  + "\n직업 : " + result.getString(result.getColumnIndex("job"))  + "\n주소 : " + result.getString(result.getColumnIndex("address")) + "\n번호 : "+ result.getString(result.getColumnIndex("phone")) +"\n"
        }

        return str
    }

}








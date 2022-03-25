package Dao

import Dto.Human
import java.util.*

class bbDao {
    private var count = 0
    val sc = Scanner(System.`in`)
    val teamList = mutableListOf<String>()
    fun daoClass() {
        //프로그램 시작시 파일을 만들고 시작
        fileClass.createFile()
        count = 0
    }

    fun insert() {
        print("번호 : ")
        var number = sc.next()
        print("이름 : ")
        var name = sc.next()
        print("나이 : ")
        var age = sc.next()
        print("신장 : ")
        var height = sc.next()
        print("포지션(투수/타자) : ")
        var position = sc.next()

        teamList.add(number,name,age,height)

    }


}
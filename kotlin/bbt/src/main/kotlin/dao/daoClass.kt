package dao

import dto.batterClass
import dto.humanClass
import dto.pitcherClass
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.util.*


class daoClass {
    var sc: Scanner = Scanner(System.`in`)
    private val dtoArr = arrayOfNulls<humanClass>(20)
    private var count = 0
    private var selectIndex = 0


    fun insert() {
        print("번호: ")
        val number: String = sc.next()
        print("이름: ")
        val name: String = sc.next()
        print("나이: ")
        val age: String = sc.next()
        print("신장: ")
        val height: String = sc.next()
        print("포지션(투수/타자): ")
        val position: String = sc.next()
        positionChoice(position, count)
        dtoArr[count]!!.number = number
        dtoArr[count]!!.name = name
        dtoArr[count]!!.age = age
        dtoArr[count]!!.height = height
        count++
    }


    fun positionChoice(position: String?, index: Int) {
        when (position) {
            "투수" -> {
                print("승: ")
                val win: String = sc.next()
                print("패: ")
                val lose: String = sc.next()
                print("방어율: ")
                val ERA: String = sc.next()
                dtoArr[index] = pitcherClass(win, lose, ERA)
            }
            "타자" -> {
                print("타수: ")
                val bc: String = sc.next()
                print("안타 수: ")
                val hit: String = sc.next()
                print("타율: ")
                val ba: String = sc.next()
                dtoArr[index] = batterClass(bc, hit, ba)
            }
        }
    }

    fun delete() {
        val find = select()
        if (find) {
            dtoArr[selectIndex] = null
            if (selectIndex < count) {
                for (i in selectIndex + 1..count) {
                    dtoArr[i - 1] = dtoArr[i]
                }
            }
            count--
            println("삭제 완료!!")
        } else println("삭제할 데이터가 없습니다.")
    }

    fun select(): Boolean {   //검색
        val str: String
        var check = false
        print("검색할 이름: ")
        str = sc.next()
        for (i in 0 until count) {

            try {
                if (dtoArr[i]!!.name == str) {
                    selectIndex = i
                    check = true
                    break
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return if (check) {
            println(dtoArr[selectIndex].toString())
            true
        } else {
            println("해당 데이터는 없습니다.")
            false
        }
    }

    fun update() {  //수정
        val find = select()
        if (find) {
            print("번호: ")
            val number: String = sc.next()
            print("이름: ")
            val name: String = sc.next()
            print("나이: ")
            val age: String = sc.next()
            print("신장: ")
            val height: String = sc.next()
            instanceOfInsert()
            dtoArr[selectIndex]!!.number = number
            dtoArr[selectIndex]!!.name = name
            dtoArr[selectIndex]!!.age = age
            dtoArr[selectIndex]!!.height = height
            println("수정 완료")
        } else {
            println("수정할 데이터가 없습니다.")
        }
    }

    fun instanceOfInsert() {
        if (dtoArr[selectIndex] is batterClass)
            positionChoice("타자", selectIndex) else if (dtoArr[selectIndex] is pitcherClass)
            positionChoice("투수", selectIndex)
    }



    fun fileSave() {
        val path:String = "D:\\test\\test.rtf"
        val writer = FileWriter(path)

        try {
            writer.write(dtoArr.toString())
        } catch (e:Exception) {
            e.printStackTrace()
        } finally {
            writer.close()
        }

    }

    fun readfile() {
        val path:String = "D:\\test\\test.rtf"
        val br = File(path).bufferedReader()
        val list = mutableListOf<String>()
        br.useLines { e -> e.forEach { list.add(it) } }
        list.forEach { println(it) }
    }

    fun sort() {    //정렬
        val sort = sortClass(dtoArr)
        sort.init()
        sort.input()
        sort.sorting()
        for (i in dtoArr.indices) {
            if (dtoArr[i] != null) println(dtoArr[i].toString())
        }
    }


}
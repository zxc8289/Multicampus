package dao

import dto.Batter
import dto.Human
import dto.Pitcher

class MemberDao {
    private var list : MutableList<Human>? = null


    constructor(){
        list = ArrayList<Human>()
    }

    fun insert(){
        println(">> 선수등록")
        print("투수(1)/타자(2) 중 등록하고 싶은 포지션 >> ")
        var choice :Int? = readLine()?.toInt()
        // 공통 데이터
        print("번호")
        var number:Int? = readLine()?.toInt()

        print("이름")
        var name:String? = readLine()

        print("나이")
        var age:Int? = readLine()?.toInt()

        print("신장")
        var height:Double? = readLine()?.toDouble()

        var human = if (choice == 1){
            print("승")
            var win:Int? = readLine()?.toInt()
            print("승")
            var lose:Int? = readLine()?.toInt()
            print("방어율")
            var defence:Double? = readLine()?.toDouble()

            Pitcher(number,name, age, height, win, lose,defence)
        }
        else{
            print("타수")
            var batCount:Int? = readLine()?.toInt()
            print("승")
            var hit:Int? = readLine()?.toInt()
            print("방어율")
            var batAvg:Double? = readLine()?.toDouble()

            Batter(number,name, age, height, batCount, hit,batAvg)
        }
        list?.add(human)
    }
   fun delete(){

    }
    fun select(){

    }
    fun update(){

    }

    fun allPrint(){
        for(mem in list!!){

        }
    }

    fun search(name:String):Int{
        return 0;
    }

    fun fileSave(){

    }

    fun hitAvgSort(){

    }
}
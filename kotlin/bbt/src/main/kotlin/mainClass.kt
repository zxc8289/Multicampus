import dao.daoClass
import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
        var choice: Int
        val dao = daoClass()
        while (true) {
            val sc = Scanner(System.`in`)
            println("=====================================")
            println("1.선수 추가")
            println("2.선수 삭제")
            println("3.선수 검색")
            println("4.선수 수정")
            println("5.타율/방어율 순서 출력")
            println("6.선수명단 저장")
            println("7.선수명단 불러오기")
            println("8.종료")
            print("어느 작업을 하시겠습니까? >> ")
            choice = sc.nextInt()
            when (choice) {
                1 -> dao.insert()
                2 -> dao.delete()
                3 -> dao.select()
                4 -> dao.update()
                5 -> dao.sort()
                6 -> dao.fileSave()
                7 -> dao.readfile()
                8 -> exitProcess(0)
            }
        }
}

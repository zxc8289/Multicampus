import Dao.bbDao
import java.util.*

fun main(args: Array<String>) {
    val dao = bbDao()
    var choice: Int
    while (true) {
        val sc = Scanner(System.`in`)
        println("1.선수추가")
        println("2.선수삭제")
        println("3.선수검색")
        println("4.선수수정")
        println("5.타율순서 출력")
        println("6.방어율 순서")
        println("7.선수명단 저장")
        println("8.선수명단 불러오기")
        println("9.종료")
        println("어느 작업을 하시겠습니까? >>")
        choice = sc.nextInt()
        when (choice) {
            1 -> dao.insert()

        }
    }
}



/*
야구팀 관리 프로그램
Dto
Dto.Human(number(번호), name(이름), age(나이), height(신장))

Pitcher win(승), lose(패), defence(방어율율)
Batter batCount(타수), hit(안타수), batavg(타율)

Dao
MutableList
선수추가
선수삭제
선수검색
선수수정
타율순서 출력
방어율 순서
저장(file)
선수명단 저장
선수명단 불러오기
*/

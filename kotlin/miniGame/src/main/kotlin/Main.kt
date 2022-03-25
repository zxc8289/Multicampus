import java.util.*

fun main(args: Array<String>) {
   /*
        Random number 찾기

        범위 : 1 ~ 100
                76

        입력 : 45 -> 너무 작습니다.
               80 -> 너무큽니다.

        기회 : 10번
                축하합니다/다시 도전
        replay -> yes/no

    */

    val sc: Scanner = Scanner(System.`in`)
    var w:Int = 0
    var randomNum = (Math.random() * 100).toInt() + 1  // 랜덤값 0~99

    while(w<10) {

        print("1~100 사이의 숫자를 입력하세요 : ")
        val num = sc.nextInt()
        if((num > 0) and (num < 101)){
            if(num > randomNum){
                println("큽니다.")
                println(randomNum)
                w++
            }
            else if(num < randomNum){
                println("작습니다.")
                println(randomNum)
                w++
            }
            else{
                println("축하합니다 정답입니다.")
                print("다시도전 yes/no : ")
                val replay = sc.next()
                if(replay == "yes"){
                    randomNum = (Math.random() * 100).toInt() + 1
                    w==0
                }
                else if(replay == "no"){
                    println("게임을 종료합니다.")
                    break;
                }
            }
        }
        else{
            println("1~100 사이 숫자를 입력해주세요.")
        }
    }
}
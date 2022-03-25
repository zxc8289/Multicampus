import java.util.*

fun main(args: Array<String>) {
   /*
        가위 바위 보 게임
        com <-> user
        
        com : random
        user : input
        ? 승 ? 패 ? 무
   */
    val sc: Scanner = Scanner(System.`in`)
    var win:Int = 0;
    var lose:Int = 0;
    var draw:Int = 0
    val com = listOf("가위","바위","보")

    while (true) {
        val random = Random().nextInt(com.size)
        println("${win}승 ${lose}패 ${draw}무")
        print("가위 바위 보 중에서 입력해주세요(게임 나가기 e입력) : ")
        val user = sc.next()

        if (com[random] == user) {
            println("비겼다\n")
            draw++
        } else if ((com[random] == "가위" && user == "보") or (com[random] == "바위" && user == "가위") or (com[random] == "보" && user == "바위")) {
            println("졌다\n")
            lose++
        } else if ((com[random] == "보" && user == "가위") or (com[random] == "가위" && user == "바위") or (com[random] == "바위" && user == "보")){
            println("이겼다\n")
            win++
        } else if(user=="e"){
            println("게임을 종료합니다.")
            break;
        } else{
            println("잘못입력하셨습니다.")
        }
    }
}

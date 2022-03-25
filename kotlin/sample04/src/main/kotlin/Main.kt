import kotlin.Exception

fun main(args: Array<String>) {
   // try catch finally
//    val a = 6
//    val b = 0
//    var c:Int
//
//    try {
//        c = a / b
//    }catch (e: ArithmeticException){
//        println("${e.message}")
//    }catch (e: Exception){
//        println("${e.message}")
//    }

    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    }catch (e:Exception){
        println(e.message)
    }

    println("program end")
}
fun checkAmount(amount : Int){
    if(amount < 1000){
        throw Exception("잔고가 $amount 으로 1000이하 입니다.")
    }
}
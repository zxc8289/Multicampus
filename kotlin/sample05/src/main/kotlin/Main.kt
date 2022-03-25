fun main(args: Array<String>) {
    val result = sum(3,7)
    println(result)

    val m = max(15, 1)
    println(m)

    // default parameter
    add("홍길동", "hong@naver.com")
    add("일지매")

    add2(200, 100, 300)

    allocParam(1,2,3,4)
}
fun sum(a: Int, b: Int) = a+b       // 람다식

//fun max(a:Int,b:Int):Int{
//    return if(a > b)a else b
//}

fun max(a:Int,b:Int) = if(a>b) a else b

// default
fun add(name:String, email:String = "nobody"){
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun add2(x:Int = 100, y:Int = 200 , z:Int){
    println(x + y + z)
}

fun allocParam(vararg counts:Int){
    for(num in counts){
        print("$num")
    }
    print("\n")
}
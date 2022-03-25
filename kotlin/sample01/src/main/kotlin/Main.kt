import java.util.*

fun main(args: Array<String>) {
//    val input = readLine()
//    println("You input : $input")
//
//    val read = Scanner(System.`in`)
//    val number = read.nextInt()
//    println("number : $read")
//    var str:String = "abc"
//    val name:String = "최철"
//
//    str = "bcd"
//
//
//    println("str : " + str)
//    println("name : $name")
//    println(str + name)
//
//    var a = 1
//    val str1 = "a = $a"
//    val str2 = "a = ${a + 1}"
//
//    println("str1 : \"$str1\", str2: \"$str2\"")
//
//    val num1 = 5        // Int로 추론
//    val num2 = 3
//
//    val num3:Int = num1 + num2
//    println("num1 + num2 = $num3")
//
//    // 문자열 비교
//    var str3: String = "hello"
//    var str4 = "world"
//    var str5 = "hell"
//    str5 += "o"
//
//    println("str5 = $str5" )
//    println( "${ str3 == str5 }" )  // equals 자동호출
//    println( "${ str3 === str5 }" ) // 값을 비교
//    println( "${ str3 === str4 }" )
//
//    val num4:Int = 123
//    val num5 = num4
//    println("num4 === num5 ${num4 === num5}")
//
//    val num6:Int = num4
//    val num7:Int = num4
//    val num8:Int = num4
//
//    println(num6 == num7)
//    println(num6 === num7)

      // ? !!
//    var a: Int? = null
//    var b: Int? = 10
//
//    var c:Int = b!!     // 강제
//
//    var str1:String? = "Hello Kotlin"
//    str1 = null
//
//    // 자료형의 비교
//    println("Byte min:" + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE)
//    println("Short min:" + Short.MIN_VALUE + " max: " + Short.MAX_VALUE)
//    println("Short min:" + Int.MIN_VALUE + " max: " + Int.MAX_VALUE)
//
//    val num1:Double = 12.0
//    val num2:Double = 23.0
//    var result:Double = 0.0
//
//    result = num1 / num2
//    println("$result")
//
//    var n = 10
//    n++
//    ++n
//    println(n)

//    var a:Int = 12
//    val b:Boolean = true
//    var d:Double = 12.345
//
//    val s = a.toString()
//    println(s)
//
//    var num:Int = s.toInt()
//    println("${num + 1}")

    val a:Int = 128
    val b = a
    println(a===b)

    val c:Int? = a
    val d:Int? = a

    println(c==d)
    println(c === d)
}
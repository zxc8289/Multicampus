fun main(args: Array<String>) {
    /*
    var num:Int = 50

    val str = if(num > 30){"abc"}else{"bcd"}

    println(str)
    */

//    var num:Int = 30
//    val str = if(num>30)"abc" else "bcd"
//    println("$str")
//    val num = 256
//
//    if(num is Int){
//        println("인트입니다.") }
//    else if(num !is Int){
//        println("정수가아닙니다.") }
//
//    if((num > 0) && (num < 300)){
//        println("num은 300보다 작다.")
//    }
//
//    val a = 12
//    val b = 7
//    val max:Int
//
//    if(a > b) max = a else max = b
//    println(max);
//
//    val score = 93.5
//
//
//    val grade = if(score >= 90){
//        'A'
//    }
//    else if(score in 80.0..89.9){
//        'B'
//    }
//    else if(score in 70.0..79.9){
//        'C'
//    }
//    else{
//        'D'
//    }
//
//    println("score : $score grade : $grade")
    val score = 85.0
    var grade:Char = 'F'

//    when(score){
//        in 90.00..100.0 -> grade = 'A'
//        in 80.00..89.9 -> grade = 'B'
//        in 70.00..79.9 -> grade = 'C'
//        !in 70.00..100.0 -> grade = 'F'
//    }

//    when{
//        score >= 90.0 -> grade = 'A'
//        score in 80.0..89.9-> grade = 'B'
//        score in 70.0..79.9 -> grade = 'C'
//        score < 70.0 -> grade = 'F'
//    }

//    println("score:$score , grade:$grade")

    // for 문
    val array = arrayOf(1,2,3)
    for(number in array){
        println(number)
    }

    for(i in 0 until 100){
        println(i)
    }

    for (i in 99 downTo 0){
        println(i)
    }

    for(i in 0..100 step 2){        // 2씩증가
        println(i)
    }

    // while, do while
    var w:Int = 0

    while(w < 10){
        println("w:$w")
        w++
    }

    w = 0
    do{
        w++
        println("w:$w")
    }while (w<10)

    // continue, break
    for (i in 1..5){
        if(i==4) continue       // 4스킵
        println(i)
    }
}
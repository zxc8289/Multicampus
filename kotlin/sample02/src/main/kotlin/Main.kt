import java.util.*

fun main(args: Array<String>) {
//    val array = intArrayOf(1,2,3)
//
//    println(array)
//    println(array[1])
//    println(Arrays.toString(array))
//    println(array.contentToString())
//
//    val array1 = arrayOf(1,1.23,"하이", true)
//    println(array1.contentToString())
//
//    var array2 = Array(10, {33})
//    for(n in array2){
//        println(n)
//    }
//
//    var array4 = arrayOf<Int>(10,20,30)
//    array4.forEach { println(it) }
//
//    var array5 = arrayOf<String>("일","이","삼")
//
//    var array = intArrayOf(1,2,3,4,5)
//    println("${array.size}")
//    println("${array.sum()}") // 배열 다더한값
//
//    println(array[2])
//    println(array.get(2))
//
//    array[0] = 10
//
//    for (i in array.indices){
//        println(i)
//    }
//
//    for (i in 0..array.size - 1){
//        println("array[$i] = ${array[i]}")
//    }

    val array = arrayOf(1,-2,3,4,-5,0)

    // 0보다 큰 요소
    array.filter { e -> e > 0 }.forEach { e -> print("$e ") }


    val result = array.filter { e -> e > 0 }
    println(result)


    val fruits = arrayOf("banana", "pear", "apple", "avocado")

    fruits.filter { it.startsWith("a")}.
    sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) } // 맨앞글자가 a인값 sortedBy 오름차순

    when{       // 조건문
        "apple" in fruits -> println("apple이있네")
    }

    val products = arrayOf(
        Product("Mouse", 3000.0),
        Product("Keyboard", 5500.0),
        Product("Monitor", 250000.0),
        Product("Tablet", 180000.0)
    )
    products.sortedByDescending { it.price }.forEach { println("${it.name}, ${it.price}") }
    products.forEach { println("${it.name}, ${it.price}") }
}
data class Product(val name: String, val price: Double)





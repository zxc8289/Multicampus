fun main(args: Array<String>) {
    val arr = arrayOf(1, -2, 3, 4, -5, 0)
    arr.for?for { e -> e > 0 }.forEach { e -> print("$e ") }
}


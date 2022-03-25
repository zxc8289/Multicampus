fun main(args: Array<String>) {
//    val prt = myPrinter()
//    prt.print()
    myPrinter.print()

    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}

//abstract class Printer{
//    abstract fun print()
//    fun method() = println("Printer method()")
//}
//
//class myPrinter : Printer(){
//    override  fun print(){
//        println("출력합니다")
//    }
//}


abstract class Printer{
    abstract fun print()
    fun method() = println("Printer method()")
}

val myPrinter = object  : Printer(){
    override fun print() {
        println("myPrinter print")
    }
}

// Vehicle 탈것
// abstract class = 일반메소드 + 추상메소드
abstract class Vehicle(val name:String, val color:String, val weight:Double){
    abstract var maxSpeed:Double

    var year = "2019"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs(){
        println("Name:$name, Color:$color, Weight:$weight, Year:$year, Max Speed:$maxSpeed")
    }
}

interface Bird{
    val wings:Int
    fun fly()
    fun jump(){
        println("Bird jump")
    }
}

interface Horse{
    val maxSpeed:Int
    fun run()
    fun jump(){
        println("Horse jump & max speed: $maxSpeed")
    }
}

class Pegasus: Bird, Horse{
    override val wings: Int = 2
    override val maxSpeed: Int = 100

    override fun fly() {
       println("Fly~")
    }

    override fun run() {
        println("Run!")
    }

    override fun jump() {
        super<Horse>.jump()
        println("Pegasus jump")
    }

}
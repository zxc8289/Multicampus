fun main(args: Array<String>) {
    val base = Base("길동", "홍", 24)
    base.firstname = "진호"

    println(base.fullName)

    val child = Child("춘향", "성", 15)
    println( child.lastname )
    println( child.fullName )
}

open class Base(var firstname:String ="길동", val lastname:String ="홍", var age:Int = 24){
/*
class Base{
    var firstname:String
    val lastname:String
    var age:Int

    constructor(firstname:String,  lastname:String, age:Int){
        this.firstname = firstname
        this.lastname = lastname
        this.age = age
    }
*/

    open val fullName: String
        get() = "$firstname $lastname"
}

class Child(firstname:String, lastname:String, age:Int, var address) :Base( firstname, lastname, age){

    override val fullName: String
        get() = "$firstname $age $address"
}

class Calc{

    fun add(x:Int, y:Int) : Int = x + y
    fun add(x:Double, y:Double) : Double = x + y
    fun add(x:Int, y: Int, z:Int) : Int = x + y + z
    fun add(x:Double, y: Double, z:Double) : Double = x + y + z
}
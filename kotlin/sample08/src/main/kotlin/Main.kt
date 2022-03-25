fun main(args: Array<String>) {
//    var person = Person("춘향", "성", 16)
//    val lastName = person.lastName
//
//    person.age = person.age+1
//    println(person.toString())

    val human = Human()
    human.method()

    val bird = Brid("나이팅게일", 2, "블루")
    println( bird.toString())

    val base = Base("abc", "1234", 25)
    println(base.toString())

    val base2 = Base("bcd", "234")
    println(base2.toString())
}



class Base(var id:String, val pwd:String, val age:Int){     // 기본생성자

    constructor(id:String, pwd:String) : this(id, pwd, 24){ // 보조생성자
        println("constructor(id:String, pwd:String, age:Int)")
    }

    override fun toString(): String {
        return "Base(id='$id', pwd='$pwd', age=$age)"
    }

}

class Brid(var name: String,var wing: Int,var color: String){
//    var name:String
//    var wing:Int
//    var color:String
    val vol:Int = 1

//    constructor(name: String, wing: Int, color: String) {
//        this.name = name
//        this.wing = wing
//        this.color = color
//    }

    fun fly() = println("Fly Wing: $wing")

    override fun toString(): String {
        return "Brid(name='$name', wing=$wing, color='$color', vol=$vol)"
    }


}

open class Person{
    val firstName:String = ""
    val lastName:String = ""
    private var age:Int = 24

    protected var protectedVar:Int = 12

//    constructor(firstName: String, lastName: String, age: Int) {
//        this.firstName = firstName
//        this.lastName = lastName
//        this.age = age
//    }

    private fun privateFunc(){

    }

    override fun toString(): String {
        return "firstName='$firstName', lastName='$lastName', age=$age"
    }
}

class Human : Person(){
    fun method(){
        protectedVar = 23
        println(protectedVar)
    }
}
package Dto

class Human(var number: String, var name: String, var age: String, var height: String) {

    override fun toString(): String {
        return "Human [number=$number, name=$name, age=$age, height=$height]"
    }
}

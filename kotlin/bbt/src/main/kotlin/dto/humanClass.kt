package dto

open class humanClass {
    var number: String? = null
    var name: String? = null
    var age: String? = null
    var height: String? = null

    constructor() {}
    constructor(number: String?, name: String?, age: String?, height: String?) {
        this.number = number
        this.name = name
        this.age = age
        this.height = height
    }

    override fun toString(): String {
        return "번호=$number, 이름=$name, 나이=$age, 신장=$height, "
    }


}
package dto

class Batter :Human {
    var batCount:Int = 0
    var hit:Int = 0
    var btaAvg:Double = 0.0

    constructor() : super(0,"",0,0.0)

    constructor(number: Int, name: String, age: Int, height: Double) : super(number, name, age, height){
        this.batCount = batCount
        this.hit = hit
        this.btaAvg = btaAvg
    }

    override fun toString(): String {
        return "$batCount-$hit-$btaAvg"
    }

}
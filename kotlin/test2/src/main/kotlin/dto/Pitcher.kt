package dto

class Pitcher :Human{
    var win:Int = 0
    var lose:Int = 0
    var defense:Double = 0.0

    constructor() : super(0,"",0,0.0)

    constructor(number: Int, name: String, age: Int, height: Double) : super(number, name, age, height){
        this.win = win
        this.lose = lose
        this.defense = defense
    }

    constructor(number: Int?, name: String?, age: Int?, height: Double?, win: Int?, lose: Int?, defence: Double?)


    override fun toString(): String {
        return "$win-$lose-$defense"
    }


}
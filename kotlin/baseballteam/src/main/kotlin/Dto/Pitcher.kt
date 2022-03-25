package Dto

class Pitcher(var win: String, var lose: String, var defense: String) {

    override fun toString(): String {
        return "Pitcher [win=$win, lose=$lose, defense=$defense]"
    }
}

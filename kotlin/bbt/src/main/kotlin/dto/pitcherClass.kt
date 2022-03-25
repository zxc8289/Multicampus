package dto

class pitcherClass : humanClass {
    //투수
    //승, 패배, 방어율
    val position = "투수"
    var win //승
            : String? = null
    var lose //패배
            : String? = null
    var era // 방어율
            : String? = null

    constructor() {}
    constructor(win: String?, lose: String?, era: String?) : super() {
        this.win = win
        this.lose = lose
        this.era = era
    }

    override fun toString(): String {
        return ("[(" + position + ") " + super.toString() + "승=" + win + ", 패배=" + lose + ", 방어율=" + era + "]")
    }
}
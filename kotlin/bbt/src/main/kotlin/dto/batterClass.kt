package dto

class batterClass : humanClass {
    //타자
    // 타수, 안타 수, 타율
    val position = "타자"
    var bc // 타수
            : String? = null
    var hit //안타 수
            : String? = null
    var ba // 타율
            : String? = null

    constructor() {}
    constructor(bc: String?, hit: String?, ba: String?) : super() {
        this.bc = bc
        this.hit = hit
        this.ba = ba
    }

    override fun toString(): String {
        return "[(" + position + ") " + super.toString() + "타수=" + bc + ", 안타 수=" + hit + ", 타율=" + ba + "]"
    }
}
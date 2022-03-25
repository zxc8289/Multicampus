package dao

import dto.batterClass
import dto.humanClass
import dto.pitcherClass
import java.util.*


class sortClass(
    var number: Array<humanClass?>
) {
    var N //입력 받는 변수.
            = 0
    var upDown //1 올림 -1 내림
            = false

    fun init() {
        upDown = true
    }

    fun input() {
        val sc = Scanner(System.`in`)

        // 입력
        println("무엇으로 정렬할 거니? ")
        println("1.타율(타자) / 2.승(투수) ")
        N = sc.nextInt()
        print("올림?내림?(올림:1, 내림 :-1): ")
        val num: Int = sc.nextInt()
        upDown = if (num == 1) true else false
    }

    fun sorting() {
        for (i in 0 until number.size - 1) {
            // 타자일때
            if (number[i] is batterClass) {
                val BA_i = (number[i] as batterClass).ba!!.toDouble()
                for (j in 0 until number.size - 1 - i) {
                    if (number[j] is batterClass) {
                        val BA_j = (number[j] as batterClass).ba!!.toDouble()
                        if (upDown) { // 올림// 올림차순 sort
                            if (BA_i > BA_j) {
                                println("BA_i = $BA_i BA_j= $BA_j")
                                swap(i, j)
                            }
                        } else { // 내림
                            // 내림차순 sort
                            if (BA_i < BA_j) {
                                swap(i, j)
                            }
                        }
                    }
                }
            } // 투수일때
            else if (number[i] is pitcherClass) {
                val era_i = (number[i] as pitcherClass).era!!.toInt()
                for (j in 0 until number.size - 1 - i) {
                    if (number[j] is pitcherClass) {
                        val era_j = (number[j] as pitcherClass).era!!.toInt()
                        if (upDown) { // 올림// 올림차순 sort
                            if (era_i > era_j) {
                                swap(i, j)
                            }
                        } else { // 내림
                            // 내림차순 sort
                            if (era_i < era_j) {
                                swap(i, j)
                            }
                        }
                    }
                }
            }
        }
    }

    fun swap(i: Int, j: Int) {
        val tmp = number[i]
        number[i] = number[j]
        number[j] = tmp
    }

    fun resultPrint() {
        for (i in number.indices) {
            print(number[i].toString() + " ")
        }
    }
}
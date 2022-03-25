package Dto

class Batter(var batCount: String, var hit: String, var batavg: String) {

    override fun toString(): String {
        return "Batter [batCount=$batCount, hit=$hit, batavg=$batavg]"
    }
}
package chap05.section2

fun main() {

    var total = 0

    for (num in 1..100 step 2) { // odd
        total += num
    }

    for (num in 0..99 step 2) { // even
        total += num
    }

    println("total: $total")
}
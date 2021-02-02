package chap05.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of Func")
    inlineLambda(12, 3) lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit // return@inlineLambda 도 가능 (암묵적 라벨)
        println("result: $result")
    }

    println("End of Func")
}

fun labelBreak() {
    println("label Break")

    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}
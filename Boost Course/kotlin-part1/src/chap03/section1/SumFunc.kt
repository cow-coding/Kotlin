package chap03.section1

fun sum(a: Int, b: Int) = a + b

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun outfunc(name: String = "default") = println("Name: $name")

fun main() { // 최상위 (Top-level)함수
    val result1 = sum(1, 3)

    val a = 3
    val b = 5

    val result2 = max(a, b)
    outfunc("Park")
    outfunc()
    println(result1)
    println(result2)
}
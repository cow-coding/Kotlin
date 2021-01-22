package chap02.section3

fun main() {
    var a: Any = 1 // Any type is Int type when initialized 1
    a = 20L // Int -> Long
    println("a: $a, type: ${a.javaClass}") // print the a's java basic type
}
package chap03.section1

fun normalVarargs(vararg a: Int) {
    for (num in a) {
        println(num)
    }
}

fun normalVarargs2(arg: Array<String>) {
    for (num in arg) {
        println(num)
    }
}

fun main() {
    normalVarargs(1)
    normalVarargs(1,2,3,4,5)
}
package chap02.section3

fun main() {
    demo("hello")
    demo(3)
}

fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }

    if (x is Int) {
        print("x is ${x.javaClass} type")
    }
}
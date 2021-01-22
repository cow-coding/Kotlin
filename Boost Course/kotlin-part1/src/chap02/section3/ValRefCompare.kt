package chap02.section3

fun main() {
    val a: Int = 127
    val b = a

    println(b == a)
    println(b === a)

    val c: Int = a // 실제 stack영역에 저장
    val d: Int? = a // 실제 stack영역에 저장
    val e: Int? = c // 객체로 저장, stack 영역에는 참조 주소 저장

    println(c == d)
    println(c === d)
    println(e == d)

    val num3: Int = 128
    val num4: Int? = 128
    val num5: Int? = num3

    println(num3 == num4)
    println(num3 === num4)
    println(num4 === num5)
}
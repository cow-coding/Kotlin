package chap05.section2

fun main() {
    print("Enter the number: ")

    var number = readLine()!!.toInt()
    var factorial = 1L

    while (number > 0) {
        factorial *= number
        number--
    }

    println("Factorial: $factorial")
}
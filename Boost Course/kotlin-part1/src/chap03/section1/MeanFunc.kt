package chap03.section1

fun avgFunc(initial:Float = 0f, vararg numbers:Float): Double {
    var result = 0f

    for (num in numbers) {
        result += num
    }

    println("result: $result, numvers.size: ${numbers.size}")

    val avg = (result / numbers.size).toDouble()

    return avg + initial
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println(result)
}
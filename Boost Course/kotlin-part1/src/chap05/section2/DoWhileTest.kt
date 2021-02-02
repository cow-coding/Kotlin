package chap05.section2

fun main() {

    do {
        print("Enter the number: ")
        val input = readLine()!!.toInt()

        for (i in input until 0) {
            for (j in 0 until input) {
                print((i + j) % input + 1)
            }
            println()
        }

    } while (input != 0)
}
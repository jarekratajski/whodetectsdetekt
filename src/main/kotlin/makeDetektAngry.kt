

fun main() {
    kotlin.io.println("runs")
    val x = NUM1
    if (x<NUM2) {
        println("unexpected")
    }
    if (x==NUM2) {
        println("unexpected")
    }
}

const val NUM1 = 7
const val NUM2 = 5

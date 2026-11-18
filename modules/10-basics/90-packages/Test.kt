import exercise.measurementLabel

fun testSolution() {
    assert(measurementLabel(7) == "7 m | 7 s") { "positive" }
    assert(measurementLabel(0) == "0 m | 0 s") { "zero" }
    assert(measurementLabel(-3) == "-3 m | -3 s") { "negative" }
    assert(measurementLabel(1000) == "1000 m | 1000 s") { "larger value" }
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

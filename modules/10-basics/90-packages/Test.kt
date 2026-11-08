import exercise.measurementLabel

fun testSolution() {
    expectEquals("7 m | 7 s", measurementLabel(7), "positive")
    expectEquals("0 m | 0 s", measurementLabel(0), "zero")
    expectEquals("-3 m | -3 s", measurementLabel(-3), "negative")
    expectEquals("1000 m | 1000 s", measurementLabel(1000), "larger value")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

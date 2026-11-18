fun testSolution() {
    assert(minutesToHours(0) == 0.0) { "zero" }
    assert(minutesToHours(60) == 1.0) { "one hour" }
    assert(minutesToHours(90) == 1.5) { "fractional hours" }
    assert(minutesToHours(15) == 0.25) { "quarter hour" }
    assert(minutesToHours(-30) == -0.5) { "negative offset" }
    assert(minutesToHours(1440) == 24.0) { "one day" }
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

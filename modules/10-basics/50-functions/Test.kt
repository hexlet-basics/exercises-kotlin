fun testSolution() {
    expectEquals(0.0, minutesToHours(0), "zero")
    expectEquals(1.0, minutesToHours(60), "one hour")
    expectEquals(1.5, minutesToHours(90), "fractional hours")
    expectEquals(0.25, minutesToHours(15), "quarter hour")
    expectEquals(-0.5, minutesToHours(-30), "negative offset")
    expectEquals(24.0, minutesToHours(1440), "one day")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

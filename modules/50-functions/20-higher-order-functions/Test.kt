fun testSolution() {
    val twice = makeMultiplier(2)
    val negative = makeMultiplier(-3)
    expectEquals(8, twice(4))
    expectEquals(-12, negative(4))
    expectEquals(-10, twice(-5))
    expectEquals(6, negative(-2))
    expectEquals(0, makeMultiplier(0)(999))
    expectEquals(1000000, makeMultiplier(1000)(1000))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

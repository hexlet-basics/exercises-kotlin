fun testSolution() {
    val twice = makeMultiplier(2)
    val negative = makeMultiplier(-3)
    assert(twice(4) == 8)
    assert(negative(4) == -12)
    assert(twice(-5) == -10)
    assert(negative(-2) == 6)
    assert(makeMultiplier(0)(999) == 0)
    assert(makeMultiplier(1000)(1000) == 1000000)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

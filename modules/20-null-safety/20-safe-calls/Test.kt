fun testSolution() {
    expectEquals(6, visibleLength("  Kotlin ", 10))
    expectEquals(10, visibleLength(null, 10))
    expectEquals(-5, visibleLength(null, -5))
    expectEquals(0, visibleLength(null, 0))
    expectEquals(0, visibleLength("   ", 10))
    expectEquals(0, visibleLength("", 5))
    expectEquals(1, visibleLength("x", 99))
    expectEquals(3, visibleLength(" a b ", 99))
    expectEquals(4, visibleLength("code", -1))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

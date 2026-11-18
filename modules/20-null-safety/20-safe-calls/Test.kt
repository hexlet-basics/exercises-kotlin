fun testSolution() {
    assert(visibleLength("  Kotlin ", 10) == 6)
    assert(visibleLength(null, 10) == 10)
    assert(visibleLength(null, -5) == -5)
    assert(visibleLength(null, 0) == 0)
    assert(visibleLength("   ", 10) == 0)
    assert(visibleLength("", 5) == 0)
    assert(visibleLength("x", 99) == 1)
    assert(visibleLength(" a b ", 99) == 3)
    assert(visibleLength("code", -1) == 4)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

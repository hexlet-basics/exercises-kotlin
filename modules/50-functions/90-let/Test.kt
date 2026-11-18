fun testSolution() {
    assert(labelLength("  a b  ") == 3)
    assert(labelLength(null) == null)
    assert(labelLength("") == 0)
    assert(labelLength("   ") == 0)
    assert(labelLength(" abcde ") == 5)
    assert(labelLength(" x\ny ") == 3)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    expectEquals(3, labelLength("  a b  "))
    expectEquals(null, labelLength(null))
    expectEquals(0, labelLength(""))
    expectEquals(0, labelLength("   "))
    expectEquals(5, labelLength(" abcde "))
    expectEquals(3, labelLength(" x\ny "))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

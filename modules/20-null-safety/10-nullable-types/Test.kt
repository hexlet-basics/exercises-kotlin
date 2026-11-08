fun testSolution() {
    expectEquals(75, parsePercent(" 75 "))
    expectEquals(0, parsePercent("0"))
    expectEquals(100, parsePercent("100"))
    expectEquals(42, parsePercent("+42"))
    expectEquals(null, parsePercent("-1"))
    expectEquals(null, parsePercent("101"))
    expectEquals(null, parsePercent("75%"))
    expectEquals(null, parsePercent(""))
    expectEquals(null, parsePercent("   "))
    expectEquals(null, parsePercent("1.5"))
    expectEquals(null, parsePercent("999999999999999999999"))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

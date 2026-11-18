fun testSolution() {
    assert(parsePercent(" 75 ") == 75)
    assert(parsePercent("0") == 0)
    assert(parsePercent("100") == 100)
    assert(parsePercent("+42") == 42)
    assert(parsePercent("-1") == null)
    assert(parsePercent("101") == null)
    assert(parsePercent("75%") == null)
    assert(parsePercent("") == null)
    assert(parsePercent("   ") == null)
    assert(parsePercent("1.5") == null)
    assert(parsePercent("999999999999999999999") == null)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

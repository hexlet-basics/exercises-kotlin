fun testSolution() {
    assert(balanceAfter(5, listOf(-8, 4)) == 4)
    assert(balanceAfter(7, listOf()) == 7)
    assert(balanceAfter(0, listOf(-2, -3)) == 0)
    assert(balanceAfter(5, listOf(4, -20)) == 0)
    assert(balanceAfter(3, listOf(2, -4, 10)) == 11)
    val source = mutableListOf(-10, 8, -2)
    assert(balanceAfter(1, source) == 6)
    assert(source == listOf(-10, 8, -2))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

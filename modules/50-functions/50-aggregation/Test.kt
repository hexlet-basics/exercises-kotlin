fun testSolution() {
    expectEquals(4, balanceAfter(5, listOf(-8, 4)))
    expectEquals(7, balanceAfter(7, listOf()))
    expectEquals(0, balanceAfter(0, listOf(-2, -3)))
    expectEquals(0, balanceAfter(5, listOf(4, -20)))
    expectEquals(11, balanceAfter(3, listOf(2, -4, 10)))
    val source = mutableListOf(-10, 8, -2)
    expectEquals(6, balanceAfter(1, source))
    expectEquals(listOf(-10, 8, -2), source)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    expectEquals(9 to false, inspectScores(listOf(4, 9, -1, 7), 6))
    expectEquals(7 to true, inspectScores(listOf(7, 8, 9), 7))
    expectEquals(null to true, inspectScores(listOf(1, 2), 10))
    expectEquals(null to true, inspectScores(listOf(), 0))
    expectEquals(-2 to false, inspectScores(listOf(-5, -2, 0), -3))
    val source = mutableListOf(2, 10, 8)
    expectEquals(10 to true, inspectScores(source, 8))
    expectEquals(listOf(2, 10, 8), source)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

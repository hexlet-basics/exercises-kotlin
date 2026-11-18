fun testSolution() {
    assert(inspectScores(listOf(4, 9, -1, 7), 6) == 9 to false)
    assert(inspectScores(listOf(7, 8, 9), 7) == 7 to true)
    assert(inspectScores(listOf(1, 2), 10) == null to true)
    assert(inspectScores(listOf(), 0) == null to true)
    assert(inspectScores(listOf(-5, -2, 0), -3) == -2 to false)
    val source = mutableListOf(2, 10, 8)
    assert(inspectScores(source, 8) == 10 to true)
    assert(source == listOf(2, 10, 8))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

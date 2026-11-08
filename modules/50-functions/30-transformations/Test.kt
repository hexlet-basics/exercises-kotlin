fun testSolution() {
    val source = mutableListOf(" 7 ", "no", "-2", "0", "7")
    expectEquals(listOf(7, 7), parsePositiveValues(source))
    expectEquals(listOf(" 7 ", "no", "-2", "0", "7"), source)
    expectEquals(listOf<Int>(), parsePositiveValues(listOf()))
    expectEquals(listOf<Int>(), parsePositiveValues(listOf("", " ", "-5", "0", "999999999999999")))
    expectEquals(listOf(1, 2147483647), parsePositiveValues(listOf("+1", "2147483647", "2147483648")))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

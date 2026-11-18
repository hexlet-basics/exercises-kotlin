fun testSolution() {
    val source = mutableListOf(" 7 ", "no", "-2", "0", "7")
    assert(parsePositiveValues(source) == listOf(7, 7))
    assert(source == listOf(" 7 ", "no", "-2", "0", "7"))
    assert(parsePositiveValues(listOf()) == listOf<Int>())
    assert(parsePositiveValues(listOf("", " ", "-5", "0", "999999999999999")) == listOf<Int>())
    assert(parsePositiveValues(listOf("+1", "2147483647", "2147483648")) == listOf(1, 2147483647))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

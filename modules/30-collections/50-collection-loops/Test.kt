fun testSolution() {
    val words = mutableListOf("red", "blue", "red", "Red")
    assert(countWords(words) == mapOf("red" to 2, "blue" to 1, "Red" to 1))
    assert(words == listOf("red", "blue", "red", "Red"))
    assert(countWords(listOf()) == mapOf<String, Int>())
    assert(countWords(listOf("single")) == mapOf("single" to 1))
    assert(countWords(listOf("", "", "")) == mapOf("" to 3))
    assert(countWords(listOf("a", "b", "b", "a")) == mapOf("a" to 2, "b" to 2))
    assert(countWords(listOf("red")) == mapOf("red" to 1))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

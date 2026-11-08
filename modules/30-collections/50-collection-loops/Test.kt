fun testSolution() {
    val words = mutableListOf("red", "blue", "red", "Red")
    expectEquals(mapOf("red" to 2, "blue" to 1, "Red" to 1), countWords(words))
    expectEquals(listOf("red", "blue", "red", "Red"), words)
    expectEquals(mapOf<String, Int>(), countWords(listOf()))
    expectEquals(mapOf("single" to 1), countWords(listOf("single")))
    expectEquals(mapOf("" to 3), countWords(listOf("", "", "")))
    expectEquals(mapOf("a" to 2, "b" to 2), countWords(listOf("a", "b", "b", "a")))
    expectEquals(mapOf("red" to 1), countWords(listOf("red")))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

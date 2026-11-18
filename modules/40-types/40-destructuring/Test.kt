fun testSolution() {
    val stock = mutableMapOf("book" to 3, "pen" to 0, "lamp" to 2)
    assert(summarizeStock(stock) == 2 to 5)
    assert(stock == mapOf("book" to 3, "pen" to 0, "lamp" to 2))
    assert(summarizeStock(mapOf()) == 0 to 0)
    assert(summarizeStock(mapOf("a" to 0, "b" to 0)) == 0 to 0)
    assert(summarizeStock(mapOf("a" to 7)) == 1 to 7)
    assert(summarizeStock(mapOf("c" to 3, "b" to 2, "a" to 1)) == 3 to 6)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

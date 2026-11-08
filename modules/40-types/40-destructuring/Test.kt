fun testSolution() {
    val stock = mutableMapOf("book" to 3, "pen" to 0, "lamp" to 2)
    expectEquals(2 to 5, summarizeStock(stock))
    expectEquals(mapOf("book" to 3, "pen" to 0, "lamp" to 2), stock)
    expectEquals(0 to 0, summarizeStock(mapOf()))
    expectEquals(0 to 0, summarizeStock(mapOf("a" to 0, "b" to 0)))
    expectEquals(1 to 7, summarizeStock(mapOf("a" to 7)))
    expectEquals(3 to 6, summarizeStock(mapOf("c" to 3, "b" to 2, "a" to 1)))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

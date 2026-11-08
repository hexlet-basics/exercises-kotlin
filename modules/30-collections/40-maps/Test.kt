fun testSolution() {
    val stock = mutableMapOf("book" to 4, "lamp" to 10)
    expectEquals(7, updateQuantity(stock, "book", 3))
    expectEquals(mapOf("book" to 7, "lamp" to 10), stock)
    expectEquals(2, updateQuantity(stock, "pen", 2))
    expectEquals(0, updateQuantity(stock, "book", -7))
    expectTrue(stock.containsKey("book"))
    expectEquals(mapOf("book" to 0, "lamp" to 10, "pen" to 2), stock)
    expectEquals(10, updateQuantity(stock, "lamp", 0))
    val empty = mutableMapOf<String, Int>()
    expectEquals(0, updateQuantity(empty, "new", 0))
    expectEquals(mapOf("new" to 0), empty)
    expectEquals(5, updateQuantity(empty, "new", 5))
    expectEquals(mapOf("new" to 5), empty)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

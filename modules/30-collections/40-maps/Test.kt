fun testSolution() {
    val stock = mutableMapOf("book" to 4, "lamp" to 10)
    assert(updateQuantity(stock, "book", 3) == 7)
    assert(stock == mapOf("book" to 7, "lamp" to 10))
    assert(updateQuantity(stock, "pen", 2) == 2)
    assert(updateQuantity(stock, "book", -7) == 0)
    assert(stock.containsKey("book"))
    assert(stock == mapOf("book" to 0, "lamp" to 10, "pen" to 2))
    assert(updateQuantity(stock, "lamp", 0) == 10)
    val empty = mutableMapOf<String, Int>()
    assert(updateQuantity(empty, "new", 0) == 0)
    assert(empty == mapOf("new" to 0))
    assert(updateQuantity(empty, "new", 5) == 5)
    assert(empty == mapOf("new" to 5))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    assert(discountedPrice(0) == 0)
    assert(discountedPrice(1) == 0)
    assert(discountedPrice(10) == 9)
    assert(discountedPrice(125) == 112)
    assert(discountedPrice(100000) == 90000)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    expectEquals(0, discountedPrice(0))
    expectEquals(0, discountedPrice(1))
    expectEquals(9, discountedPrice(10))
    expectEquals(112, discountedPrice(125))
    expectEquals(90000, discountedPrice(100000))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

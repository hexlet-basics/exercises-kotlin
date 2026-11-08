fun testSolution() {
    expectEquals(8, firstMultiple(5, 15, 4), "first match")
    expectEquals(6, firstMultiple(6, 20, 3), "inclusive start")
    expectEquals(12, firstMultiple(10, 12, 4), "inclusive end")
    expectEquals(-1, firstMultiple(10, 11, 4), "no match")
    expectEquals(0, firstMultiple(0, 8, 7), "zero is a multiple")
    expectEquals(7, firstMultiple(7, 7, 7), "single matching value")
    expectEquals(-1, firstMultiple(7, 7, 2), "single non-matching value")
    expectEquals(-1, firstMultiple(9, 3, 2), "empty range")
    expectEquals(25, firstMultiple(25, 30, 1), "divisor one")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

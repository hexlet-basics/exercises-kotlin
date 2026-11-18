fun testSolution() {
    assert(firstMultiple(5, 15, 4) == 8) { "first match" }
    assert(firstMultiple(6, 20, 3) == 6) { "inclusive start" }
    assert(firstMultiple(10, 12, 4) == 12) { "inclusive end" }
    assert(firstMultiple(10, 11, 4) == -1) { "no match" }
    assert(firstMultiple(0, 8, 7) == 0) { "zero is a multiple" }
    assert(firstMultiple(7, 7, 7) == 7) { "single matching value" }
    assert(firstMultiple(7, 7, 2) == -1) { "single non-matching value" }
    assert(firstMultiple(9, 3, 2) == -1) { "empty range" }
    assert(firstMultiple(25, 30, 1) == 25) { "divisor one" }
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

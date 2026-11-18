fun testSolution() {
    assert(readCount(12) == 12)
    assert(readCount(-7) == -7)
    assert(readCount(0) == 0)
    assert(readCount(" 34 ") == 34)
    assert(readCount("-23") == -23)
    assert(readCount("many") == null)
    assert(readCount("") == null)
    assert(readCount("2147483648") == null)
    assert(readCount(12L) == null)
    assert(readCount(12.0) == null)
    assert(readCount(true) == null)
    assert(readCount(null) == null)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

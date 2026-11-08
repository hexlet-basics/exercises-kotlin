fun testSolution() {
    expectEquals(12, readCount(12))
    expectEquals(-7, readCount(-7))
    expectEquals(0, readCount(0))
    expectEquals(34, readCount(" 34 "))
    expectEquals(-23, readCount("-23"))
    expectEquals(null, readCount("many"))
    expectEquals(null, readCount(""))
    expectEquals(null, readCount("2147483648"))
    expectEquals(null, readCount(12L))
    expectEquals(null, readCount(12.0))
    expectEquals(null, readCount(true))
    expectEquals(null, readCount(null))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

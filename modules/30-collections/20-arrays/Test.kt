fun testSolution() {
    val values = intArrayOf(5, -2, 0)
    val sameValues = values
    addOffset(values, 3)
    expectTrue(values.contentEquals(intArrayOf(8, 1, 3)))
    expectTrue(sameValues.contentEquals(intArrayOf(8, 1, 3)))
    addOffset(values, -4)
    expectTrue(values.contentEquals(intArrayOf(4, -3, -1)))
    addOffset(values, 0)
    expectTrue(values.contentEquals(intArrayOf(4, -3, -1)))
    val empty = intArrayOf()
    addOffset(empty, 100)
    expectEquals(0, empty.size)
    val single = intArrayOf(-10)
    addOffset(single, 10)
    expectTrue(single.contentEquals(intArrayOf(0)))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val values = intArrayOf(5, -2, 0)
    val sameValues = values
    addOffset(values, 3)
    assert(values.contentEquals(intArrayOf(8, 1, 3)))
    assert(sameValues.contentEquals(intArrayOf(8, 1, 3)))
    addOffset(values, -4)
    assert(values.contentEquals(intArrayOf(4, -3, -1)))
    addOffset(values, 0)
    assert(values.contentEquals(intArrayOf(4, -3, -1)))
    val empty = intArrayOf()
    addOffset(empty, 100)
    assert(empty.size == 0)
    val single = intArrayOf(-10)
    addOffset(single, 10)
    assert(single.contentEquals(intArrayOf(0)))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

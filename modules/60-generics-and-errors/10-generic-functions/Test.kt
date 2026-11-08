data class Sample(
    val id: Int,
    val active: Boolean,
)

fun testSolution() {
    val number: Int? = findLastMatching(listOf(2, 7, 4, 9)) { it % 2 == 0 }
    expectEquals(4, number)
    val text: String? = findLastMatching(listOf("alpha", "b", "gamma")) { it.length > 2 }
    expectEquals("gamma", text)
    expectEquals(null, findLastMatching(listOf(1, 3)) { it % 2 == 0 })
    expectEquals(null, findLastMatching<Int>(listOf()) { it > 0 })
    val first = Sample(1, true)
    val second = Sample(2, true)
    val source = mutableListOf(first, Sample(3, false), second)
    expectTrue(findLastMatching(source) { it.active } === second)
    expectEquals(listOf(first, Sample(3, false), second), source)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

data class Sample(
    val id: Int,
    val active: Boolean,
)

fun testSolution() {
    val number: Int? = findLastMatching(listOf(2, 7, 4, 9)) { it % 2 == 0 }
    assert(number == 4)
    val text: String? = findLastMatching(listOf("alpha", "b", "gamma")) { it.length > 2 }
    assert(text == "gamma")
    assert(findLastMatching(listOf(1, 3)) { it % 2 == 0 } == null)
    assert(findLastMatching<Int>(listOf()) { it > 0 } == null)
    val first = Sample(1, true)
    val second = Sample(2, true)
    val source = mutableListOf(first, Sample(3, false), second)
    assert(findLastMatching(source) { it.active } === second)
    assert(source == listOf(first, Sample(3, false), second))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

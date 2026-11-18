data class Reading(
    val amount: Int,
)

fun testSolution() {
    val number: Int = unwrap(Holder(7))
    val text: String = unwrap(Holder("ready"))
    val missing: String? = unwrap(Holder<String?>(null))
    assert(number == 7)
    assert(text == "ready")
    assert(missing == null)
    val reading = Reading(12)
    val result: Reading = unwrap(Holder(reading))
    assert(result === reading)
    val values: List<Int> = unwrap(Holder(listOf(1, 2)))
    assert(values == listOf(1, 2))
    assert(Holder("ready").value == "ready")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

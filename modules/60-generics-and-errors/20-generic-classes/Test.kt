data class Reading(
    val amount: Int,
)

fun testSolution() {
    val number: Int = unwrap(Holder(7))
    val text: String = unwrap(Holder("ready"))
    val missing: String? = unwrap(Holder<String?>(null))
    expectEquals(7, number)
    expectEquals("ready", text)
    expectEquals(null, missing)
    val reading = Reading(12)
    val result: Reading = unwrap(Holder(reading))
    expectTrue(result === reading)
    val values: List<Int> = unwrap(Holder(listOf(1, 2)))
    expectEquals(listOf(1, 2), values)
    expectEquals("ready", Holder("ready").value)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val values = mutableListOf("red", "green", "black")
    val view: List<String> = values
    expectEquals("green", replaceAndRead(values, 1, "blue"))
    expectEquals(listOf("red", "blue", "black"), values)
    expectEquals(listOf("red", "blue", "black"), view)
    expectEquals("red", replaceAndRead(values, 0, ""))
    expectEquals(listOf("", "blue", "black"), values)
    expectEquals("black", replaceAndRead(values, 2, "white"))
    expectEquals(null, replaceAndRead(values, -1, "bad"))
    expectEquals(null, replaceAndRead(values, 3, "bad"))
    expectEquals(listOf("", "blue", "white"), values)
    val empty = mutableListOf<String>()
    expectEquals(null, replaceAndRead(empty, 0, "x"))
    expectEquals(listOf<String>(), empty)
    val single = mutableListOf("")
    expectEquals("", replaceAndRead(single, 0, "done"))
    expectEquals(listOf("done"), single)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

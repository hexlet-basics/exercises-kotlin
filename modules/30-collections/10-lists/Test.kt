fun testSolution() {
    val values = mutableListOf("red", "green", "black")
    val view: List<String> = values
    assert(replaceAndRead(values, 1, "blue") == "green")
    assert(values == listOf("red", "blue", "black"))
    assert(view == listOf("red", "blue", "black"))
    assert(replaceAndRead(values, 0, "") == "red")
    assert(values == listOf("", "blue", "black"))
    assert(replaceAndRead(values, 2, "white") == "black")
    assert(replaceAndRead(values, -1, "bad") == null)
    assert(replaceAndRead(values, 3, "bad") == null)
    assert(values == listOf("", "blue", "white"))
    val empty = mutableListOf<String>()
    assert(replaceAndRead(empty, 0, "x") == null)
    assert(empty == listOf<String>())
    val single = mutableListOf("")
    assert(replaceAndRead(single, 0, "done") == "")
    assert(single == listOf("done"))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

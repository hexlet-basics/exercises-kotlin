fun testSolution() {
    expectEquals("item 42", "  ITEM 42  ".normalizedCode())
    expectEquals("", "   ".normalizedCode())
    expectEquals("", "".normalizedCode())
    expectEquals("a b", " A B ".normalizedCode())
    expectEquals("номер-7", " НОМЕР-7 ".normalizedCode())
    val original = " Mixed "
    expectEquals("mixed", original.normalizedCode())
    expectEquals(" Mixed ", original)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

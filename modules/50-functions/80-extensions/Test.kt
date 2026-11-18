fun testSolution() {
    assert("  ITEM 42  ".normalizedCode() == "item 42")
    assert("   ".normalizedCode() == "")
    assert("".normalizedCode() == "")
    assert(" A B ".normalizedCode() == "a b")
    assert(" НОМЕР-7 ".normalizedCode() == "номер-7")
    val original = " Mixed "
    assert(original.normalizedCode() == "mixed")
    assert(original == " Mixed ")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

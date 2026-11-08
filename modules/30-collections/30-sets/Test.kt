fun testSolution() {
    val names = mutableListOf("Ada", "Linus", "Ada")
    expectEquals(setOf("Ada", "Linus"), distinctOrNull(names, "Ada"))
    expectEquals(listOf("Ada", "Linus", "Ada"), names)
    expectEquals(setOf("Ada", "Linus"), distinctOrNull(names, "Linus"))
    expectEquals(null, distinctOrNull(names, "ada"))
    expectEquals(null, distinctOrNull(listOf("Ada"), "Grace"))
    expectEquals(null, distinctOrNull(listOf(), "Ada"))
    expectEquals(setOf(""), distinctOrNull(listOf("", ""), ""))
    expectEquals(setOf("a", "b", "c"), distinctOrNull(listOf("c", "b", "a", "b"), "b"))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

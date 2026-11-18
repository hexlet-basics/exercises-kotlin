fun testSolution() {
    val names = mutableListOf("Ada", "Linus", "Ada")
    assert(distinctOrNull(names, "Ada") == setOf("Ada", "Linus"))
    assert(names == listOf("Ada", "Linus", "Ada"))
    assert(distinctOrNull(names, "Linus") == setOf("Ada", "Linus"))
    assert(distinctOrNull(names, "ada") == null)
    assert(distinctOrNull(listOf("Ada"), "Grace") == null)
    assert(distinctOrNull(listOf(), "Ada") == null)
    assert(distinctOrNull(listOf("", ""), "") == setOf(""))
    assert(distinctOrNull(listOf("c", "b", "a", "b"), "b") == setOf("a", "b", "c"))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

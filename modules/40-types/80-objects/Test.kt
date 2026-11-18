fun testSolution() {
    val source: NameSource = DefaultName
    assert(source.name() == "Guest")
    assert(source === DefaultName)
    assert(Member.fromText("  Ada ").name == "Ada")
    assert(Member.fromText("   ").name == "Guest")
    assert(Member.fromText("").name == "Guest")
    assert(Member.fromText(" Ada Lovelace ").name == "Ada Lovelace")
    assert(Member.fromText("kOtLiN").name == "kOtLiN")
    val first = Member.fromText("Ada")
    val second = Member.fromText("Ada")
    assert(second.name == first.name)
    assert(first !== second)
    assert(Member("Direct").name == "Direct")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

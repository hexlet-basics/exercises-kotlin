fun testSolution() {
    val source: NameSource = DefaultName
    expectEquals("Guest", source.name())
    expectTrue(source === DefaultName)
    expectEquals("Ada", Member.fromText("  Ada ").name)
    expectEquals("Guest", Member.fromText("   ").name)
    expectEquals("Guest", Member.fromText("").name)
    expectEquals("Ada Lovelace", Member.fromText(" Ada Lovelace ").name)
    expectEquals("kOtLiN", Member.fromText("kOtLiN").name)
    val first = Member.fromText("Ada")
    val second = Member.fromText("Ada")
    expectEquals(first.name, second.name)
    expectTrue(first !== second)
    expectEquals("Direct", Member("Direct").name)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

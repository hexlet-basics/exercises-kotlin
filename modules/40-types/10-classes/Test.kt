fun testSolution() {
    val first = Shipment("P-8", 4)
    expectEquals("P-8", first.code)
    expectEquals(4, first.weight)
    expectEquals(60, first.charge(15))
    first.weight = 6
    expectEquals(90, first.charge(15))
    val second = Shipment("P-8", 4)
    expectEquals(4, second.weight)
    expectEquals(60, second.charge(15))
    expectTrue(first !== second)
    val same = first
    same.weight = 1
    expectEquals(1, first.weight)
    expectEquals(4, second.weight)
    expectEquals(0, first.charge(0))
    expectEquals(0, Shipment("empty", 0).charge(100))
    expectEquals(120, Shipment("other", 10).charge(12))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

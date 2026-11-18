fun testSolution() {
    val first = Shipment("P-8", 4)
    assert(first.code == "P-8")
    assert(first.weight == 4)
    assert(first.charge(15) == 60)
    first.weight = 6
    assert(first.charge(15) == 90)
    val second = Shipment("P-8", 4)
    assert(second.weight == 4)
    assert(second.charge(15) == 60)
    assert(first !== second)
    val same = first
    same.weight = 1
    assert(first.weight == 1)
    assert(second.weight == 4)
    assert(first.charge(0) == 0)
    assert(Shipment("empty", 0).charge(100) == 0)
    assert(Shipment("other", 10).charge(12) == 120)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val fixed: Charge = FixedCharge("delivery", 50)
    val items: Charge = ItemCharge("books", 20, 3)
    expectEquals("delivery", fixed.label)
    expectEquals(50, fixed.amount())
    expectEquals("books", items.label)
    expectEquals(60, items.amount())
    val charges: List<Charge> = listOf(fixed, items, FixedCharge("free", 0))
    var total = 0
    for (charge in charges) {
        total = total + charge.amount()
    }
    expectEquals(110, total)
    expectEquals(0, ItemCharge("none", 500, 0).amount())
    expectEquals(0, ItemCharge("free", 0, 10).amount())
    expectEquals(35, ItemCharge("pens", 7, 5).amount())
    expectEquals(50, fixed.amount())
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

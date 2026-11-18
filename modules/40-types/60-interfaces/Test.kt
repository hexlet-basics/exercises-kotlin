fun testSolution() {
    val fixed: Charge = FixedCharge("delivery", 50)
    val items: Charge = ItemCharge("books", 20, 3)
    assert(fixed.label == "delivery")
    assert(fixed.amount() == 50)
    assert(items.label == "books")
    assert(items.amount() == 60)
    val charges: List<Charge> = listOf(fixed, items, FixedCharge("free", 0))
    var total = 0
    for (charge in charges) {
        total = total + charge.amount()
    }
    assert(total == 110)
    assert(ItemCharge("none", 500, 0).amount() == 0)
    assert(ItemCharge("free", 0, 10).amount() == 0)
    assert(ItemCharge("pens", 7, 5).amount() == 35)
    assert(fixed.amount() == 50)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

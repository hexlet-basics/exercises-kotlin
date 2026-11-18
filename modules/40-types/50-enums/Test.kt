fun testSolution() {
    assert(DeliveryMode.entries.size == 3)
    assert(DeliveryMode.PICKUP.days == 0)
    assert(DeliveryMode.STANDARD.days == 3)
    assert(DeliveryMode.EXPRESS.days == 1)
    assert(shippingCost(DeliveryMode.PICKUP) == 0)
    assert(shippingCost(DeliveryMode.STANDARD) == 200)
    assert(shippingCost(DeliveryMode.EXPRESS) == 500)
    assert(shippingCost(DeliveryMode.PICKUP) == 0)
    assert(DeliveryMode.EXPRESS.name == "EXPRESS")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    expectEquals(3, DeliveryMode.entries.size)
    expectEquals(0, DeliveryMode.PICKUP.days)
    expectEquals(3, DeliveryMode.STANDARD.days)
    expectEquals(1, DeliveryMode.EXPRESS.days)
    expectEquals(0, shippingCost(DeliveryMode.PICKUP))
    expectEquals(200, shippingCost(DeliveryMode.STANDARD))
    expectEquals(500, shippingCost(DeliveryMode.EXPRESS))
    expectEquals(0, shippingCost(DeliveryMode.PICKUP))
    expectEquals("EXPRESS", DeliveryMode.EXPRESS.name)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

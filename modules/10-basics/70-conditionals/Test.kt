fun testSolution() {
    expectEquals("invalid", deliveryLabel(0, false), "zero")
    expectEquals("invalid", deliveryLabel(-3, true), "invalid before express")
    expectEquals("express", deliveryLabel(1, true), "small express parcel")
    expectEquals("express", deliveryLabel(5, true), "express boundary")
    expectEquals("standard", deliveryLabel(5, false), "express not requested")
    expectEquals("standard", deliveryLabel(6, true), "above express limit")
    expectEquals("standard", deliveryLabel(20, false), "standard boundary")
    expectEquals("cargo", deliveryLabel(21, false), "above standard limit")
    expectEquals("cargo", deliveryLabel(100, true), "large express request")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    assert(deliveryLabel(0, false) == "invalid") { "zero" }
    assert(deliveryLabel(-3, true) == "invalid") { "invalid before express" }
    assert(deliveryLabel(1, true) == "express") { "small express parcel" }
    assert(deliveryLabel(5, true) == "express") { "express boundary" }
    assert(deliveryLabel(5, false) == "standard") { "express not requested" }
    assert(deliveryLabel(6, true) == "standard") { "above express limit" }
    assert(deliveryLabel(20, false) == "standard") { "standard boundary" }
    assert(deliveryLabel(21, false) == "cargo") { "above standard limit" }
    assert(deliveryLabel(100, true) == "cargo") { "large express request" }
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

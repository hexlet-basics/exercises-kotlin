fun testSolution() {
    val parcel: Parcel = ExpressParcel(5)
    expectEquals(60, parcel.price())
    expectEquals("Price: 60", parcel.label())
    expectEquals(0, ExpressParcel(0).price())
    expectEquals(12, ExpressParcel(1).price())
    expectEquals(12000, ExpressParcel(1000).price())
    expectEquals(50, Parcel(5).price())
    val parcels: List<Parcel> = listOf(Parcel(2), ExpressParcel(2))
    expectEquals(20, parcels[0].price())
    expectEquals(24, parcels[1].price())
    expectEquals("Price: 24", parcels[1].label())
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

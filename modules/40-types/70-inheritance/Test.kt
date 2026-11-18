fun testSolution() {
    val parcel: Parcel = ExpressParcel(5)
    assert(parcel.price() == 60)
    assert(parcel.label() == "Price: 60")
    assert(ExpressParcel(0).price() == 0)
    assert(ExpressParcel(1).price() == 12)
    assert(ExpressParcel(1000).price() == 12000)
    assert(Parcel(5).price() == 50)
    val parcels: List<Parcel> = listOf(Parcel(2), ExpressParcel(2))
    assert(parcels[0].price() == 20)
    assert(parcels[1].price() == 24)
    assert(parcels[1].label() == "Price: 24")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

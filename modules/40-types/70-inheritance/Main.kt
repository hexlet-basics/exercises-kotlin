// BEGIN
class ExpressParcel(
    weight: Int,
) : Parcel(weight) {
    override fun price(): Int = super.price() + weight * 2
}
// END

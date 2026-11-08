// BEGIN
class Shipment(
    val code: String,
    var weight: Int,
) {
    fun charge(rate: Int): Int = weight * rate
}
// END

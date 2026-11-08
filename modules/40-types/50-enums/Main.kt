// BEGIN
enum class DeliveryMode(
    val days: Int,
) {
    PICKUP(0),
    STANDARD(3),
    EXPRESS(1),
}

fun shippingCost(mode: DeliveryMode): Int =
    when (mode) {
        DeliveryMode.PICKUP -> 0
        DeliveryMode.STANDARD -> 200
        DeliveryMode.EXPRESS -> 500
    }
// END

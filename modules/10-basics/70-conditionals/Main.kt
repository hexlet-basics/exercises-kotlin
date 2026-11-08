// BEGIN
fun deliveryLabel(
    weight: Int,
    express: Boolean,
): String =
    when {
        weight <= 0 -> "invalid"
        express && weight <= 5 -> "express"
        weight <= 20 -> "standard"
        else -> "cargo"
    }
// END

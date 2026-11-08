fun updateQuantity(
    stock: MutableMap<String, Int>,
    sku: String,
    delta: Int,
): Int {
    // BEGIN
    val quantity = (stock[sku] ?: 0) + delta
    stock[sku] = quantity
    return quantity
    // END
}

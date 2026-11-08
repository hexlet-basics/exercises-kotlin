fun discountedPrice(price: Int): Int {
    // BEGIN
    val applyDiscount: (Int) -> Int = { it * 9 / 10 }
    return applyDiscount(price)
    // END
}

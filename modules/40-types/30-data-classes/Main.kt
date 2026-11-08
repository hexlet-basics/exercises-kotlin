// BEGIN
data class Product(
    val name: String,
    val price: Int,
)

fun discounted(
    product: Product,
    discount: Int,
): Product = product.copy(price = product.price - discount)
// END

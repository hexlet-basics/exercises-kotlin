open class Parcel(
    protected val weight: Int,
) {
    open fun price(): Int = weight * 10

    fun label(): String = "Price: ${price()}"
}

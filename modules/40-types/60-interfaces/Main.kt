// BEGIN
interface Charge {
    val label: String

    fun amount(): Int
}

class FixedCharge(
    override val label: String,
    private val fee: Int,
) : Charge {
    override fun amount(): Int = fee
}

class ItemCharge(
    override val label: String,
    private val unitPrice: Int,
    private val quantity: Int,
) : Charge {
    override fun amount(): Int = unitPrice * quantity
}
// END

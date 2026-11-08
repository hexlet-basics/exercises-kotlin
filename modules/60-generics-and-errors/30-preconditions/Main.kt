// BEGIN
class TicketBatch(
    total: Int,
) {
    var remaining: Int = total
        private set

    init {
        require(total >= 0) { "Total must be non-negative" }
    }

    fun take(count: Int) {
        require(count > 0) { "Count must be positive" }
        check(count <= remaining) { "Not enough tickets" }
        remaining -= count
    }
}
// END

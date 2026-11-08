data class Ticket(
    val id: Int,
    val priority: Int,
)

fun orderTickets(tickets: List<Ticket>): List<Ticket> {
    // BEGIN
    return tickets.sortedWith(compareBy<Ticket> { it.priority }.thenBy { it.id })
    // END
}

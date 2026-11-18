fun testSolution() {
    val high = Ticket(9, 2)
    val second = Ticket(4, 1)
    val first = Ticket(2, 1)
    val source = mutableListOf(high, second, first)
    assert(orderTickets(source) == listOf(first, second, high))
    assert(source == listOf(high, second, first))
    assert(orderTickets(listOf()) == listOf<Ticket>())
    assert(orderTickets(listOf(high)) == listOf(high))
    val duplicateOne = Ticket(3, 2)
    val duplicateTwo = Ticket(3, 2)
    val ordered = orderTickets(listOf(duplicateOne, first, duplicateTwo))
    assert(ordered[1] === duplicateOne)
    assert(ordered[2] === duplicateTwo)
    assert(orderTickets(listOf(Ticket(1, -2), Ticket(-1, -2))) == listOf(Ticket(-1, -2), Ticket(1, -2)))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val high = Ticket(9, 2)
    val second = Ticket(4, 1)
    val first = Ticket(2, 1)
    val source = mutableListOf(high, second, first)
    expectEquals(listOf(first, second, high), orderTickets(source))
    expectEquals(listOf(high, second, first), source)
    expectEquals(listOf<Ticket>(), orderTickets(listOf()))
    expectEquals(listOf(high), orderTickets(listOf(high)))
    val duplicateOne = Ticket(3, 2)
    val duplicateTwo = Ticket(3, 2)
    val ordered = orderTickets(listOf(duplicateOne, first, duplicateTwo))
    expectTrue(ordered[1] === duplicateOne)
    expectTrue(ordered[2] === duplicateTwo)
    expectEquals(listOf(Ticket(-1, -2), Ticket(1, -2)), orderTickets(listOf(Ticket(1, -2), Ticket(-1, -2))))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

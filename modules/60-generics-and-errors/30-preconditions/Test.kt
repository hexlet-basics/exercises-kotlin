fun testSolution() {
    val invalidTotal = expectThrows<IllegalArgumentException> { TicketBatch(-1) }
    expectTrue(!invalidTotal.message.isNullOrBlank())
    val empty = TicketBatch(0)
    expectEquals(0, empty.remaining)
    expectThrows<IllegalStateException> { empty.take(1) }
    expectEquals(0, empty.remaining)
    val batch = TicketBatch(5)
    batch.take(2)
    expectEquals(3, batch.remaining)
    val invalidCount = expectThrows<IllegalArgumentException> { batch.take(0) }
    expectTrue(!invalidCount.message.isNullOrBlank())
    expectThrows<IllegalArgumentException> { batch.take(-4) }
    expectEquals(3, batch.remaining)
    val shortage = expectThrows<IllegalStateException> { batch.take(4) }
    expectTrue(!shortage.message.isNullOrBlank())
    expectEquals(3, batch.remaining)
    batch.take(3)
    expectEquals(0, batch.remaining)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

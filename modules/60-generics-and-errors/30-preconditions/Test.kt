fun testSolution() {
    val invalidTotal = expectThrows<IllegalArgumentException> { TicketBatch(-1) }
    assert(!invalidTotal.message.isNullOrBlank())
    val empty = TicketBatch(0)
    assert(empty.remaining == 0)
    expectThrows<IllegalStateException> { empty.take(1) }
    assert(empty.remaining == 0)
    val batch = TicketBatch(5)
    batch.take(2)
    assert(batch.remaining == 3)
    val invalidCount = expectThrows<IllegalArgumentException> { batch.take(0) }
    assert(!invalidCount.message.isNullOrBlank())
    expectThrows<IllegalArgumentException> { batch.take(-4) }
    assert(batch.remaining == 3)
    val shortage = expectThrows<IllegalStateException> { batch.take(4) }
    assert(!shortage.message.isNullOrBlank())
    assert(batch.remaining == 3)
    batch.take(3)
    assert(batch.remaining == 0)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

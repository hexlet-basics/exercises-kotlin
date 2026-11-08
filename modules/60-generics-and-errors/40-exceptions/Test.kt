fun testSolution() {
    var calls = 0
    var finishes = 0
    val success =
        readOrDefault({
            calls += 1
            12
        }, -1) { finishes += 1 }
    expectEquals(12, success)
    expectEquals(1, calls)
    expectEquals(1, finishes)
    calls = 0
    finishes = 0
    val expectedFailure =
        readOrDefault({
            calls += 1
            throw IllegalArgumentException("bad input")
        }, 99) { finishes += 1 }
    expectEquals(99, expectedFailure)
    expectEquals(1, calls)
    expectEquals(1, finishes)
    calls = 0
    finishes = 0
    val original = IllegalStateException("broken state")
    val error =
        expectThrows<IllegalStateException> {
            readOrDefault({
                calls += 1
                throw original
            }, 99) { finishes += 1 }
        }
    expectTrue(error === original)
    expectEquals(1, calls)
    expectEquals(1, finishes)
    expectEquals(-7, readOrDefault({ -7 }, 0) {})
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

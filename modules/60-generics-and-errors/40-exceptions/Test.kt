fun testSolution() {
    var calls = 0
    var finishes = 0
    val success =
        readOrDefault({
            calls += 1
            12
        }, -1) { finishes += 1 }
    assert(success == 12)
    assert(calls == 1)
    assert(finishes == 1)
    calls = 0
    finishes = 0
    val expectedFailure =
        readOrDefault({
            calls += 1
            throw IllegalArgumentException("bad input")
        }, 99) { finishes += 1 }
    assert(expectedFailure == 99)
    assert(calls == 1)
    assert(finishes == 1)
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
    assert(error === original)
    assert(calls == 1)
    assert(finishes == 1)
    assert(readOrDefault({ -7 }, 0) {} == -7)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

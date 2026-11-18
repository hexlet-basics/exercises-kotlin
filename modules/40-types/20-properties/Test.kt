fun testSolution() {
    val negative = StepCounter(-3)
    assert(negative.value == 0)
    assert(negative.doubled == 0)
    negative.advance(4)
    assert(negative.value == 4)
    assert(negative.doubled == 8)
    negative.advance(-1)
    negative.advance(0)
    assert(negative.value == 4)
    val positive = StepCounter(7)
    assert(positive.value == 7)
    assert(positive.doubled == 14)
    positive.advance(3)
    assert(positive.value == 10)
    assert(positive.doubled == 20)
    assert(negative.value == 4)
    val zero = StepCounter(0)
    zero.advance(1)
    assert(zero.value == 1)
    assert(zero.doubled == 2)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

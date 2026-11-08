fun testSolution() {
    val negative = StepCounter(-3)
    expectEquals(0, negative.value)
    expectEquals(0, negative.doubled)
    negative.advance(4)
    expectEquals(4, negative.value)
    expectEquals(8, negative.doubled)
    negative.advance(-1)
    negative.advance(0)
    expectEquals(4, negative.value)
    val positive = StepCounter(7)
    expectEquals(7, positive.value)
    expectEquals(14, positive.doubled)
    positive.advance(3)
    expectEquals(10, positive.value)
    expectEquals(20, positive.doubled)
    expectEquals(4, negative.value)
    val zero = StepCounter(0)
    zero.advance(1)
    expectEquals(1, zero.value)
    expectEquals(2, zero.doubled)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

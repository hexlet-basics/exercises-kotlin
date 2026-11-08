fun testSolution() {
    val ready: LoadState = Ready(4)
    expectEquals("items=4", statusText(ready))
    expectEquals("items=0", statusText(Ready(0)))
    expectEquals("items=123", statusText(Ready(123)))
    expectEquals("loading", statusText(Loading))
    expectEquals("missing", statusText(Missing))
    expectEquals("items=1", statusText(Ready(1)))
    expectEquals("loading", statusText(Loading))
    expectEquals(Ready(4), Ready(4))
    expectEquals(4, Ready(4).count)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

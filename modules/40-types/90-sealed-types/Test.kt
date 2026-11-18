fun testSolution() {
    val ready: LoadState = Ready(4)
    assert(statusText(ready) == "items=4")
    assert(statusText(Ready(0)) == "items=0")
    assert(statusText(Ready(123)) == "items=123")
    assert(statusText(Loading) == "loading")
    assert(statusText(Missing) == "missing")
    assert(statusText(Ready(1)) == "items=1")
    assert(statusText(Loading) == "loading")
    assert(Ready(4) == Ready(4))
    assert(Ready(4).count == 4)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

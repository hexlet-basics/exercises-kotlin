fun testSolution() {
    assert(captureOutput { main() } == "0.35\n")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

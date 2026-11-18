fun testSolution() {
    assert(captureOutput { main() } == "Ready for Kotlin!\n")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

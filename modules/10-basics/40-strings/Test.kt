fun testSolution() {
    assert(captureOutput { main() } == "user-42 (7)\n")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

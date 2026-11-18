fun testSolution() {
    assert(captureOutput { main() } == "12\n7\n")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

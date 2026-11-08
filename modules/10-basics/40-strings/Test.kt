fun testSolution() {
    expectEquals("user-42 (7)\n", captureOutput { main() })
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

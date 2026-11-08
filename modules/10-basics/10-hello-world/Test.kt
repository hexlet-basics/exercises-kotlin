fun testSolution() {
    expectEquals("Ready for Kotlin!\n", captureOutput { main() })
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

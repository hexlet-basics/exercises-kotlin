fun testSolution() {
    expectEquals("0.35\n", captureOutput { main() })
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

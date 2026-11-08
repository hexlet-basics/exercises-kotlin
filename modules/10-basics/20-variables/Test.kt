fun testSolution() {
    expectEquals("12\n7\n", captureOutput { main() })
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

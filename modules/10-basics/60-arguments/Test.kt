fun testSolution() {
    expectEquals("@Mira [member]", makeSignature("Mira"), "both defaults")
    expectEquals("@Lev [admin]", makeSignature("Lev", role = "admin"), "custom role")
    expectEquals("#Ira [member]", makeSignature("Ira", prefix = "#"), "skip role")
    expectEquals("+Sam [guest]", makeSignature(prefix = "+", name = "Sam", role = "guest"), "named arguments")
    expectEquals("Noa []", makeSignature("Noa", "", ""), "empty settings")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

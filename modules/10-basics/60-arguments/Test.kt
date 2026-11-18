fun testSolution() {
    assert(makeSignature("Mira") == "@Mira [member]") { "both defaults" }
    assert(makeSignature("Lev", role = "admin") == "@Lev [admin]") { "custom role" }
    assert(makeSignature("Ira", prefix = "#") == "#Ira [member]") { "skip role" }
    assert(makeSignature(prefix = "+", name = "Sam", role = "guest") == "+Sam [guest]") { "named arguments" }
    assert(makeSignature("Noa", "", "") == "Noa []") { "empty settings" }
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

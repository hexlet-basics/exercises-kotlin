fun testSolution() {
    val first = createNotification(" News ", " Ready ", true)
    expectEquals("News", first.title)
    expectEquals("Ready", first.message)
    expectEquals(true, first.urgent)
    val second = createNotification(" Other ", " Done ", false)
    expectEquals("Other", second.title)
    expectEquals("Done", second.message)
    expectEquals(false, second.urgent)
    expectTrue(first !== second)
    expectEquals("News", first.title)
    second.title = "Changed"
    expectEquals("News", first.title)
    val blank = createNotification("  ", "", false)
    expectEquals("", blank.title)
    expectEquals("", blank.message)
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

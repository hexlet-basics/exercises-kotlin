fun testSolution() {
    val first = createNotification(" News ", " Ready ", true)
    assert(first.title == "News")
    assert(first.message == "Ready")
    assert(first.urgent == true)
    val second = createNotification(" Other ", " Done ", false)
    assert(second.title == "Other")
    assert(second.message == "Done")
    assert(second.urgent == false)
    assert(first !== second)
    assert(first.title == "News")
    second.title = "Changed"
    assert(first.title == "News")
    val blank = createNotification("  ", "", false)
    assert(blank.title == "")
    assert(blank.message == "")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val ada = Employee(1, "Ada", "Support")
    val lin = Employee(2, "Lin", "Platform")
    val sam = Employee(3, "Sam", "Support")
    val source = mutableListOf(ada, lin, sam)
    assert(groupByDepartment(source) == mapOf("Support" to listOf(ada, sam), "Platform" to listOf(lin)))
    assert(indexById(source) == mapOf(1 to ada, 2 to lin, 3 to sam))
    assert(source == listOf(ada, lin, sam))
    val replacement = Employee(1, "Ada", "Platform")
    assert(indexById(listOf(ada, replacement)) == mapOf(1 to replacement))
    assert(groupByDepartment(listOf(ada, replacement)) == mapOf("Support" to listOf(ada), "Platform" to listOf(replacement)))
    assert(groupByDepartment(listOf()) == mapOf<String, List<Employee>>())
    assert(indexById(listOf()) == mapOf<Int, Employee>())
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

fun testSolution() {
    val ada = Employee(1, "Ada", "Support")
    val lin = Employee(2, "Lin", "Platform")
    val sam = Employee(3, "Sam", "Support")
    val source = mutableListOf(ada, lin, sam)
    expectEquals(mapOf("Support" to listOf(ada, sam), "Platform" to listOf(lin)), groupByDepartment(source))
    expectEquals(mapOf(1 to ada, 2 to lin, 3 to sam), indexById(source))
    expectEquals(listOf(ada, lin, sam), source)
    val replacement = Employee(1, "Ada", "Platform")
    expectEquals(mapOf(1 to replacement), indexById(listOf(ada, replacement)))
    expectEquals(mapOf("Support" to listOf(ada), "Platform" to listOf(replacement)), groupByDepartment(listOf(ada, replacement)))
    expectEquals(mapOf<String, List<Employee>>(), groupByDepartment(listOf()))
    expectEquals(mapOf<Int, Employee>(), indexById(listOf()))
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}

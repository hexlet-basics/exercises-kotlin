data class Employee(
    val id: Int,
    val name: String,
    val department: String,
)

fun groupByDepartment(people: List<Employee>): Map<String, List<Employee>> {
    // BEGIN
    return people.groupBy { it.department }
    // END
}

fun indexById(people: List<Employee>): Map<Int, Employee> {
    // BEGIN
    return people.associateBy { it.id }
    // END
}

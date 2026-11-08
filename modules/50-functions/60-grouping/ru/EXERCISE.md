В файле уже объявлен класс `Employee`, который хранит `id`, `name` и `department`.

Реализуйте две функции. `groupByDepartment(people: List<Employee>): Map<String, List<Employee>>` должна собрать сотрудников по отделам через `groupBy`. `indexById(people: List<Employee>): Map<Int, Employee>` должна построить индекс через `associateBy`.

Внутри отдела сохраняйте порядок исходного списка. Если идентификатор повторяется, в индексе должна остаться последняя запись. Исходный список не изменяется. Для пустого входа обе функции возвращают пустые карты.

```kotlin
fun main() {
    val people = listOf(Employee(1, "Ada", "Support"), Employee(2, "Lin", "Support"))
    println(groupByDepartment(people)["Support"]?.size) // 2
    println(indexById(people)[2]?.name) // Lin
}
```

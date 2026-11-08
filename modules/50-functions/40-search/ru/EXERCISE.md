Реализуйте `inspectScores(scores: List<Int>, threshold: Int): Pair<Int?, Boolean>`. Первым компонентом верните первое значение, которое больше или равно `threshold`, либо `null`. Вторым компонентом верните признак того, что все значения списка неотрицательны.

Используйте `find` и `all`. Для пустого списка результат равен `null to true`. Порядок входных значений не меняется.

```kotlin
fun main() {
    println(inspectScores(listOf(4, 9, -1, 7), 6)) // (9, false)
}
```

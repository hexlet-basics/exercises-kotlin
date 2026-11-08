Реализуйте обобщённую функцию `findLastMatching(values: List<T>, predicate: (T) -> Boolean): T?` с ограничением `T : Any`.

Функция должна вернуть последний элемент исходного списка, для которого предикат возвращает `true`. Если совпадений нет или список пуст, верните `null`. Исходный список не изменяется. Для решения можно использовать обычный цикл и nullable-переменную для найденного значения.

```kotlin
fun main() {
    println(findLastMatching(listOf(2, 7, 4, 9)) { it % 2 == 0 }) // 4
    println(findLastMatching(listOf("a", "road")) { it.length > 5 }) // null
}
```

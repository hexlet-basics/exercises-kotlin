Реализуйте функцию `replaceAndRead(values: MutableList<String>, index: Int, replacement: String): String?`.

Если индекс существует, функция заменяет соответствующий элемент переданного списка и возвращает его прежнее значение. Если индекс отрицательный или выходит за границу, функция возвращает `null` и сохраняет список без изменений.

```kotlin
fun main() {
    val values = mutableListOf("red", "green")
    replaceAndRead(values, 1, "blue") // green
    println(values) // [red, blue]
    replaceAndRead(values, 2, "white") // null
    println(values) // [red, blue]
}
```

Используйте `getOrNull()` для безопасного чтения. Менять нужно сам переданный список. Печатать результат не нужно.

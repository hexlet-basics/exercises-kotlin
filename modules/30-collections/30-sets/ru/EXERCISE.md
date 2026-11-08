Реализуйте функцию `distinctOrNull(names: List<String>, required: String): Set<String>?`.

Она получает множество уникальных имён из `names` через `toSet()`. Если в множестве есть имя `required`, функция возвращает это множество. Если имени нет, она возвращает `null`.

```kotlin
fun main() {
    distinctOrNull(listOf("Ada", "Linus", "Ada"), "Ada") // setOf("Ada", "Linus")
    distinctOrNull(listOf("Ada"), "Grace") // null
    distinctOrNull(listOf(), "Ada") // null
}
```

Сравнение имён учитывает регистр. Пустая строка считается обычным именем. Исходный список менять нельзя. Обход списка в цикле не требуется. Печатать результат не нужно.

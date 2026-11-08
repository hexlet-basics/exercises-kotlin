Объявите класс `Holder<T>` с одним доступным только для чтения свойством `value` типа `T`, которое задаётся первичным конструктором.

Реализуйте обобщённую функцию `unwrap(holder: Holder<T>): T`, возвращающую сохранённое значение без изменения его типа. Контейнер должен поддерживать строки, числа, собственные типы и nullable-значения. Ограничение `T : Any` в этом задании не требуется.

```kotlin
fun main() {
    val number: Int = unwrap(Holder(7))
    val text: String? = unwrap(Holder<String?>(null))
    println(number) // 7
    println(text) // null
}
```

В окружении уже есть две функции с одинаковым именем. `units.distance.format(value: Int): String` возвращает расстояние, например `"7 m"`. `units.duration.format(value: Int): String` возвращает длительность, например `"7 s"`.

В файле _Main.kt_ сохраните объявление `package exercise`. Импортируйте обе функции с разными псевдонимами. Реализуйте функцию `measurementLabel(value: Int): String`, которая вызывает обе функции для переданного числа и соединяет результаты строкой `" | "`.

Файлы окружения _support/Distance.kt_ и _support/Duration.kt_ уже подготовлены. Создавать или изменять их не требуется.

```kotlin
fun main() {
    println(measurementLabel(7)) // 7 m | 7 s
    println(measurementLabel(0)) // 0 m | 0 s
    println(measurementLabel(-3)) // -3 m | -3 s
}
```

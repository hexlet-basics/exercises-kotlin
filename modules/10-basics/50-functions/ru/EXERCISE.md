Реализуйте функцию `minutesToHours(minutes: Int): Double`. Она переводит целое число минут в часы с дробной частью и возвращает результат. Отрицательные значения тоже допустимы, например для смещения времени.

Функция должна возвращать число, вывод в консоль не требуется.

```kotlin
fun main() {
    println(minutesToHours(90)) // 1.5
    println(minutesToHours(15)) // 0.25
    println(minutesToHours(0)) // 0.0
    println(minutesToHours(-30)) // -0.5
}
```

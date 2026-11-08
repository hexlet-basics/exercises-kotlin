Реализуйте `readOrDefault(operation: () -> Int, fallback: Int, onFinish: () -> Unit): Int`.

Функция должна один раз вызвать `operation` и вернуть её результат. Если операция выбросила `IllegalArgumentException`, верните `fallback`. Любые другие исключения должны передаваться вызывающему коду.

После попытки обязательно один раз вызовите `onFinish`, при успехе, ожидаемой ошибке и посторонней ошибке. Используйте `try/catch/finally`. По условиям задачи `onFinish` сама исключений не выбрасывает.

```kotlin
fun main() {
    val result = readOrDefault({ 12 }, -1) { println("Finished") }
    println(result) // 12
}
```

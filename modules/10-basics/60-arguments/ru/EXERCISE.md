Реализуйте функцию `makeSignature(name: String, role: String = "member", prefix: String = "@"): String`. Она возвращает подпись в формате `префиксИмя [роль]`.

Параметр `name` обязателен. Для `role` задайте значение по умолчанию `"member"`, для `prefix` задайте `"@"`. Между именем и открывающей квадратной скобкой должен быть один пробел. Пустые строки тоже допустимы и подставляются без замены.

```kotlin
fun main() {
    println(makeSignature("Mira")) // @Mira [member]
    println(makeSignature("Lev", role = "admin")) // @Lev [admin]
    println(makeSignature("Ira", prefix = "#")) // #Ira [member]
    println(makeSignature(prefix = "+", name = "Sam", role = "guest")) // +Sam [guest]
}
```

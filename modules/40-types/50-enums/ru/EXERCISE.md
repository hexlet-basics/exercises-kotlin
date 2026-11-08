Создайте перечисление `DeliveryMode` со свойством `days: Int` и тремя константами.

- `PICKUP` содержит 0 дней.
- `STANDARD` содержит 3 дня.
- `EXPRESS` содержит 1 день.

Реализуйте функцию `shippingCost(mode: DeliveryMode): Int`. Самовывоз `PICKUP` стоит 0, доставка `STANDARD` стоит 200, доставка `EXPRESS` стоит 500.

```kotlin
fun main() {
    shippingCost(DeliveryMode.STANDARD) // 200
    println(DeliveryMode.EXPRESS.days) // 1
}
```

Обработайте все константы в `when` без `else`. Печатать результат не нужно.

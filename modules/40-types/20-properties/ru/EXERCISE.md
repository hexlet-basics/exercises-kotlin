Создайте класс `StepCounter(start: Int)`. Начальное значение хранится в свойстве `value: Int`. При отрицательном `start` блок `init` должен заменить его на 0. Читать `value` можно снаружи, а запись разрешена только внутри класса через `private set`.

Добавьте вычисляемое свойство `doubled: Int`, которое при каждом чтении возвращает `value * 2`.

Метод `advance(steps: Int)` увеличивает `value` только при положительном `steps`. Ноль и отрицательные аргументы сохраняют текущее значение.

```kotlin
fun main() {
    val counter = StepCounter(-3)
    println(counter.value) // 0
    counter.advance(4)
    println(counter.value) // 4
    println(counter.doubled) // 8
    counter.advance(-1)
    println(counter.value) // 4
}
```

Все суммы и удвоенные значения помещаются в `Int`. Печатать результат из класса не нужно.

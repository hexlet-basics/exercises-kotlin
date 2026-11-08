Создайте интерфейс `Charge` со свойством `label: String` только для чтения и методом `amount(): Int`.

Реализуйте два класса с этим интерфейсом.

- `FixedCharge(label: String, fee: Int)` возвращает из `amount()` значение `fee`.
- `ItemCharge(label: String, unitPrice: Int, quantity: Int)` возвращает произведение `unitPrice` и `quantity`.

У обоих классов свойство `label` должно содержать переданную подпись. В конструкторе используйте `override val label`.

```kotlin
fun main() {
    val fixed: Charge = FixedCharge("delivery", 50)
    val items: Charge = ItemCharge("books", 20, 3)
    fixed.amount() // 50
    items.amount() // 60
    println(items.label) // books
}
```

Числа неотрицательны, произведения помещаются в `Int`. Печатать результат не нужно.

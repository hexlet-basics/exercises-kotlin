Создайте класс данных `Product` с двумя свойствами первичного конструктора, `name: String` и `price: Int`. Оба свойства объявляются через `val`.

Реализуйте функцию `discounted(product: Product, discount: Int): Product`. Она возвращает копию товара с ценой, уменьшенной на `discount`. Название сохраняется, исходный экземпляр не меняется. Используйте `copy()`.

```kotlin
fun main() {
    val product = Product("Notebook", 100)
    val result = discounted(product, 15)
    println(result) // Product(name=Notebook, price=85)
    println(product.price) // 100
}
```

Цена неотрицательна, скидка находится от 0 до цены включительно. Даже при нулевой скидке функция возвращает отдельный экземпляр. Печатать результат не нужно.

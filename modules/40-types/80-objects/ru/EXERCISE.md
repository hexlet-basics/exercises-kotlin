В готовом окружении объявлен интерфейс `NameSource` с методом `name(): String`.

Создайте объект `DefaultName`, который реализует `NameSource` и возвращает из `name()` строку `"Guest"`.

Создайте класс `Member` со свойством первичного конструктора `val name: String`. В его неименованном `companion object` добавьте фабричную функцию `fromText(text: String): Member`.

Фабрика удаляет пробелы по краям текста. Если результат пустой, она использует `DefaultName.name()`. В остальных случаях имя сохраняет регистр. Каждый вызов создаёт новый экземпляр.

```kotlin
fun main() {
    Member.fromText("  Ada ").name // Ada
    Member.fromText("   ").name // Guest
    DefaultName.name() // Guest
}
```

Интерфейс менять не нужно. Печатать результат не нужно.

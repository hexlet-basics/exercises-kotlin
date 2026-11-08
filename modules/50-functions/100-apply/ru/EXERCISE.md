В файле объявлен класс `Notification` с изменяемыми свойствами `title`, `message` и `urgent`. Реализуйте `createNotification(title: String, message: String, urgent: Boolean): Notification`.

Создайте новый экземпляр через конструктор без аргументов и настройте его через `apply`. В заголовке и сообщении уберите пробелы по краям. Признак срочности сохраните без изменений. Каждый вызов должен возвращать отдельный экземпляр.

```kotlin
fun main() {
    val notification = createNotification(" News ", " Ready ", true)
    println(notification.title) // News
    println(notification.urgent) // true
}
```

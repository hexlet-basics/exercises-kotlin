В файле объявлен `Ticket(id: Int, priority: Int)`. Реализуйте `orderTickets(tickets: List<Ticket>): List<Ticket>`.

Верните новый список, упорядоченный сначала по `priority` по возрастанию, затем по `id` по возрастанию. Используйте `sortedWith`, `compareBy` и `thenBy`. Если оба значения совпадают, сохраните исходный порядок записей. Исходный список не изменяется. Для пустого входа верните пустой список.

```kotlin
fun main() {
    println(orderTickets(listOf(Ticket(9, 2), Ticket(4, 1), Ticket(2, 1))))
    // [Ticket(id=2, priority=1), Ticket(id=4, priority=1), Ticket(id=9, priority=2)]
}
```

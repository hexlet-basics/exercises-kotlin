Опишите состояние загрузки через `sealed interface LoadState` и три варианта.

- `data class Ready(val count: Int) : LoadState` содержит число загруженных элементов.
- `object Loading : LoadState` обозначает продолжающуюся загрузку.
- `object Missing : LoadState` обозначает отсутствие данных.

Реализуйте функцию `statusText(state: LoadState): String`. Для `Ready` она возвращает `"items=N"`, где `N` содержит `count`. Для `Loading` результат равен `"loading"`, для `Missing` равен `"missing"`.

```kotlin
fun main() {
    statusText(Ready(4)) // items=4
    statusText(Ready(0)) // items=0
    statusText(Loading) // loading
    statusText(Missing) // missing
}
```

Число `count` неотрицательно. Обработайте все варианты через `when` без `else`. Для чтения `count` используйте проверку типа `is Ready`. Печатать результат не нужно.

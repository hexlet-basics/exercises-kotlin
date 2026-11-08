// BEGIN
fun <T : Any> findLastMatching(
    values: List<T>,
    predicate: (T) -> Boolean,
): T? {
    var result: T? = null
    for (value in values) {
        if (predicate(value)) result = value
    }
    return result
}
// END

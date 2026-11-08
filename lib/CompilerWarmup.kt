private data class WarmupRecord(
    val word: String,
    val count: Int,
)

private sealed interface WarmupResult

private data class WarmupFound(
    val record: WarmupRecord,
) : WarmupResult

private object WarmupMissing : WarmupResult

private fun countWarmupWords(words: List<String>): Map<String, Int> {
    val counts = mutableMapOf<String, Int>()
    for (word in words) {
        counts[word] = (counts[word] ?: 0) + 1
    }
    return counts
}

private fun parseWarmupValues(values: List<String?>): List<Int> = values.mapNotNull { it?.trim()?.toIntOrNull() }.filter { it > 0 }

private fun warmupLabel(result: WarmupResult): String =
    when (result) {
        is WarmupFound -> "${result.record.word}:${result.record.count}"
        WarmupMissing -> "missing"
    }

private fun <T : Any> findWarmupValue(
    values: List<T>,
    predicate: (T) -> Boolean,
): T? {
    for (value in values) {
        if (predicate(value)) return value
    }
    return null
}

fun countWords(words: List<String>): Map<String, Int> {
    // BEGIN
    val counts = mutableMapOf<String, Int>()
    for (word in words) {
        counts[word] = (counts[word] ?: 0) + 1
    }
    return counts
    // END
}

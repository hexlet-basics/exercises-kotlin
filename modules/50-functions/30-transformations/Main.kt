fun parsePositiveValues(values: List<String>): List<Int> {
    // BEGIN
    return values
        .map { it.trim() }
        .mapNotNull { it.toIntOrNull() }
        .filter { it > 0 }
    // END
}

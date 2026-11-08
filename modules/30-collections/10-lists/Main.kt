fun replaceAndRead(
    values: MutableList<String>,
    index: Int,
    replacement: String,
): String? {
    // BEGIN
    val previous = values.getOrNull(index) ?: return null
    values[index] = replacement
    return previous
    // END
}

fun distinctOrNull(
    names: List<String>,
    required: String,
): Set<String>? {
    // BEGIN
    val unique = names.toSet()
    if (required !in unique) {
        return null
    }
    return unique
    // END
}

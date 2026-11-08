fun readCount(value: Any?): Int? {
    // BEGIN
    return when (value) {
        is Int -> value
        is String -> value.trim().toIntOrNull()
        else -> null
    }
    // END
}

fun readOrDefault(
    operation: () -> Int,
    fallback: Int,
    onFinish: () -> Unit,
): Int {
    // BEGIN
    return try {
        operation()
    } catch (error: IllegalArgumentException) {
        fallback
    } finally {
        onFinish()
    }
    // END
}

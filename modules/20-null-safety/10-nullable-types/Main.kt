fun parsePercent(text: String): Int? {
    // BEGIN
    val number = text.trim().toIntOrNull()
    if (number == null || number < 0 || number > 100) {
        return null
    }
    return number
    // END
}

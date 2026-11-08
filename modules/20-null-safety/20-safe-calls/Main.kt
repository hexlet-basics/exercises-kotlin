fun visibleLength(
    text: String?,
    fallback: Int,
): Int {
    // BEGIN
    return text?.trim()?.length ?: fallback
    // END
}

fun labelLength(text: String?): Int? {
    // BEGIN
    return text?.let { it.trim().length }
    // END
}

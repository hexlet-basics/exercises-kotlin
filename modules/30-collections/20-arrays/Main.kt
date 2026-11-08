fun addOffset(
    values: IntArray,
    offset: Int,
) {
    // BEGIN
    for (index in values.indices) {
        values[index] = values[index] + offset
    }
    // END
}

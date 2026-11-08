// BEGIN
fun firstMultiple(
    start: Int,
    endInclusive: Int,
    divisor: Int,
): Int {
    for (number in start..endInclusive) {
        if (number % divisor == 0) {
            return number
        }
    }
    return -1
}
// END

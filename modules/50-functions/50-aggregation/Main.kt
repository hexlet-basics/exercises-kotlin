fun balanceAfter(
    start: Int,
    changes: List<Int>,
): Int {
    // BEGIN
    return changes.fold(start) { balance, change ->
        val updated = balance + change
        if (updated < 0) 0 else updated
    }
    // END
}

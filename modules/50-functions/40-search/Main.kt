fun inspectScores(
    scores: List<Int>,
    threshold: Int,
): Pair<Int?, Boolean> {
    // BEGIN
    return scores.find { it >= threshold } to scores.all { it >= 0 }
    // END
}

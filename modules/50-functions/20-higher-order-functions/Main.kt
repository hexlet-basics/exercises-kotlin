fun makeMultiplier(factor: Int): (Int) -> Int {
    // BEGIN
    return { value -> value * factor }
    // END
}

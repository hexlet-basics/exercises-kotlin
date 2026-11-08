fun summarizeStock(stock: Map<String, Int>): Pair<Int, Int> {
    // BEGIN
    var available = 0
    var total = 0
    for ((_, quantity) in stock) {
        if (quantity > 0) {
            available = available + 1
        }
        total = total + quantity
    }
    return available to total
    // END
}

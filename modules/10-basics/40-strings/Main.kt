fun main() {
    val raw = "  USER-42  "
    // BEGIN
    val normalized = raw.trim().lowercase()
    println("$normalized (${normalized.length})")
    // END
}

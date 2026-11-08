// BEGIN
object DefaultName : NameSource {
    override fun name(): String = "Guest"
}

class Member(
    val name: String,
) {
    companion object {
        fun fromText(text: String): Member {
            val cleaned = text.trim()
            val name = if (cleaned == "") DefaultName.name() else cleaned
            return Member(name)
        }
    }
}
// END

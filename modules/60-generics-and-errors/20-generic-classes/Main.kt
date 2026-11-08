// BEGIN
class Holder<T>(
    val value: T,
)

fun <T> unwrap(holder: Holder<T>): T = holder.value
// END

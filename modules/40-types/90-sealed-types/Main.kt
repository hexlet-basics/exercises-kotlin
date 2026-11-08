// BEGIN
sealed interface LoadState

data class Ready(
    val count: Int,
) : LoadState

object Loading : LoadState

object Missing : LoadState

fun statusText(state: LoadState): String =
    when (state) {
        is Ready -> "items=${state.count}"
        Loading -> "loading"
        Missing -> "missing"
    }
// END

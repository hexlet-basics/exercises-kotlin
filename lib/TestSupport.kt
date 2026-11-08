import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun expectEquals(
    expected: Any?,
    actual: Any?,
    label: String = "",
) {
    if (expected != actual) {
        throw AssertionError("$label\nExpected: $expected\nActual: $actual")
    }
}

fun expectTrue(
    condition: Boolean,
    label: String = "",
) {
    if (!condition) {
        throw AssertionError(label.ifEmpty { "Expected true" })
    }
}

fun captureOutput(block: () -> Unit): String {
    val original = System.out
    val bytes = ByteArrayOutputStream()
    val stream = PrintStream(bytes, true, Charsets.UTF_8)
    return try {
        System.setOut(stream)
        block()
        stream.flush()
        bytes.toString(Charsets.UTF_8)
    } finally {
        System.setOut(original)
        stream.close()
    }
}

inline fun <reified T : Throwable> expectThrows(block: () -> Unit): T {
    try {
        block()
    } catch (error: Throwable) {
        if (error is T) {
            return error
        }
        throw AssertionError("Expected ${T::class.simpleName}, got ${error::class.simpleName}", error)
    }
    throw AssertionError("Expected ${T::class.simpleName}, but no exception was thrown")
}

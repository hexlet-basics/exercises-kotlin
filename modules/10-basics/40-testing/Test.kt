import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.stream.Collectors

fun main() {
    val expected = 420262531
    val p = Runtime.getRuntime().exec("kotlin -classpath Main.jar MainKt")
    p.waitFor()
    val input = BufferedReader(
        InputStreamReader(p.inputStream, StandardCharsets.UTF_8)
    ).lines()
        .collect(Collectors.joining(""))
        .toInt()

    assert(expected == input)
}

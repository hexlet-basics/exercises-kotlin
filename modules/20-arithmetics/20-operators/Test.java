import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import org.assertj.core.api.Assertions;

class Test {
    public static void main(final String[] args) {
        final var expected = "87";

        MainKt.main();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MainKt.main();

        final var actual = out.toString().trim();

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.assertj.core.api.Assertions;

class Test {
    public static void main(final String[] args) {
        final String expected = "15\n2";

        MainKt.main();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MainKt.main();

        final String actual = out.toString().trim();

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}

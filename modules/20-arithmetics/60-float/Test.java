import static hexlet.io.TestUtils.getStandartOutput;
import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(final String[] args) {
        final String expected = "0.0858";

        MainKt.main();

        final String actual = getStandartOutput(() -> MainKt.main()).trim();

        assertThat(actual).isEqualTo(expected);
    }
}

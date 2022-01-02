import static hexlet.io.TestUtils.getStandartOutput;
import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(final String[] args) {
        final String expected = "- Did Joffrey agree?\n- He did. He also said \"I love using \\n\".";

        MainKt.main();

        final String actual = getStandartOutput(() -> MainKt.main()).trim();

        assertThat(actual).isEqualTo(expected);
    }
}

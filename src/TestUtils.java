package hexlet.io;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtils {
    public static String getStandartOutput(Runnable fn) {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));
        fn.run();
        System.setOut(standardOut);

        return output.toString();
    }
}

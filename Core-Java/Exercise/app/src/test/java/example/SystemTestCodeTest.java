package example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class SystemTestCodeTest {
    private static PrintStream originalOut;
    private static InputStream originalIn;

    private ByteArrayOutputStream out;

    private String want = "10을 8로 나누면, \n" +
            "몫은 1이고, 나머지는 2입니다\n";

    @BeforeAll
    static void saveOriginals() {
        originalOut = System.out;
        originalIn = System.in;
    }

    @BeforeEach
    void setupInput() {
        this.out = new ByteArrayOutputStream(want.length());
        System.setOut(new PrintStream(this.out));
    }

    @AfterAll
    static void restoreOriginals() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void result() {
        SystemTestCode.main(null);

        assertThat(this.want).isEqualTo(out.toString());
    }

}

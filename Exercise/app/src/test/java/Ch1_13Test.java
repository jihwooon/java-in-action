import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1_13Test {
    private static PrintStream originOut;
    private static InputStream originalIn;
    private static ByteArrayOutputStream out;

    @BeforeAll
    static void saveOriginals() {
        originOut = System.out;
        originalIn = System.in;
    }

    @AfterAll
    static void restoreOriginals() {
        System.setOut(originOut);
        System.setIn(originalIn);
    }

    @BeforeEach
    void setUpInput() {
        this.out = new ByteArrayOutputStream(300);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void check() {
        Ch1_13.main(null);
        var parts = this.out.toString().trim().split(" ");
        assertThat(parts.length).isEqualTo(6);
        var last = 0;
        for (String part : parts) {
            var val = Integer.valueOf(part);
            assertTrue(val >= last);
            last = val;
        }
    }
}

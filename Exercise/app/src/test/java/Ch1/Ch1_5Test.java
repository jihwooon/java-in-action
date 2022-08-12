package Ch1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_5Test {

    private static PrintStream originOut;
    private static InputStream originIn;
    private  ByteArrayOutputStream out;


    private final String want = "Double 1.0 + Integer.MAX_VALUE 2.14748e+09 as int 2147483647 Integer.MAX_VALUE 2147483647\n" +
            "Double 2000000000.0 + Integer.MAX_VALUE 4.14748e+09 as int 2147483647 Integer.MAX_VALUE 2147483647\n";

    @BeforeAll
    static void saveOrigin() {
        originOut = System.out;
        originIn = System.in;
    }

    @BeforeEach
    void setUp() {
        this.out = new ByteArrayOutputStream(300);
        System.setOut(new PrintStream(this.out));
    }

    @AfterAll
    static void restoreOriginals() {
        System.setOut(originOut);
        System.setIn(originIn);
    }

    @Test
    void result() {
        Ch1_5.main(null);
        assertThat(this.want).isEqualTo(this.out.toString());
    }

}

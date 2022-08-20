package example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class ConsoleTest {

    private Console console;

    @Mock
    private PrintStream out;

    private PrintStream org;


    @BeforeEach
    void setUp() {
        console = new Console();
        org = System.out;
        System.setOut(out);
    }

    @AfterEach
    void tearDown() {
        System.setOut(org);
    }

    @Test
    void printLine() {
        console.printLine("line");

        verify(out).println("line");
    }

}

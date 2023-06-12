import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FibonacciTest {
    class Fibbonaci {
        int fib(int n) {
            if (n == 0) return 0;
            if (n <= 2) return 1;

            return fib(n - 1) + fib(n - 2);
        }
    }

    @Test
    void result() {
        Fibbonaci fibonacci = new Fibbonaci();

        assertThat(fibonacci.fib(3)).isEqualTo(2);
        assertThat(fibonacci.fib(4)).isEqualTo(3);
        assertThat(fibonacci.fib(5)).isEqualTo(5);
    }
}

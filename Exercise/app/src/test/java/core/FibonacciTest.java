package core;

import core.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {


    @Test
    void result() {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(fibonacci.solution(0)).isEqualTo(0);
        assertThat(fibonacci.solution(1)).isEqualTo(1);
        assertThat(fibonacci.solution(2)).isEqualTo(1);
        assertThat(fibonacci.solution(3)).isEqualTo(2);
        assertThat(fibonacci.solution(4)).isEqualTo(3);
        assertThat(fibonacci.solution(5)).isEqualTo(5);
    }

}

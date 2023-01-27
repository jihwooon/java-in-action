package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursiveTail {

    public int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursive(n - 1);
    }

    public int tailRecursive(int n, int acc) {
        System.out.println("n = " + n);
        System.out.println("acc = " + acc);
        if (n == 1) {
            return acc;
        }

        return tailRecursive(n - 1, n + acc);
    }

    @Test
    void result() {

//        assertThat(recursive(10)).isEqualTo(55);
        assertThat(tailRecursive(3, 2)).isEqualTo(7);
    }
}

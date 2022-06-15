package solution01;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class Example06Test {

    // BigInter로 1000!를 구하라 - 재귀
    private BigInteger factorial_recursion(int n) {

        if (n == 0) {
            return BigInteger.ONE;
        }

        return factorial_recursion(n - 1).multiply(BigInteger.valueOf(n));
    }

    // BigInter로 1000!를 구하라 - 루프
    private BigInteger factorial_loop(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    @Test
    void result() {
        assertThat(factorial_recursion(4)).isEqualTo(24);
        assertThat(factorial_recursion(0)).isEqualTo(1);
        assertThat(factorial_recursion(10)).isEqualTo(3628800);
//        assertThat(factorial_recursion(10000)).isEqualTo(12);
        assertThat(factorial_loop(4)).isEqualTo(24);
        assertThat(factorial_loop(0)).isEqualTo(1);
        assertThat(factorial_loop(10)).isEqualTo(3628800);
//        assertThat(factorial_loop(1000)).isEqualTo(3628800);
    }
}

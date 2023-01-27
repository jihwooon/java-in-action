package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution {

    public int solution(int n) {
        return run(n);
    }

    private int run(int n) {
        int x = 2;
        while (true) {
            if(n % x == 1) {
                return x;
            }

            x = x + 1;
        }
    }

    @Test
    void result() {

        assertThat(solution(5)).isEqualTo(2);
    }
}

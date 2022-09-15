package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Example {

    // 수 세기
    public int solution(int n, int[] data) {
        int count = 0;

        for(int d : data) {
            count += n;
            n %= d;
        }

        return count;
    }

    @Test
    void result() {

        assertThat(solution(1260 ,new int[] {500, 100, 50, 10})).isEqualTo(1590);

    }
}

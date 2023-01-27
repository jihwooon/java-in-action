package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 거스름돈 {

    public int solution(int n, int... arr) {
        int count = 0;

        for (int coin : arr) {
            count += n / coin;
            n %= coin;
        }

        return count;
    }

    @Test
    void result() {

        assertThat(solution(1260, 500, 100, 50, 10)).isEqualTo(6);
    }
}

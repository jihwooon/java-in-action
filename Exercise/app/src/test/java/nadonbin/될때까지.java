package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하라.
 * ## 자료
 * - n에서 1을 뺀다.
 * - n을 k로 나눈다.
 * -
 * ## 조건
 * - n을 K로 나누어 떨어 질 때만 사용이 가능하다.
 * - N은 항상 K보다 크거나 같다.
 * <p>
 * ## 계획
 * - N과 K의 입력을 받는다.
 * - N이 25이면 K=5로 나눈다.
 * - 나눈 수 5를 K로 한번 더 나눈다.
 * - 반복 된 최소의 수를 반환한다.
 * <p>
 * ## 반성
 * - 문제를 보고 코드로 그대로 떠올리지 못했다.
 * -
 * -
 */

public class 될때까지 {

    public int solution(int n, int k) {
        int count = 0;

        while (n >= k) { //n >= k 이상 일 때
            while (n % k != 0) { // n 이 k로 나누어 떨어질 때
                n -= 1; // n을 k로 나눈다.
                count += 1;
            }

            n /= k; // n에서 1을 뺀다.
            count += 1;

        }

        while (n > 1) { // n이 k로 더 이상 나눌 수 없을 때 1을 뺀다.
            n -= 1;
            count += 1;
        }

        return count;
    }


    @Test
    void result() {
        assertThat(solution(25, 5)).isEqualTo(2);
        assertThat(solution(28, 3)).isEqualTo(4);
        assertThat(solution(25, 3)).isEqualTo(6);
    }
}

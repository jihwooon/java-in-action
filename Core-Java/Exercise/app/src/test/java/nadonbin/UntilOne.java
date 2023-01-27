package nadonbin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * N과 K가 주어질 때 N이 1이 될때까지 1번 혹은 2번 과정을 수행해야 하는 최소 횟수를 구하라
 * ## 자료
 * - N은 입력수
 * - K는 나누는 수
 * - 첫번째 N에서 1을 뺀다.
 * - 두번째 연산 N이 K로 나누어 떨어져야 한다.
 * <p>
 * ## 조건
 * - N은 항상 K보다 크거나 같다.
 * - N이 K로 나누어 떨어져야 한다.
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * - while 문을 사용하지 않고 재귀함수, for문으로 풀어 볼 수 있을 것 같다.
 * -
 */

public class UntilOne {

    public int solution(int n, int k) {
        int result = 0;

        while(n >= k) {
            while (n % k != 0) {
                n -=1;
                result += 1;
            }
            n /= k;
            result += 1;
        }

        while(n > 1) {
            n -= 1;
            result += 1;
        }

        return result;
    }

    @Test
    public void result() {

        assertThat(solution(25, 5)).isEqualTo(2);
        assertThat(solution(17, 4)).isEqualTo(3);
    }

}

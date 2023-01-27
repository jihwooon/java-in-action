package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/** 나머지가 1이 되는 수 찾기
 * ## 미지의 것
 *  n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 하라.
 *
 * ## 자료
 * - n은 자연수 = long
 * - 나머지가 1이 되도록 한다.
 *   >>  n % x = 1
*  - 가장 작은 자연수 x
 *   >> 최소값
 * - 자연수가 3 이상부터 시작한다.
 *   >> 0, 1 ,2 는 못한다.
 * ## 조건
 * - 3 <= n <= 1,000,000
 *   >> 0, 1, 2 는 반환이 안 된다.
 * ## 계획
 * - n이 3 이상을 받는다.
 * -
 *
 * ## 반성
 * - 재귀적으로 다시 풀어 보는 것도 좋겠다.
 * -
 *
 */

public class SearchNumberOfOne {
    public int solution(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 1) {
                return i;
            }
        }

        return -1;
    }

    @Test
    void result() {
        assertThat(solution(10)).isEqualTo(3);

    }
}

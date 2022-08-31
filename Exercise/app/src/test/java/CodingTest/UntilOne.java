package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 이해 : 1이 될 때까지
 * <p>
 * 미지의 것: N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하세요.
 * 자료
 * - N에서 1을 뺀다.
 * >>
 * - N을 K로 나눈다.
 * >> 만약 N을 K로 나눌 수 없다면?
 * >> N을 1로 뺀다.
 * >> 나머지가 0이 나오면 끝이 난다.
 * >> 나머지가 0이 아닌 경우
 *
 * <p>
 * 조건
 * - N은 항상 K보다 크거나 같다.
 * <p>
 * ## 계획
 * - N이 K이상이여야 한다.
 * - N이 K에서 나눠지지 않으면 -1을 한다.
 * -
 *
 * <p>
 * ## 실행
 * <p>
 * ## 반성
 * -
 * -
 */

public class UntilOne {

    public int solution(int N, int K) {
        // 최소 횟수
        int count = 0;





        return count;
    }


    @Test
    void result() {
        assertThat(solution(25, 5)).isEqualTo(2); // 나누기 2번 나머지 0
        assertThat(solution(17, 4)).isEqualTo(2); // -1 하고 4로 나눈 후 나머지 0
    }
}

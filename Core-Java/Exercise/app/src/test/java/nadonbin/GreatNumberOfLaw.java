package nadonbin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 배열의 크기 N, 숫자가 더해지는 횟수 M, K가 주어질 때 큰 수의 법칙에 따른 결과를 출력하라.
 * ## 자료
 * - 배열의 크기 N
 * - 더해지는 횟수 M
 * -
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * - 숫자 중 가장 큰 수를 M 횟수만큼 더한다.
 * - 그 다음 두번째로 큰 수를 더한다.
 * - 출력한다.
 * <p>
 * ## 반성
 * -
 * -
 */
public class GreatNumberOfLaw {

    public int solution(int m, int k, int... n) {
        int result = 0;
        Arrays.sort(n);

        int first = n[n.length - 1];
        int second = n[n.length - 2];

        while (m != 0) {
            for (int i = 0; i < k; i++) {
                result += first;
                m--;
            }
            result += second;
            m--;
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(8, 3, 2, 4, 5, 4, 6)).isEqualTo(46);
    }

}

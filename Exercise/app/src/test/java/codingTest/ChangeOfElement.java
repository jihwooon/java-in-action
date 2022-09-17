package codingTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 이해
 * <p>
 * 미지의 것: N,K 그리고 배열 A, B의 정보가 주어졌을 때, 최대 K번의 바꿔치기 연산을 수행하여 만들 수 있는 배열의 A의 모든 원소의 합의 최대값을 구하시요.
 * 자료
 * - K은 횟수이다.
 * <p>
 * 조건
 * -
 * <p>
 * ## 계획
 * - 두 배열을 입력 받는다.
 * - A 배열은 내림 차순으로 정렬한다.
 * - B 배열은 오름 차순으로 정렬한다.
 * - n의 숫자만큼 순서대로 A[i] 와 B[i]의 자리를 바꾼다.
 * - 예외는 A[i] < B[i]인 경우가 있다.
 * - A 배열의 원소를 합을 출력한다.
 * ## 실행
 * <p>
 * ## 반성
 * - 재귀로 바꿔봐야겠다.
 */

public class ChangeOfElement {

    public Integer solution(Integer[] x, Integer[] y, int n) {
        Integer result = 0;

        Arrays.sort(x);
        Arrays.sort(y, Collections.reverseOrder());

        // 횟수만큼 배열 자리를 바꾼다.
        for (int i = 0; i < n; i++) {
            if (x[i] < y[i]) {
                x[i] = y[i];
            }
        }

        //A 배열의 모두의 수를 더한다.
        for (int j = 0; j < x.length; j++) {
            result += x[j];

        }
        return result;
    }

    @Test
    void result() {

        assertThat(solution(
                new Integer[]{1, 2, 5, 4, 3},
                new Integer[]{1, 1, 1, 1, 1},
                3
        )).isEqualTo(15);
    }
}

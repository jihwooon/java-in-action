package nadonbin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 배열의 크기 n, 숫자가 더해지는 횟수 m,k가 주어졌을 때 큰 수의 법칙에 따른 결과를 출력하라.
 * ## 자료
 * - 배열의 크기 n
 * - 더해지는 횟수 M
 * - 큰수를 k만큼 연속해서 더할 수 있다.
 * <p>
 * ## 조건
 * - 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없는 것이 조건
 * - 입력으로 주어지는 K는 항상 M보다 작거나 같다.
 * -
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class 큰수의법칙 {

    public int law0fNumber(int m, int k, int... arr) {
        int result = 0;

        Arrays.sort(arr);

        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];

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
        assertThat(law0fNumber(8, 3, 2, 4, 5, 4, 6)).isEqualTo(46);
    }

}

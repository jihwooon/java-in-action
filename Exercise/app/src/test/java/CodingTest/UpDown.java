package CodingTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 위에서 아래로
 * ## 미지의 것: 이 수를 큰수부터 작은 수의 순서로 정렬해라.
 * <p>
 * ## 자료
 * - 수열 : 수의 나열
 * >>  a + (n - 1)d (n = 1, 2, 3, ...)
 * - 내림차순
 * >> 큰 수부터 작은수의 순서
 * <p>
 * ## 조건
 * - 수의 개수 N이 (1 <= N <= 500)
 * <p>
 * ## 계획
 * - 자리수를 입력 한다.
 * - 수를 입력한다.
 * - 정렬한다.
 * ## 실행
 * <p>
 * ## 반성
 * -
 */

public class UpDown {

    public Integer [] solution(Integer [] arr) {

        Arrays.sort(arr, Collections.reverseOrder());

        return arr;
    }


    @Test
    void result() {
        assertThat(solution(new Integer[]{15,27,12})).isEqualTo(new Integer[] {27, 15, 12});
    }
}

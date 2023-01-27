package backJun;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 동전을 적절히 사용해 그 가치의 합을 k로 만들고 이때 필요한 동전 개수의 최소값을 구하라.
 * <p>
 * ## 자료
 * - 동전 N
 * - 가치의 합
 * ## 조건
 * - N개의 동전의 가치는 오름차순으로 정렬한다.
 * <p>
 * ## 계획
 * - 동전 종류와 동전 가치의 합의 값을 입력 받는다.
 * - 입력 받은 동전을 오름차순으로 정렬한다.
 * - 동전의 개숫를 뒤에서부터 앞으로 센다.
 * - 현재 동전의 갯수가 현재 가치의 합의 이하라면 k의 나머지 연산을 한다.
 * - 나머지 연산을 한 값을 k / arr[i] 값에 반환해서 count를 증가 시킨다.
 * - count 값을 반한환다.
 * <p>
 * <p>
 * ## 반성
 * - 문제를 보고 동전의 최소의 값이 떠올르지 않는다.
 * - 자바에서는 기본형을 내림차순으로 정렬 할 수 없어서 배열을 맨뒤부터 앞으로 세는것을 하면 쉽게 할 수 있다.
 */

public class CoinZero {


    public static int solution(int k, int... arr) { // 가변 인수는 맨 마지막에 붙인다.
        int count = 0; // 동전 개수 최소값

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) { //동전의 개수가 큰 수부터 하나씩 확인
            if (arr[i] <= k) { // 현재 동전의 갯수가 현재의 가치의 합 이하라면,
                count += k / arr[i];
                k = k % arr[i];
            }
        }

        return count;
    }

    @Test
    void result() {
        assertThat(solution(4200, 1, 5000, 10, 100, 500, 1000, 5, 10000, 50000)).isEqualTo(6);

    }

}

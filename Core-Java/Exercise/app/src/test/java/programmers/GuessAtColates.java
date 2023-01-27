package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * ## 콜라스 추측
 * 미지의 것: 몇 번이나 반복해야 하는지 반환하는 함수
 * <p>
 * ## 자료
 * - 입력된 수가 짝수라면 2로 나눕니다.
 * - 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * - 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * <p>
 * ## 조건
 * - 짝수이면 나누기 2를 한다.
 * - 홀수가 나오면 3을 곱하고 +1 을 한다.
 * - 횟수가 500이 넘어가면 -1로 반환한다.
 * <p>
 * ## 계획
 * - 수를 입력 받는다.
 * - 500 이하까지 반복을 한다.
 * - 500 이하면 -1을 리턴한다.
 * - 수가 1인 경우 0을 리턴한다.
 * - 짝수인 경우 2로 나누고 아닌 경우 3을 곱하고 1을 더한다.
 * - 값을 반환한다.
 * <p>
 * ## 반성
 * - 입력된 수, num은 1 이상 8,000,000 미만인 정수입니다. 을 확인을 안 하고 Int를 받았다가 통과기 안 됐다.
 * - 제한사항을 주의해서 타입을 변경 해야 한다.
 * -
 */

public class GuessAtColates {

    public int solution(int n) {
        long num = n;

        for (int i = 0; i < 500; i++) {
            if (num == 1) return i;
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;

        }
        return -1;

    }

    @Test
    void result() {
        assertThat(solution(6)).isEqualTo(8);
        assertThat(solution(16)).isEqualTo(4);
        assertThat(solution(626331)).isEqualTo(-1);
    }

}

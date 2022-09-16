package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 점수 n이 주어지면 럭키 스트레이트를 사용 할 수 있는지 없는지 알려주는 프로그램을 작성하라.
 * ## 자료
 * - 럭키 스트레이트
 *  >> 점수 n의 자릿수를 반으로 나눈 후 왼쪽 부분은 자릿수의 합과 오른쪽 자릿수의 합이 동일하면 럭키 스트레이트를 사용할 수 있다.
 *
 * ## 조건
 * - 점수 N의 자릿수는 짝수 형태로만 주어져야 한다.
 * - 홀수 자릿수 인 경우 입력이 들어오지 않는다.
 *
 * ## 계획
 * - 정수를 입력 받는다.
 *  >> 정수는 홀수 자릿수는 입력이 안 된다.
 * - 정수를 반으로 쪼갠다.
 * - 왼쪽부분 각 자릿수의 합을 구한다.
 * - 오른쪽부분 각 자릿수의 합을 구한다.
 * - 두 합이 동일하면 LUCKY를 반환한다.
 * - 두 합이 동일하지 않으면 READY를 반환한다.
 *
 * ## 반성
 * - int형을 배열 타입으로 변경하는데 좀 애먹었다.
 * - String으로 변경을 해야만 바꿀 수 있는지 생각해봐야겠다.
 *
 */

public class Lucky {

    public String solution(int n) {
        String str = Integer.toString(n);

        String Success = "LUCKY";
        String Fail = "READY";

        int left = 0;
        int right = 0;
        int mid = str.length() / 2;

        for(int i = 0; i < mid; i++) {
            left += str.charAt(i) - '0';
        }

        for(int i = str.length() - 1; i > mid - 1; i--) {
            right += str.charAt(i) - '0';
        }

        return right != left ? Fail : Success;
    }

    @Test
    void result() {
        assertThat(solution(123402)).isEqualTo("LUCKY");
        assertThat(solution(7755)).isEqualTo("READY");
        assertThat(solution(220400)).isEqualTo("LUCKY");
        assertThat(solution(11114000)).isEqualTo("LUCKY");
    }
}

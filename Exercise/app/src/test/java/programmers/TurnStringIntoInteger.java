package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 문자열을 정수로 바꾸기
 * 미지의 것: 문자열 S를 숫자로 변환한 결과를 반환하는 함수
 * <p>
 * ## 자료
 * - 문자열을 Int 정수로 변환한다.
 *
 * <p>
 * ## 조건
 * - s의 길이는 1 이상 5이하 입니다.
 * - 문자열은 부호와 숫자로만 이루어져 있습니다.
 * - s의 맨앞에는 부호(+,-)가 올 수 있습니다.
 * - s는 "0"으로 시작하지 않습니다.
 * <p>
 * ## 계획
 * - 문자열을 받습니다.
 * - charAt 메서드를 통해 문자열을 Int형으로 변환합니다.
 * - 문자열을 Int형으로 반환합니다.
 * - '-'와 '+' 는 true 인 경우에 음수(-)로 바꿔주면 됩니다.
 * - 결과에 true 인 경우 음수(-)를 리턴하고 아닌 경우 일반 값을 리턴 합니다.
 * <p>
 * ## 반성
 * - parseInt 함수를 사용하지 않고 문자열을 입력 받아 정수형으로 직접 구현을 해볼 수 있을거 같다.
 * - '-', '+'를 구현할 때 처리하는 방법이 처음에는 어떻게 할 지 몰랐지만 조건에 true와 false를 원리를 알고나니 감이 잡혔다.
 * - str.charAt(i)를 한 자리가 아닌 1234 숫자를 전부 출력할 때 answer * 10를 하면 된다는 것을 알게 되었다.
 */

public class TurnStringIntoInteger {
    public int solution(String str) {
        int answer = 0;
        boolean sign = false;

        for (int i = str.charAt(0) == '-' || str.charAt(0) == '+' ? 1 : 0; i < str.length(); i++) {
            answer = answer * 10 + str.charAt(i) - '0';
        }

        if (str.charAt(0) == '-') {
            sign = true;

        } else if (str.charAt(0) != '+') {

        }

        return sign ? -answer : answer;
    }

    @Test
    void result() {
        assertThat(solution("1234")).isEqualTo(1234);
        assertThat(solution("-1234")).isEqualTo(-1234);
        assertThat(solution("+1234")).isEqualTo(+1234);
    }
}

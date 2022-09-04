package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 문자열을 정수로 바꾸기
 * 미지의 것: 문자열 S를 숫자로 변환한 결과를 반환하는 함수
 * <p>
 * ## 자료
 * - 문자열을 Integer 변환
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
 * - 문자열을 Integer로 반환한다.
 *
 * <p>
 * ## 반성
 * - Integer를 사용하지 않고 만들수 있는 방법이 있다.
 */

public class TurnStringIntoInteger {
    public int solution(String str) {
        int answer = 0;

        for (int i = str.charAt(0) == '-' ? 1 : 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            answer = answer * 10 + (ch - '0');

        }
        return str.charAt(0) == '-' ? -answer : answer;

    }

    @Test
    void result() {
        assertThat(solution("1234")).isEqualTo(1234);
        assertThat(solution("-1234")).isEqualTo(-1234);
    }
}

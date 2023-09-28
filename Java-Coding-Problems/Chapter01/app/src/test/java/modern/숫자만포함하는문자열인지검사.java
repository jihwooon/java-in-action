package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열이 숫자만 포함하는지 검사하는 프로그램을 작성하라
 * ## 자료
 * 문자열에 숫자 포함 여부
 *
 * ## 조건
 * 문자열에 문자만 포함되어 있으면 false
 * 문자열에 숫자가 포함이 되어 있으면 true
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열에 숫자가 포함이 되어 있는지 여부를 확인 하기 위해서 문자열을 배열로 만든다
 * 3. 만약 배열을 탐색하면서 아스키코드로 문자열이 숫자이면 true로 반환한다.
 * 4. 없으면 false로 반환한다.
 *
 * ## 반성
 * Character함수에는 숫자가 있는지 여부를 체크하는 함수가 있었다. 디버깅 모드로 내부를 확인 해보니 '0' <= ch && ch <= '9'로 구현이 되어 있었다.
 * 그리고 boolean은 default가 false로 되어 있어서 이 부분을 헷갈렸는데 다시 공부해보니 알게 되었었다.
 * 정규표현식으로도 이 문제를 풀 수 있었다.
 */

public class 숫자만포함하는문자열인지검사 {

    // 내 풀이
    private boolean solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isDigitsCheck(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    boolean isDigitsCheck(int ch) {
        return '0' <= ch && ch <= '9';
    }

    @Test
    public void result() {
        assertThat(solution("abc")).isEqualTo(false);
        assertThat(solution("ab123c")).isEqualTo(false);
        assertThat(solution("123")).isEqualTo(true);
    }


    // 해답 풀이
    private boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void result2() {
        assertThat(containsOnlyDigits("abc")).isEqualTo(false);
        assertThat(containsOnlyDigits("12345ab")).isEqualTo(false);
        assertThat(containsOnlyDigits("12345")).isEqualTo(true);
    }

    // 해답 풀이
    private boolean containsOnlyDigitsMatch(String str) {
        return str.matches("[0-9]+");
    }

    @Test
    public void result3() {
        assertThat(containsOnlyDigitsMatch("12345")).isEqualTo(true);
        assertThat(containsOnlyDigitsMatch("12345ab")).isEqualTo(false);
        assertThat(containsOnlyDigitsMatch("ab")).isEqualTo(false);
    }
}

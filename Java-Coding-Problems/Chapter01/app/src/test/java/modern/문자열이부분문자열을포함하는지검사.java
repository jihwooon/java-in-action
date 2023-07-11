package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열이 주어진 부분 문자열을 포함하는지 검사하는 프로그램을 작성하라
 *
 * ## 자료
 * 문자열
 * 부분 문자열
 *
 * ## 조건
 * 주어진 문자열을 부분 문자열과 매칭해서 조건에 맞으면 true, 아니면 false
 *
 * ## 계획
 * 1. 문자열과 부분 문자열을 입력한다.
 * 2. 문자가 담겨 있는지 판단하는 메서드를 호출해서 부분 문자열을 입력받는다.
 * 3. 문자열 안에 부분 문자열이 확인 되면 true 아니면 false을 리턴한다.
 *
 * ## 반성
 * contains 함수를 호출해서 문자가 담겨 있는지 대한 여부를 확인한다.
 * indexOf 함수가 여러곳에서 많이 사용되는 것을 이번에 알게되었다.
 *
 */

public class 문자열이부분문자열을포함하는지검사 {

    private boolean solution(String text, String subtext) {
        boolean contains = text.contains(subtext);
        return contains;
    }

    @Test
    @DisplayName("주어진 문자열을 contains 함수를 통해서 부분 문자열 확인하라")
    public void result() {
        assertThat(solution("Hello World", "World")).isTrue();
        assertThat(solution("Hello World", "Nation")).isFalse();
    }

    private boolean contains(String text, String subtext) {
        boolean contain = text.indexOf(subtext) != -1;
        return contain;
    }

    @Test
    @DisplayName("주어진 문자열을 indexOf 함수를 통해서 부분 문자열열 확인하라")
    public void result2() {
        assertThat(contains("Hello World", "World")).isTrue();
        assertThat(contains("Hello World", "Nation")).isFalse();
    }
}

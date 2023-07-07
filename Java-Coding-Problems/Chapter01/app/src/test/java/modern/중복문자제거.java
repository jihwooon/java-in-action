package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열에서 중복 문자를 제거하는 프로그램을 작성하라
 *
 * ## 자료
 * 문자열
 * 중복 문자 제거
 *
 * ## 조건
 * 문자열 중에 중복된 문자가 있으면 이를 제거한다.
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열을 탐색을 한다.
 * 3. 탐색 된 문자열 중 같은 문자가 존재하면 반환하고 아니면 계속해서 새로운 문자에 추가한다.
 *
 * ## 반성
 * 처음에 문자열을 탐색을 해서 같은 값이면 제거하는 것을 생각했었다. 그렇지만 해답에서도 비슷하지만 indexOf를 사용해서 -1이면 추가하고 아니면 반환하는 걸로 했다.
 * 처음에 이 말이 무슨 말인지 몰랐다. 다시 생각해보니 현재 result는 ""이다. indexOf는 검색 했을 때 일치 하지 않을 경우 -1를 반환한다.
 * 라는 의미였다.
 */

public class 중복문자제거 {

    private String solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(String.valueOf(c)) == -1) {
                result += String.valueOf(c);
            }
        }

        return result;
    }

    @Test
    public void result() {
        assertThat(solution("abcc")).isEqualTo("abc");
    }

}

package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열에서 모든 여백을 제거하는 프로그램을 작성하라
 *
 * ## 자료
 * 문자열
 * 여백
 *
 * ## 조건
 * 문자열 중 여백이 존재하면 제거하라
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. String 문법 중 replaceAll을 사용합니다.
 * 3. \s,\t,\n 등 정규 표현식을 사용해서 공백을 제거한다.
 * 4. 결과를 반환한다.
 *
 * ## 반성
 * 정규표현식을 알아야만 이 문제를 쉽게 풀 수 있다. 그래서 정규표현식 공부를 해야겠다.
 */

public class 문자열여백제거 {

    private String solution(String str) {
        return str.replaceAll("\\s", "");
    }

    @Test
    public void result() {
        assertThat(solution("abcd efg")).isEqualTo("abcdefg");
    }
}

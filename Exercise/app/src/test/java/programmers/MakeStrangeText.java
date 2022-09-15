package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution
 * ## 자료
 * - 짝수번째 알파벳은 대문자
 * - 홀수번째 알파벳은 소문자
 * - 글자의 홀수 짝수가 아닌 알파벳순의 홀수 짝수 이다.
 *
 * ## 조건
 * - 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * - 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 *
 * ## 계획
 * - 알파벳으로 짝수인 경우 대문자로 변환한다.
 * - key값을
 *
 * ## 반성
 * -
 * -
 *
 */

public class MakeStrangeText {

    public String solution(String s) {
        String answer = "";


        return answer;
    }

    @Test
    void result() {
        assertThat(solution("try hello world")).isEqualTo("try hello world");
    }
}

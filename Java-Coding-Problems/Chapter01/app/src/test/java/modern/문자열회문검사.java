package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열이 회문인지 알아내는 프로그램을 작성하라
 *
 * ## 자료
 * 문자열
 * 회문
 *  >> level = 거꾸로 읽어도 제대로 읽기는 문자
 * ## 조건
 * 주어진 문자열이 회문인지 아닌지 확인하는 것
 *
 * ## 계획
 * 1.주어진 문자의 맨 앞자리와 뒤자리가 돌일하지 않으면 false를 반환한다.
 * 2.그렇지 않으면 true 반환한다.
 *
 * ## 반성
 * 머릿속으로는 이 문제가 무엇을 말하는지 알았다. 그렇지만 코드로 구현하기는 아직 좀 멀었다. 한 가지 알아낸 사실은 로직을 글로 표현 할 수 없으면 코드로 표현 할 수 없다.
 * 반대로 코드를 보고 로직을 표현 할 수 있어야 한다.
 */
public class 문자열회문검사 {

    private boolean solution(String str) {
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void result() {
        assertThat(solution("level")).isEqualTo(true);
        assertThat(solution("levele")).isEqualTo(false);
        assertThat(solution("abcba")).isEqualTo(true);
    }


    private boolean solution1(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left > right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }
        return true;
    }

    @Test
    public void result1() {
        assertThat(solution1("level")).isEqualTo(true);
    }
}

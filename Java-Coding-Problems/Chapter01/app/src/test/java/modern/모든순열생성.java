package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열의 모든 순열을 생성하는 프로그램을 작성하라
 *
 * ## 자료
 * 순열
 *  >> 순차적으로 뽑아서 줄을 세우는 걸 순열이라고 한다.
 *  >> nPr = n(n - 1)(n - 2)(n - 3)(n - 4) ...(n - r + 1)
 *
 * ## 조건
 * 문자열을 순열로 바꿔서 연산한다.
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2.
 *
 * ## 반성
 *
 */
public class 모든순열생성 {

    public static String permuteAndPrint(String str) {
        return solution("", str);
    }

    private static String solution(String prefix, String str) {
        String result = "";
        String answer = "";
        int n = str.length();
        if (n == 0) {
            System.out.println("prefix = " + prefix);
            return prefix;
        } else {
            for (int i = 0; i < n; i++) {
                answer = prefix + str.charAt(i);
                result = str.substring(i + 1, n) + str.substring(0, i);
            }
        }

        return solution(answer, result);
    }

    @Test
    @DisplayName("문자열을 입력 받으면 재귀로 문자열을 뒤집는다")
    public void result() {
        assertThat(permuteAndPrint("ABC")).isEqualTo("CBA");
    }
}

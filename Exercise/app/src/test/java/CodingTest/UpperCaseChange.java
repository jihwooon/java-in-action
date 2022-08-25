package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>
 * 대소문자 변환 <br>
 * <p>
 * 입력 : <br>
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.<br>
 * 문자열은 영어 알파벳으로 구성되어 있습니다. <br>
 * <p>
 * 출력 : <br>
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.<br>
 * </p>
 */

public class UpperCaseChange {

    public String solution(String str) {
        String answer = "";
        // char Array를 만든다.
        char[] chars = str.toCharArray();

//        for (int i = 0; i < chars.length; i++) {
//            char x = chars[i];
//            if (x >= 97 && x <= 122) {
//                answer += (char) (x - 32);
//            } else {
//                answer += (char) (x + 32);
//            }
//        }

        for (char x : chars) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }


    @Test
    void result() {
        assertThat(solution("StuDY")).isEqualTo("sTUdy");
    }
}

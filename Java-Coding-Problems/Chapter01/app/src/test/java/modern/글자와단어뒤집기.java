package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 각 단어의 글자를 뒤집는 프로그램과 각 단어의 글자와 각 단어를 뒤집는 프로그램을 작성하라
 * ## 자료
 * 각 단어의 글자를 뒤집기
 *
 * ## 조건
 * 문자열을 뒤집어서 출력하기
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. StringBuilder를 호출한다.
 * 3. StringBuilder에 append에 문자열을 넣는다.
 * 4. stringBuilder에 reverse를 사용해서 문자열을 뒤집는다.
 *
 * ## 반성
 * 문자열을 뒤집을 때 StringBuilder를 사용해서 뒤집는것은 알고 있었다.
 * 근데 해답지에서는 for문을 이용해서 뒤에서 부터 앞으로 charAt(i)을 사용하는 것을 떠올리지 못 했다.
 * 그렇지만 String 기능 중 +=이 StringBulder에 append 기능을 가지고 있다는 것을 알고 있다는 것을 알고 있어서 for문으로도 풀 수 있다는 것을 알게되었다.
 */

public class 글자와단어뒤집기 {

    // 내 풀이
    private String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);

        return stringBuilder.reverse().toString();
    }

    @Test
    public void result() {
        assertThat(solution("abc")).isEqualTo("cba");
        assertThat(solution("abbbbc")).isEqualTo("cbbbba");
    }

    // StringBuilder 사용하지 않고 뒤집기
    private String solution3(String str) {
        String result = new String();

        for (int i = str.length() - 1; i >= 0; i--) {
            char reverseWord = str.charAt(i);
            result += reverseWord;

        }

        return result;
    }

    @Test
    public void result2() {
        assertThat(solution3("뒤집기")).isEqualTo("기집뒤");
    }

    // 해답 풀이
    private static final String WHITESPACE = " ";

    private String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    @Test
    public void result3() {
        assertThat(reverseWords("안녕하세요")).isEqualTo("요세하녕안 ");
    }

}

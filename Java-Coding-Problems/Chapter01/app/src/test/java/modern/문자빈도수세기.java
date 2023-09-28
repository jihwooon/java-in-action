package modern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열에서 특정 문자의 빈도수를 세는 프로그램을 작성하라
 * ## 자료
 * - 문자열
 * - 특정 문자의 빈도수
 * ## 조건
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 특정 문자가 입력 받는 문자에 몇 개 포함 되어 있는지 확인한다.
 * 3. 확인 된 문자의 갯수를 반환한다.
 *
 * ## 반성
 *
 */

public class 문자빈도수세기 {

    // 내 풀이
    private int solution(String str, char n) {
        int result = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (n == charArray[i]) {
                result++;
            }
        }
        return result;
    }

    @Test
    public void result() {
        assertThat(solution("abcddd", 'd')).isEqualTo(3);
        assertThat(solution("abcddd", 'a')).isEqualTo(1);
        assertThat(solution("abcdddeeee", 'e')).isEqualTo(4);
    }

    // 해답 풀이
    private int countOccurrencesOfACertainCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void result2() {
        assertThat(countOccurrencesOfACertainCharacter("abcddd", 'd')).isEqualTo(3);
    }

    // 자바 함수형 스타일
    private long countOccurrencesOfACertainCharacterFunction(String str, char ch) {
        return str.chars()
            .filter(c -> c == ch)
            .count();
    }

    @Test
    public void result3() {
        assertThat(countOccurrencesOfACertainCharacterFunction("abcddd", 'd')).isEqualTo(3);
    }
}

package modern;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * - 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라
 *
 * ## 자료
 * - 문자열
 * - 문자 개수 세기
 * ## 조건
 * - 문자가 주어졌을 때 문자 개수 세기
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자를 배열로 변경한다.
 * 3. 배열의 길이를 센다.
 * 4. 길이의 값을 리턴한다.
 * ## 반성
 * - 여기서 말한 문자 개수는 내가 생각한 문자 개수가 아니였다. 정답지에서는 HashMap으로 구현 했는데 이렇게 푸는 걸 알게되었다.
 * 풀이를 다시 공부해서 다른 곳에 접목 시켜야겠다.
 *
 */

public class 문자개수세기 {

    // 내 풀이
    private int solution(String str) {
        return str.length();
    }

    @Test
    public void result() {
        assertThat(solution("Hello World")).isEqualTo(11);
    }

    // 해답 풀이
    private Map<Character, Integer> countDuplicateCharacters(String str) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (char ch: str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    @Test
    public void result2() {
        Map<Character, Integer> characterIntegerMap = countDuplicateCharacters("Hello World");
        characterIntegerMap.forEach((k, v) ->
            System.out.print(k + "=" + v + ", ")
        );

        assertThat(countDuplicateCharacters("Hello World")).isEqualTo(characterIntegerMap);

    }

    private Map<Character, Long> solution3(String str) {
        Map<Character, Long> result = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

    @Test
    public void result3() {
        Map<Character, Long> characterIntegerMap = solution3("Hello World");
        characterIntegerMap.forEach((k, v) ->
            System.out.print(k + "=" + v + ", ")
        );

        assertThat(solution3("Hello World")).isEqualTo(characterIntegerMap);
    }

}

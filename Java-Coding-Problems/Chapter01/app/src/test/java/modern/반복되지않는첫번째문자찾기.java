package modern;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열에서 반복되지 않는 첫 번째 문자를 반환하는 프로그램을 작성하라
 *
 * ## 자료
 * 문자열
 * 첫 번째 문자
 * ## 조건
 *  반복 되지 않는 첫번째 문자
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 만약 글자가 반복되지 않은 문자열이면 첫번째를 반환한다.
 * 3. 문자열이 반복되는 문자가 존재하면 반복되지 않은 문자를 찾아서 그 문자를 반환한다.
 * 4. 결과를 반환한다.
 *
 * ## 반성
 * LinkedHashMap에 대해서 처음 알게 되었다. Stream을 이용해서 푸는 방법도 있지만 지금은 LinkedHashMap을 이용해서 푸는 방법을 좀 더 공부를 해봐야겠다.
 */

public class 반복되지않는첫번째문자찾기 {

    private String solution(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }

        return String.valueOf(Character.MIN_VALUE);
    }

    @Test
    public void result() {
        assertThat(solution("abc")).isEqualTo("a");
        assertThat(solution("aabc")).isEqualTo("b");
        assertThat(solution("aaaaaaccccccdddddbc")).isEqualTo("b");
    }

}

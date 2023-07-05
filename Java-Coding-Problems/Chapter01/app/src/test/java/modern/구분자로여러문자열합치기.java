package modern;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 문자열을 주어진 구분자로 합치는 프로그램을 작성하라
 * ## 자료
 * - 문자열
 * - 구분자(delimiter)
 * >> 문자열을 여러 개의 부분으로 나누는 데 사용되는 기호 공백, 쉼표, 탭, 줄 바꿈 등과 같다.
 * ## 조건
 * >> 문자열을 구분자로 합치기
 *
 * ## 계획
 * 1. 문자열을 입력받는다.
 * 2. 문자를 구분하는 구분자를 분리한다.
 * 3. 구분자로 분리 된 문자를 합친다.
 *
 * ## 반성
 * 나는 구분자로 되어 있는 문자열을 제거해서 합치는 작업을 했다. 처음에 구분자가 뭔지를 몰랐는데 AI에게 물어보니까 바로 답변이 와서 이제는 구분자가 뭔지를 알게되었다.
 * 문자열 +=를 합치는 것이 StringBuilder보다 성능이 느리다고 한다. 그래서 StringBuilder를 사용하라고 책에서 권장을 한다.
 *
 */

public class 구분자로여러문자열합치기 {

    private String solution(String str) {
        String[] split = str.split(",");
        String result = "";

        for (String x : split) {
            result += x;
        }
        return result;
    }

    @Test
    @DisplayName("입력 받은 문자열을 구분자로 나눠서 문자열을 합친다")
    public void result() {
        assertThat(solution("How,Are,You")).isEqualTo("HowAreYou");
    }

    private String joinByDelimiter(String delimiter, String... args) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }

        result.append(args[i]);
        return result.toString();
    }

    @Test
    @DisplayName("입력 받은 문자열을 StringBuilder로 문자열을 합친다")
    public void result1() {
        assertThat(joinByDelimiter(",", new String[]{"How", "Are", "You"})).isEqualTo(
            "How,Are,You");
    }

    private String joinByDelimiterOfJoiner(String delimiter, String... args) {
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }

    @Test
    @DisplayName("입력 받은 문자열을 StringJoiner로 문자열을 합친다")
    public void result3() {
        assertThat(joinByDelimiterOfJoiner(",", new String[]{"How", "Are", "You"})).isEqualTo(
            "How,Are,You");
    }


    private String joinByDelimiterOfStream(String delimiter, String... args) {
        return Arrays.stream(args, 0, args.length)
            .collect(Collectors.joining(String.valueOf(delimiter)));
    }

    @Test
    @DisplayName("입력 받은 문자열을 Stream 함수로 문자열을 합친다")
    public void result4() {
        assertThat(joinByDelimiterOfStream(",", new String[]{"How", "Are", "You"})).isEqualTo(
            "How,Are,You");
    }

}

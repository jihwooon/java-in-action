package CodingTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. <br>
 * 문장속의 각 단어는 공백으로 구분됩니다. <br>
 * <p>
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문자은 영어 알파벳으로만 구성되어 있습니다. <br>
 * 출력 : 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 */

public class IndexOfString {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        System.out.println(m);
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));

        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution("it is time to study")).isEqualTo("study");
    }
}



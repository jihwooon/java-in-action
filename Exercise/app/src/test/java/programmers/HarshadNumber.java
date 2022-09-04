package programmers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 하샤드 수
 * 미지의 것: 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수
 * <p>
 * ## 자료
 * - 하샤드 수
 * >> x의 자릿수의 합으로 x가 나누어져야 합니다
 * >> 10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
 * -
 * <p>
 * ## 조건
 * - 모든 자릿수의 합이 합으로 나온 수에 나누기가 되면 true
 * - 모든 자릿수의 합이 합으로 나온 수에 나누기가 안 되면 false
 * <p>
 * ## 계획
 * - 자연수를 입력 받는다.
 * - 자연수의 자릿수를 나눈다.
 * - 10진법으로 int 자리수를 나눈다.
 * - 결과값과 자연수를 나누어 떨어지면 true 아니면 false로 리턴한다.
 * <p>
 * ## 반성
 * - 정수를 배열로 해서 자릿수를 나누고 각 자리마다 더하기를 할려고 했다.
 * - 다른 사람의 풀이는 보니까 String 타입으로 변환해서 푸는 방법도 있다.
 */

public class HarshadNumber {
    public boolean solution(int x) {
        int result = 0;
        String[] str = String.valueOf(x).split("");

        for(String s : str) {
            result += Integer.parseInt(s);
        }

        if(x % result == 0) {
            return true;
        }

        return false;
    }

    @Test
    void result() {
        assertThat(solution(10)).isTrue();
        assertThat(solution(12)).isTrue();
        assertThat(solution(11)).isFalse();
        assertThat(solution(13)).isFalse();
    }
}

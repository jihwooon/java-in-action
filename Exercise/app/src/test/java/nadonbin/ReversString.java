package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/** 문자열 뒤집기
 * ## 미지의 것
 * 문자열 S가 주어졌을 때, 행동의 최소 횟수를 출력한다.
 *
 * ## 자료
 * - 0과 1로만 이뤄어져 있는 문자열
 * - 1을 0으로 0을 1로 뒤집는다.
 * - 숫자를 뒤집어 모든 같은 수가 나오게 한다.
 *
 * ## 조건
 * - 0,1 만 나온다. 2,3 문자열은 받지 않는다.
 * -
 *
 * ## 계획
 * - 문자열을 받는다.
 * -
 *
 * ## 반성
 * -
 * -
 *
 */

public class ReversString {

    public int solution(String str) {
        int count0 = 0; // 0의 값 초기화
        int count1 = 0; // 1의 값 초기화

        String[] data = str.split("");

        if(data[0].equals("1")) { // 배열의 첫번째 자리가 "1"이면 count 1이 증가 아니면 0 증가
            count1 += 1;
        } else {
            count0 += 1;
        }

        for(int i = 0; i < data.length - 1; i++) {
            if(data[i] != data[i + 1]) {
                if(data[i + 1] == "1") {
                    count0 += 1;
                } else {
                    count1 += 1;
                }
            }
        }

        return Math.min(count0, count1);
    }

    @Test
    void result() {
//        assertThat(solution("1")).isEqualTo(1);
        assertThat(solution("0001100")).isEqualTo(1);
    }
}

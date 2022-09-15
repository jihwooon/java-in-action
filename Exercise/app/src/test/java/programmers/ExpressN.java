package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return
 * <p>
 * ## 자료
 * - N은 사용하는 횟수
 * - number는 나눌 숫자
 * - number가 홀수/ 짝수 인 경우를 생각해보자.
 * <p>
 * ## 조건
 * - N은 10 미만의 수
 * - 최솟값이 8보다 크면 -1을 return 합니다.
 * - 수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
 * <p>
 * ## 계획
 * - N의 값과 number 값을 받는다.
 * - N의 최소값이 8 이상이면 -1을 리턴한다.
 * - number 수가 홀수 일 때 와 짝수 일 때랑 구분한다.
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class ExpressN {

    public int solution(int N, int number) {
        int answer = 0;

        if (N < 0 || answer > 8) {
            return -1;
        }

        // number가 짝수 인 경우
        if (number % 2 == 0) {
            answer = Math.min(answer, ((N * 10) + N) / N);

        }

        // number가 홀수 인 경우
        if (number % 2 != 0) {
            answer = Math.min(answer, (N * number - 1) / N);
        }

        return answer;
    }


    @Test
    void result() {
//        assertThat(solution(1, 11)).isEqualTo(2);
//        assertThat(solution(2, 11)).isEqualTo(3);
        assertThat(solution(3, 11)).isEqualTo(3);
//        assertThat(solution(4, 11)).isEqualTo(3);
//        assertThat(solution(5, 11)).isEqualTo(3);
//        assertThat(solution(6, 11)).isEqualTo(3);
//        assertThat(solution(7, 11)).isEqualTo(3);
//        assertThat(solution(8, 11)).isEqualTo(3);
//        assertThat(solution(9, 11)).isEqualTo(3);

//        assertThat(solution(5, 12)).isEqualTo(-1);
    }
}

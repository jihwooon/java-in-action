package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 1로 만들기
 * 미지의 것: 연산 4개를 적절히 사용해서 1을 만들어 연산을 사용하는 횟수의 최소값을 구하라.
 * <p>
 * ## 자료
 * - 연산의 4가지
 * 1. X가 5로 나누어떨어지면, 5로 나눈다.
 * 2. X가 3으로 나누어떨어지면, 3으로 나눈다.
 * 3. X가 2로 나누어떨어지면, 2로 나눈다.
 * 4. X에서 1을 뺀다.
 * - 최소값
 * <p>
 * ## 조건
 * - 연산 4개로 적절히 사용해서 1이 나오게 한다.
 * - 그 외의 조건은 없다.
 * <p>
 * ## 계획
 * - 정수를 입력 받는다.
 * - 정수가 2, 3, 5로 나눌 수 없으면 -1을 한다.
 * - 정수가 5로 나누어떨어지면 5로 나눈다.
 * - 정수가 3로 나누어떨어지면 3로 나눈다.
 * - 정수가 2로 나누어떨어지면 2로 나눈다.
 * - 몫이 1이 나올 때까지 반복한다.
 * - 반복한 수의 횟수의 대한 최소값을 반환한다.
 * <p>
 * ## 반성
 * -
 */
public class MakeNumberOfOne {

    public int solution(int n) {


        if(n != 1) {

            if (n <= 1) {
                return 1;
            }

            if (n % 5 == 0) {
                return solution(n / 5);
            }

            if (n % 3 == 0) {
                return solution(n / 3);
            }

            if (n % 2 == 0) {
                return solution(n / 2);
            }

            return solution(n - 1);
        }

        return n;
    }


    @Test
    void result() {
        assertThat(solution(26)).isEqualTo(1);
//        assertThat(solution(1)).isEqualTo(1);
//        assertThat(solution(2)).isEqualTo(1);
//        assertThat(solution(3)).isEqualTo(1);
    }
}

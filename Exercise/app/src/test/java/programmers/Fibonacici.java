package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요
 * ## 자료
 * - 피보나치 수
 * >> F(0) = 0, F(1) = 1, 1이상의 n의 대하여 F(n) = F(n-1)+ F(n-2)가 적용이 된다.
 * -
 * <p>
 * ## 조건
 * - f(0) 이면 0이 나와야 한다.
 * - f(1) 이면 1이 나와야 한다.
 * - f(n)이 2이상이면 100,000 이하의 자연수 입니다.
 * - n번째 피보나치 수를 1234567나눈 나머지를 리턴 한다.
 * <p>
 * ## 계획
 * - 0을 입력 할 때 0이 출력 되야 한다.
 * - 1을 입력 할 때 1이 출력 되야 한다.
 * - 2 이상부터 F(n) = F(n-1) + F(n-2)이 적용 된다.
 * <p>
 * ## 반성
 * - 피보나치 수열을 이미 여러번 풀어 봤기 때문에 머릿속에서 이미 풀이를 알고 있다.
 * - 메모이제이션으로 성능 최적화로 다시 풀어 봐야 겠다.
 * - 재귀 호출로 하니 테스트가 통과가 안된다. for문으로 바꿔서 풀어 봐야 겟다.
 * - int 범위를 벗어나서 통과 안될 때는 한번 더 나눠서 계산을 해줘야 한다.
 */
public class Fibonacici {
    public int fibonacici_loop(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }

        return (memo[n - 1] + memo[n - 2]) % 1234567;
    }

    public int solution(int n) {

        return solution(n, new int[n + 1]) % 1234567;
    }

    public int solution(int n, int[] memo) {

        if (n == 0 || n == 1) return n;

        if (memo[n] == 0) {
            memo[n] = (solution(n - 1, memo) + solution(n - 2, memo)) % 1234567;

        }

        return memo[n];
    }

    @Test
    void result_1() {
        assertThat(fibonacici_loop(0)).isEqualTo(0);
        assertThat(fibonacici_loop(1)).isEqualTo(1);
        assertThat(fibonacici_loop(3)).isEqualTo(2);
        assertThat(fibonacici_loop(5)).isEqualTo(5);
    }
}

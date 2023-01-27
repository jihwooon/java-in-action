package nadonbin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 바닥에 채우는 모든 경우의 수를 구하라.
 * ## 자료
 * - 가로의 길이 N
 * - 세로의 길이 2
 * - 2 x 3 크기의 바닥의 경우의 수는 5가지
 * - 덮개
 * >> 1 x 2, 2 x 1, 2 x 2
 * ## 조건
 * - 방법의 수의 796,796으로 나눈 나머지를 출력한다.
 * -
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * - 재귀로 바꿔 풀어 볼 수 있을 것 같다.
 * - 메모이제이션을 사용해서 풀어 볼 수 있을 것 같다.
 */

public class WorkFlooring {

    // 상향식 동적 프로그래밍
    public int floor_dp(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i < n + 1; i++) {
            dp[i] = (dp[i - 1]) + 2 * (dp[i - 2]) % 796796;
        }

        return dp[n];
    }

    // 재귀
    public int floor_recursion(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 3;
        }

        return floor_recursion(n - 1) + 2 * floor_recursion(n - 2) % 796796;
    }

    //하향식 동적 프로그래밍(메모이제이션)
    public int floor_memo(int n) {
        return floor_memo(n, new int[n + 1]);
    }

    public int floor_memo(int i, int[] memo) {
        if (i == 1) {
            return 1;
        }

        if (i == 2) {
            return 3;
        }

        if (memo[i] == 0) {
            memo[i] = floor_memo(i - 1, memo) + 2 * floor_memo(i - 2, memo) % 796796;
        }

        return memo[i];
    }

    @Test
    void floor_dpTest() {
        assertThat(floor_dp(3)).isEqualTo(5);
    }

    @Test
    void floor_recursionTest() {
        assertThat(floor_recursion(3)).isEqualTo(5);
    }

    @Test
    void floor_memoTest() {
        assertThat(floor_memo(3)).isEqualTo(5);
    }
}


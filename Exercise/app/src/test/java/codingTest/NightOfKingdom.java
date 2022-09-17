package codingTest;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제에 대한 이해
 * * 우리가 풀어야 할 문제는 무엇인가?
 * >> 나이트가 위치가 주어졌을 때 나이트가 이동 할 수 있는 경우의 수
 * * 주어진 자료는 무엇인가?
 * >> 나이트는 L자 형태로만 이동할 수 있다.
 * >> 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
 * >> 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
 * <p>
 * * 조건은 무엇인가?
 * >> 구석 위치에 해당하며 나이트는 정원 밖으로 나갈 수 없다.
 * <p>
 * 계획

 * 현재 위치에서 경우의 수만큼 이동 할 수 있는지 확인해본다.
 */
public class NightOfKingdom {

    public int solution(String str) {
        int x = str.substring(0, 1).charAt(0) - 'a' + 1;
        int y = str.substring(1).charAt(0) - '0';

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int next_row = x + dx[i];
            int next_pow = y + dy[i];

            if (next_row >= 1 && next_row <= 8 && next_pow >= 1 && next_pow <= 8) {
                result += 1;
                System.out.println("result = " + result);
            }
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution("a1")).isEqualTo(2);
        assertThat(solution("b3")).isEqualTo(6);
        assertThat(solution("e3")).isEqualTo(8);
        assertThat(solution("f4")).isEqualTo(8);
        assertThat(solution("c2")).isEqualTo(6);
        assertThat(solution("g3")).isEqualTo(6);
        assertThat(solution("c8")).isEqualTo(4);

    }
}

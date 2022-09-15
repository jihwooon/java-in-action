package backJun;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * N개의 공의 무게 K 가 각각 주어졌을 때, 두 사람이 볼링공을 고르는 경우의 수를 구하라.
 * ## 자료
 * - 볼링공의 개수 N
 * - 공의 최대 무게 M
 * - 각 볼링공의 무게 K
 * <p>
 * ## 조건
 * - 입력 받는 값들이 자연수 형태로 주어진다.
 * -
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class BowlingBall {

    public int solution(int m, int... y) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = list.size();

        for (int s : y) {
            list.add(s);
        }

        int result = 0;

        for (int i = 0; i < m + 1; i++) {
            size -= list.get(i);
            result += list.get(i) * size;
        }
        return result < 0 ? 0 : result;
    }

    @Test
    void result() {
        assertThat(solution(3, 1, 3, 2, 3, 2)).isEqualTo(0);
    }

}

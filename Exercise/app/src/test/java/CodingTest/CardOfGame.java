package CodingTest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.spliterator;

/**
 * ## 이해
 * <p>
 * 미지의 것: 카드들이 N X M 형태로 놓여 있을 때, 게임이 룰에 맞게 카드를 뽑는 프로그램을 만드시오.
 * 자료
 * - N은 행의 갯수
 * - M은 열의 갯수
 * - 각 행에 가장 낮은 숫자가 낮은 카드를 뽑고 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있다.
 * <p>
 * 조건
 * - 10,001 이하의 수
 * <p>
 * ## 계획
 * - 각 행의 최소 값을 찾아낸다
 * - 비교할 최대값을 미리 설정한다.
 * - 행 마다 최소값을 구한 뒤 그 중 가장 큰 수를 찾는다.
 * - 가장 큰 수를 반환한다.
 * ## 실행
 * <p>
 * ## 반성
 * - 이중 배열로 숫자를 뽑아서 비교 할려고 하니까 많은 어려움이 있었다.
 * - 코드의 동작 방식을 이해를 잘 못해서 여려움이 있었다.
 * -
 */
public class CardOfGame {

    public int solution(int[][] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        // 각 행마다 작은 수를 반환한다.
        for (int i = 0; i < arr.length; i++) {
            //최대값
            int minValue = Integer.MAX_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                minValue = Math.min(minValue, arr[i][j]);
            }
            result = Math.max(result, minValue);
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(new int[][]{
                {3, 2, 2},
                {4, 1, 4},
                {2, 1, 2}
        })).isEqualTo(2);

        assertThat(solution(new int[][]{
                {7, 3, 1, 8},
                {3, 3, 3, 4},
        })).isEqualTo(3);
    }
}

package codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 개미 전사
 * 미지의 것: 식량 창고의 N개에 대한 정보가 주어졌을 때, 얻을 수 있는 최대값 구하기
 * <p>
 * ## 자료
 * - 식량 창고는 배열을 나타낸다.
 * >> {1, 3, 1, 5}
 * - 두번 째 식량창고와 네번째 식량창고 선택
 * >> 두 배열의 원소의 합 = 최대값
 * <p>
 * ## 조건
 * - 식량창고의 개수는 (3 <= 100)
 * - 식량의 개수는 (0 <= 1,000)
 * - 최소한 한 칸 이상 떨어진 식량 창고를 약탈 해야 한다.

 * ## 계획
 * - 배열의 수를 받는다.
 * - 첫번째 선택한 수를 배열의 최대값을 선택한다.
 * - (i -2) 번째 부터 선택 할 수 있다.
 * - 원소의 합을 반환한다.

 * ## 반성
 * -
 */

public class AntWarrior {
    public int solution(int[] arr) {

        int answer = 0;


        return answer;
    }

    @Test
    void result() {

        assertThat(solution(new int[]{1, 3, 1, 5})).isEqualTo(8);
//        assertThat(solution(new Integer[]{2, 5, 1, 4})).isEqualTo(9);
//        assertThat(solution(new Integer[]{2, 5, 1, 4, 20, 19, 8})).isEqualTo(5 + 20 + 8);
//        assertThat(solution(new Integer[]{1, 3, 1, 5})).isEqualTo(8);
    }

}

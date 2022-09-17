package codingTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 떡볶이 떡 만들기
 * <p>
 * 미지의 것: 길이가 M일 때 M만큼 떡을 얻기 위해서 떡을 설정할 수 있은 H(높이)의 최댁값을 구하라.
 * 자료
 * - 절단기 높이(H)
 * -
 * -
 * 조건
 * - 절단기의 높이가 떡의 길이보다 낮으면 반환
 * - 절단기의 높이가 떡의 길이보다 같거나 높으면 0
 * ## 계획
 * - 배열로 입력을 받는다.
 * - 타겟을 찾는다.
 * >>
 * - 타겟보다 작으면 0으로 반환한다.
 * - 타켓보다 큰 수 이면 - 한다.
 * - 마이너스 한 값을 모두 더해서 반환한다.
 * ## 실행
 * <p>
 * <p>
 * ## 반성
 * - 이진탐색을 알았다면 이해 할 수 있었는데 몰라서 어려웠다.
 * - 아직 정렬을 하는데 ArrayList와 기본형 배열의 차이가 분명하지 않아서 헤맸다.
 */

public class MakeWithRiceCake {

    private int solution(int[] arr, int n) {
        int start = 0;
        Arrays.sort(arr);

        int end = arr[arr.length - 1];

        int result = 0;

        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;
            for (int x : arr) {
                if (x >= mid) {
                    total += x - mid;
                    System.out.println("total = " + total);
                }
            }

            if(total < n) {
                end = mid -1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{19, 15, 10, 17}, 6)).isEqualTo(15);
        assertThat(solution(new int[]{19, 15, 10, 17}, 1)).isEqualTo(18);
        assertThat(solution(new int[]{19, 15, 10, 17}, 3)).isEqualTo(16);
        assertThat(solution(new int[]{19, 15, 10, 17}, 7)).isEqualTo(14);
        assertThat(solution(new int[]{19, 15, 10, 17}, 15)).isEqualTo(12);
        assertThat(solution(new int[]{19, 15, 10, 17}, 12)).isEqualTo(13);
        assertThat(solution(new int[]{19, 15, 10, 17}, 18)).isEqualTo(11);
        assertThat(solution(new int[]{19, 15, 10, 17}, 16)).isEqualTo(11);
    }

}

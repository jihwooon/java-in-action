package programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 각 큐의 원소 합을 같게 만들기 위해 필요한 작업의 최소 횟수를 return 하도록 solution 함수를 완성하라.
 * ## 자료
 * - 큐는 선입선출
 * >> 먼저 들어온 순서가 나가는 순서도 먼저 나감
 * - 두 원소의 합이 같아야 한다.
 * -
 * <p>
 * ## 조건
 * - 두 원소의 합이 서로 비교 했을 때 값이 같아야 한다.
 * - 어떤 원소의 합을 같게 만들 수 없으면 -1을 반환한다.
 * - 언어에 따라 합 계산 과정 중 산술 오버플로우 발생 가능성이 있으므로 long type 고려가 필요합니다.
 * <p>
 * ## 계획
 * - 두 큐의 모든 원소의 합을 구한다.
 * - 각 큐의 합을 총합/2 로 만들어야 한다.
 * - queue1 또는 queue2 합이 총합 / 2 될까지 선입 선출을 한다.
 * - 총합/ 2가 되면 탈출한다.
 * - 스왑이 일어난 수를 반환한다.
 * <p>
 * ## 반성
 * -
 * -
 */

public class MakeQueue {

    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new ArrayDeque<>();
        Queue<Integer> que2 = new ArrayDeque<>();

        long sum1 = 0;
        long sum2 = 0;

        // 각각 두 원소의 합을 구한다.
        for (long x : queue1) {
            sum1 += x;
            que1.offer((int) x);
        }

        for (long s : queue2) {
            sum2 += s;
            que2.offer((int) s);
        }

        int count = 0; //최소 횟수 구하기

        while (sum1 != sum2) {
            count++; //횟수 증가

            if (sum1 > sum2) { // 첫번째 큐의 합이 두번재 큐의 합보다 크다면
                Integer value = que1.poll();// 첫번째 큐의 맨 앞의 원소를 뺀다.

                sum1 -= value;
                sum2 += value;
                que2.offer(value);
            }

            if (sum2 > sum1) {
                Integer value = que2.poll();// 두번째 큐의 맨 앞의 원소를 뺀다.
                sum2 -= value;
                sum1 += value;
                que1.offer(value);
            }

            if (count > (queue1.length + queue2.length) * 2) return -1;
        }


        return count;
    }

    @Test
    void result() {

        assertThat(solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1})).isEqualTo(2);
//        assertThat(solution(new int[]{3, 1}, new int[]{1, 5})).isEqualTo(-1);
    }
}

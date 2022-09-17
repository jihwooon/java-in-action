package codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 춘향이는 편의점 카운터에서 일한다.
 * 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다.
 * 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 동전의 개수가 최소가 되도록 거슬러 주어야 한다.
 * 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
 * <p>
 * 예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를,
 * 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
 * <p>
 * 첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다. ex) 13
 * <p>
 * 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다. ex)5
 * <p>
 * 문제 : 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다
 * 자료와 정보 : 2원과 5원짜리, 거스름돈이 15원이면 5원 3개로 주어지면
 * 조건 : 거스름돈 액수는 n(1 ≤ n ≤ 100,000)이 주어진다.
 * 계획 :
 * 1.
 * 2.
 * 3.
 * 4. 최소 갯수를 반환한다.
 */

public class ChangeMoney {

    public int solution(int n) {
        int count = 0;

        if (n < 0) {
            return -1;
        }

        while (n > 0) {
            if (n % 5 == 0) {
                count = n / 5 + count;
                break;
            }

            n -= 2;
            count++;
        }

        return count;
    }

    @Test
    void result() {

        assertThat(solution(-1)).isEqualTo(-1); // 5 = 5 : 1
        assertThat(solution(0)).isEqualTo(0); // 5 = 5 : 1
        assertThat(solution(1)).isEqualTo(1); // 5 = 5 : 1
        assertThat(solution(5)).isEqualTo(1); // 5 = 5 : 1
        assertThat(solution(6)).isEqualTo(3); // 6 = 2 : 3
        assertThat(solution(15)).isEqualTo(3); // 15 = 5 : 3
        assertThat(solution(13)).isEqualTo(5); // 13 = 5 : 1, 2 : 4
        assertThat(solution(12)).isEqualTo(3); // 12 = 5 : 2, 2 : 1
        assertThat(solution(11)).isEqualTo(4); // 11 = 5 : 1, 2 : 3

    }
}

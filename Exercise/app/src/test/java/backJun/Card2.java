package backJun;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램
 * ## 자료
 * - 1번의 카드가 제일 위, N번 카드가 제일 아래인 상태로 순서대로 카드 놓여져 있다.
 * - 제일 위에 있는 카드는 버린다.
 * - 그 다음 순서의 카드는 맨 뒤로 옮긴다.
 * - 다음 순서인 카드를 버린다.
 * - 그 다음 순서인 카드를 맨 뒤로 옮긴다.
 * <p>
 * ## 조건
 * - 마지막에 나올 숫자가 나올 때까지 반복한다.
 * - 첫번째 자리는 버리고 두번째 뒤로 넘긴다.
 * - queue에 채워 넣는다.
 * -
 * <p>
 * ## 계획
 * - 1부터 N까지의 번호로 채워진 Queue를 만든다.
 * - 이 작업을 N번 만큼 반복한다.
 * - queue 크기가 1이 아니면 반복한다.
 * - 첫번째 자리는 poll(=삭제)를 버린다.
 * - 두번째는 마지막 자리로 보낸다.
 * - 그런 다음 결과를 출력한다.
 * <p>
 * ## 반성
 * -
 * -
 */

public class Card2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(bufferedReader.readLine());

        card(Number);

        System.out.println(card(Number));
    }

    private static int card(int n) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        return queue.poll();
    }

    @Test
    void result() {
        assertThat(card(6)).isEqualTo(4);
    }

}

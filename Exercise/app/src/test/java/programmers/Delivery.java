package programmers;

import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 마을의 개수 N, 각 마을을 연결하는 도로의 정보 road, 음식 배달이 가능한 시간 K가 매개변수로 주어질 때, 음식 주문을 받을 수 있는 마을의 개수를 return
 * ## 자료
 * - 마을의 개수는 N이다.
 * >> a,b,c 순서대로 a와 b는 두 마을의 번호, c는 걸리는 시간
 * - 마을을 연결하는 도로의 정보는 int[][]이다.
 * - 배달 가능한 시간은 K다.
 * -
 * ## 조건
 * - road의 배열은 3배열이다.
 * -
 * -
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class Delivery {

    public int solution(int N, int[][] road, int K) {
        int[][] graph = new int[N][N];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                    continue;
                }
                graph[i][j] = 50001;
            }
        }

        int answer = 0;


        for (int k = 0; k <= N; k++) {
            for (int a = 0; a <= N; a++) {
                for (int b = 0; b <= N; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][a]);
                }
            }
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    @Test
    void result() {

    }

}

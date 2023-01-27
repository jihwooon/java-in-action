package codingTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 음료수 얼려 먹기
 * ## 미지의 것: 얼음의 틀의 모양이 주어졌을 때 생성되는 총 아이스크림 개수를 구하는 프로그램
 * ## 자료
 * - 아이스크림 개수 구하라.
 * - 구멍이 뚤려 있는 부분 0
 * - 칸막이가 존재하는 부분 1
 * ## 조건
 * - 구멍이 뚫려 있는 부분은 0, 그렇지 않은 부분은 1
 * -
 * <p>
 * ## 계획
 * - 2차원 배열 리스트를 받는다.
 * - N, Y 공간은 만든다.
 * - 상하좌우를 살편 본 뒤 주변이 0이면 노드를 방문 시킨다.
 * - 더 이상 가지 못하면 지점의 수를 센다.
 * ## 실행
 * <p>
 * ## 반성
 * -
 */

public class ColdOfDrink {
    public static int N;
    public static int M;
    public static ArrayList<ArrayList<Integer>> graph;

    public static int solution() {
        int result = 0;
        System.out.println(graph);

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (dfs(i, j) == true) {
                    result += 1;
                }
            }
        }

        return result;
    }

    private static boolean dfs(int x, int y) {

        // 상하좌우 벗어나면 fasle
        if(x <= -1 && x >= N && y <= -1 && y >= M) {
            return false;
        }

        // graph == 0 인 경우
        if(graph.get(x).get(y) == 0) {

            return true;
        }

        return false;
    }


    @Test
    void result() {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<=2; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(0);
        graph.get(0).add(1);
        graph.get(0).add(0);
        graph.get(1).add(0);
        graph.get(1).add(1);
        graph.get(1).add(0);
        graph.get(2).add(1);
        graph.get(2).add(0);
        graph.get(2).add(1);

//        assertThat(solution(3, 3)).isEqualTo(3);
    }
}

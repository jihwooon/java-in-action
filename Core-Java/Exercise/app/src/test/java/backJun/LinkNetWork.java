package backJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * ## 미지의 것
 * 이제 각 컴퓨터를 연결하는데 필요한 비용이 주어졌을 때 모든 컴퓨터를 연결하는데 필요한 최소비용을 출력하라
 * ## 자료
 * - 모두가 자료를 공유하기 위해서는 모든 컴퓨터가 연결이 되어 있어야 한다
 * -
 * ## 조건
 * -
 * <p>
 * ## 계획
 * - 엣지를 오름 차순을 정렬한다.
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */
class Edge implements Comparable<Edge> {

    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class LinkNetWork {

    public static int v, e;
    public static int[] parent = new int[10001];
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result = 0;

    public static int findParent(int x) {
        if (x != parent[0]) {
            return parent[x] = findParent(parent[0]);
        }
        return x;
    }

    public static int unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) return parent[b] = a;
        return parent[a] = b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        v = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());

        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(cost, a, b));
        }

        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();

            if (findParent(a) != findParent(b)) {
                unionParent(a, b);
                result += cost;
            }
        }

        System.out.println(result);
    }
}

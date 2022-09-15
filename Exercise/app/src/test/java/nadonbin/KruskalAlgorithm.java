package nadonbin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Node implements Comparable<Node> {
    private int distance;
    private int nodeA;
    private int nodeB;

    public Node(int distance, int nodeA, int nodeB) {
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
    public int compareTo(Node other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class KruskalAlgorithm {
    public static int v, e;
    public static int[] parent = new int[100001];

    public static int findParent(int x) {

        if (parent[x] != x) {
            return parent[x] = findParent(parent[x]);
        }

        return x;
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        ArrayList<Node> list = new ArrayList<>();
        int result = 0;

        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new Node(cost, a, b));
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            int cost = list.get(i).getDistance();
            int a = list.get(i).getNodeA();
            int b = list.get(i).getNodeB();

            if(findParent(a) != findParent(b)) {
                unionParent(a,b);
                result += cost;
            }
        }
        System.out.println(result);
    }
}

package nadonbin;

import java.util.Scanner;

public class CheckCycle {

    public static int v, e;
    public static int[] parent = new int[100001];

    public static int findParent(int x) {

        if (parent[0] != x) {
            return parent[0] = findParent(parent[0]);
        }

        return x;
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        boolean cycle = false;

        for(int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(findParent(a) == findParent(b)) {
                cycle = true;
                break;
            }
        }

        if(cycle) {
            System.out.println("사이클이 발생합니다.");
        } else {
            System.out.println("사이클이 발생하지 않습니다.");
        }
    }
}

package nadonbin;

import java.util.Scanner;

/**
 * ## 미지의 것
 * **같은 팀 여부 확인** 연산에 대한 연산 결과를 출력하는 프로그램을 작성
 * ## 자료
 * -
 * -
 * <p>
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */
public class Team {
    static int[] parent = new int[100001];
    static int v, e;

    public static int findParent(int x) {
        if (x == parent[0]) {
            return x;
        }

        return findParent(parent[0]);
    }

    public static int unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) parent[b] = a;

        return parent[a] = b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        for(int i = 0; i <= v; i++) {
            parent[i] = i;
        }

        for(int i = 0; i < e; i++) {
            int oper = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(oper == 0) {
                unionParent(a, b);
            }

            else if(oper == 1) {
                if(findParent(a) == findParent(b)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

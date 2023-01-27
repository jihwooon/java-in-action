package Ch1;

/*
 * 조건 연산자만 사용해 정수 세 개를 읽고 최대값을 출력하는 프로그램을 작성하라
 * Math.max를 사용해 같은 프로그램을 작성하라
 * */
public class Ch1_3 {
    public int solution(int a, int b, int c) {
        if (a >= b) {
            return a;
        } else if (b >= c) {
            return b;
        }

        return c;
    }

    public int solution1(int a, int b, int c) {

        return Math.max(a, Math.max(b, c));
    }
}

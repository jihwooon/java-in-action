package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Example08Test {

    // 재귀함수
    public int solution(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + solution(n - 1); //10 + solution(9) + solution(8) ... solution(0)
    }

    //for문
    public int solution1(int n) {
        int sum = 0;

        for (int i = n; i >= 0; i--) {
            sum += i;
            System.out.println("i = " + i);
        }

        return sum;
    }

    public int solution2(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int solution3(int n) {
        int result = 0;

        if (n > 9) {
            System.out.println("end = " + n);
            return n;
        } else {
            result += n + solution3(n + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("solution3 : " + solution3(1));
    }

        @Test
    void result() {
        assertThat(solution(10)).isEqualTo(55);
        assertThat(solution1(10)).isEqualTo(30);
        assertThat(solution2(10)).isEqualTo(55);
        assertThat(solution3(0)).isEqualTo(55);
    }
}

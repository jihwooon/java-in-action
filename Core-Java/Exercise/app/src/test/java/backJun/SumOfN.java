package backJun;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 */

public class SumOfN {

    public static int solution1(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) - '0';
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int result = 0;

        for (int i = 0; i < N; i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
    }


//    @Test
//    void solution() {
//        assertThat(solution(1)).isEqualTo(1);
//        assertThat(solution(5, 4, 3, 2, 1)).isEqualTo(15);
//        assertThat(solution(7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)).isEqualTo(7);
//    }

    @Test
    void solution1() {
        assertThat(solution1("1")).isEqualTo(1);
        assertThat(solution1("54321")).isEqualTo(15);
    }
}

//
//    public static int solution(int... n) {
//        int result = 0;
//
//        for (int x : n) {
//            result += x;
//        }
//        return result;
//    }

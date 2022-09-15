package backJun;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 정수 X이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * ## 자료
 * - X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * - X가 2로 나누어 떨어지면, 2로 나눈다.
 * - 1을 뺀다.
 * <p>
 * ## 조건
 * - 1보다 크거나 같고, 10000000보다 작거나 같은 정수 N이 주어진다.
 * -
 * <p>
 * ## 계획
 * - 1이 될 때까지 문제와 유사하다.
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class MakeOne {

    public static int solution(int n) {
        int result = 0;

        while (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
                result += 1;
            }

            while (n % 2 == 0) {
                n /= 2;
                result +=1;

            }
            n -= 1;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = solution(n);

        System.out.println(result);
    }

    @Test
    public void result() {
        assertThat(solution(10)).isEqualTo(3);
        assertThat(solution(2)).isEqualTo(1);
    }

}

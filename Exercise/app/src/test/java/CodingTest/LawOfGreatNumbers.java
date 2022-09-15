package CodingTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 이해
 * <p>
 * 미지의 것: 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 큰수의 법칙에 따른 결과를 출력하세요.
 * 자료
 * - 큰 수의 법칙은 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만든다.
 * - 배열의 크기 N
 * - 숫자가 더해지는 횟수 M
 * - 더해지는 횟수 초과 K
 * <p>
 * 예시 24657 배열에 가장 큰 수와 두번째 큰수를 선택후 M 숫자가 더해지는 횟수 + K은
 * 조건
 * - 배열의 특정한 인데스에 해당하는 수가 연속해서 K번을 초과 할 수 없다.
 * -
 * <p>
 * ## 계획
 * - 배열의 가장 큰 수를 구한다.
 * - 배열의
 * <p>
 * ## 실행
 * <p>
 * ## 반성
 * -
 */

public class LawOfGreatNumbers {


    public int solution(int[] N, int M, int K) {

        // 배열을 정렬한다.
        Arrays.sort(N);

        // 배열의 길이를 구한다.
        int length = N.length;

        // 배열의 가장 큰 수를 구한다.
        int first = N[length - 1];

        // 배열의 두 번째 큰 수를 구한다.
        int second = N[length - 2];


        int count = M / (K + 1) * K;
        count += M % (K + 1);

        int result = 0;

        result += count * first;
        result += (M - count) * second;

        return result;
    }

    @Test
    void result() {

        assertThat(solution(new int[]{2, 4, 5, 4, 6}, 8, 3)).isEqualTo(46);

    }
}

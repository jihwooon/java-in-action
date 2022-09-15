package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 평균 구하기
 * 미지의 것: 정수를 담고 있는 배열 arr의 평균값을 return하는 함수
 * <p>
 * ## 자료
 * - 정수를 담고 있는 배열
 * - 평균값
 *
 * <p>
 * ## 조건
 * - 배열의 원소의 전체 합 / 배열의 길이 만큼 평균값을 구한다.
 * <p>
 * ## 계획
 * - 배열의 값을 받는다.
 * - 배열 안에 원소의 값들을 합한다.
 * - 합한 값을 원소의 길이만큼 나누기 한다.
 *
 * <p>
 * ## 반성
 * - 지문을 읽으면서 자료를 수집하는 동안 눈에 잘 안보여서 3초 고민하다가 입출력 부분을 보고 자료를 알 수 있었다.
 * - forEach 문을 사용해서 비교적으로 쉽게 풀 수 있었지만 재귀, Stream으로도 고려 해볼 수 있을 것 같다.
 */

public class GetAverage {

    public double solution(int... arr) {
        double answer = 0;

        for(double s : arr) {
            answer += s;
        }

        return answer / arr.length;
    }

    @Test
    void result() {
        assertThat(solution(new int[] {1,2,3,4})).isEqualTo(2.5);
        assertThat(solution(new int[] {5,5})).isEqualTo(5);
    }

}

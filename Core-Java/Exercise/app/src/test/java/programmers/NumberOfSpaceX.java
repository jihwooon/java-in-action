package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## x만큼 간격이 있는 n개의 숫자
 * 미지의 것: 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다
 * <p>
 * ## 자료
 * - x부터 시작해 x씩 증가하는 숫자 = 등차수열
 * >> 1 부터 1씩 증가
 * >> 2 부터 2씩 증가
 * -
 * ## 조건
 * - x는 -10000000 이상, 10000000 이하인 정수입니다.
 * - n은 1000 이하인 자연수입니다.
 * ## 계획
 * - x 입력 값을 받는다.
 * - n의 입력 받는 수만큼 배열을 생성한다.
 * - 첫번째 배열부터 n만큼 수를 증가 한다.
 * - 빈 배열 추가한다.
 * <p>
 * ## 반성
 * - 배열을 처음 생각 했을 때 int 형을 long 타입 배열로 어떻게 바꿀가 고민 했다.
 * - long타입은 int형보다 범위가 커서 int형에 사용할 수 있었다.
 * - 기본 타입의 크기 순을 고려 해봐야겠다.
 */

public class NumberOfSpaceX {
    public long[] solution(int x, int n) {
        // n의 입력 받은 수만큼 배열을 생성한다.
        long[] longs = new long[n];
        // int x를 long 타입으로 변환한다.
        long num = x;

        // 배열의 길이만큼 반복해서 n만큼 수를 증가 한다.
        for (int i = 0; i < longs.length; i++) {
            longs[i] = num;
        // x가 x만큼 더해진다.
            num = num + x;
        }

        return longs;
    }

    @Test
    void result() {
        assertThat(solution(2, 5)).isEqualTo(new long[]{2, 4, 6, 8, 10});
    }
}

package programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 자연수 뒤집어 배열로 만들기
 * ## 미지의 것
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * ## 자료
 * - 자연수 뒤집기
 * - 배열 형태
 * -
 * ## 조건
 * - n은 자연수 입니다.
 * -
 * <p>
 * ## 계획
 * - 1. 자연수 값을 입력 받는다.
 * - 2. 반복문 안에서 자연수를 %10 자연수를 나누다.
 * - 3. arraylist안에 자연수를 채워 넣는다.
 * - 4. int[] 배열을
 * <p>
 * ## 반성
 * - int[] 배열을 어떻게 수를 넣을까 고민 했었다. Array로 추가하고 int[]로 넣어주는 방법이 있다는걸 알게 되었다.
 * - int형을 String형으로 변환해서 풀어가는 방법을 알게 되었습니다.
 * - for문의 i를 forEach나 재귀를 사용할 때 어떻게 표현 할 수 있을까?
 * - String으로 내림차순을 표현하기 어려워서 StringBuffer를 사용해서 reverse를 했다.
 */
public class ReverseArray {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        int[] answer = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            answer[i] = sb.charAt(i) - '0';
            System.out.println("ch = " + sb);
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(12345)).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }


    public int[] solution1(long n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            list.add((int) n % 10);
            n /= 10;
        }

        int[] answer = new int[list.size()];

        for (int i = 0;  i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    @Test
    void result1() {
        assertThat(solution1(12345)).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }

}

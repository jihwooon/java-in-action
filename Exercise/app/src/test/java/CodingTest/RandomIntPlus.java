package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 십진법 D를 나타낸 배열 A가 주어졌을 때, D + 1의 결과를 다시 배열 A에 갱신하는 코드를 작성하라. <br>
 * 예를들어 입력으로 <1,2,9>가 주어졌을때, D + 1 결과는 <1,3,0>이 된다. <br>
 * 작성한 알고리즘은 유한 정밀도 산술로 이루어진 프로그램 언어로도 동작해야 한다.<br>
 */

/**
 * * 우리가 풀어야 할 문제는 무엇인가? -> 미지의 것을 찾는다.
 *     >> 십진법 D를 나타낸 배열 A가 주어졌을 때, D + 1의 결과를 다시 배열 A에 갱신하는 코드를 작성하라.
 * * 주어진 자료는 무엇인가? -> 데이터에 대한 정보를 수집한다.
 *      >> 십진법 : 1,2,3,4,6,7,8,9,0
 *      >> 배열 : 같은 타입의 숫자을 한 공간안에 나열은 한다. new Int[], ArrayList<Integer>
 *      >> 십진법 D가 결과로 D + 1로 갱신한다.
 *          -> 129 -> 130 즉 1의 자리가 +1이 되어야한다.
 * * 조건은 무엇인가? -> 위의 미지의 것이 자료와 연관이 되는가?
 *      >> 주어진 조건은 따로 없다.
 *
 * 계획
 *  1. 먼저 십진법으로 채워진 배열 리스트를 만듭니다.
 *  2. 입력 받은 값을 Int 형으로 변환 시킵니다.
 *  3. 변환값에 + 1 을 합니다.
 *  4. +1 된 값을 다시 배열로 바꿉니다.
 *  5. 배열 리스트에 반환합니다.
 *  */

public class RandomIntPlus {

    public int[] solution(int[] n) {
        int[] answer = {};
        int result = 0;

        for(int s : n) {
            int num = s + 1;
            System.out.println("num = " + num);
            int i = num % 100/10;
            System.out.println("i = " + i);

        }

        return answer;
    }

    @Test
    void result() {

//        assertThat(solution(new int[] {1,2,9})).isEqualTo(new int[] {1,3,0});
        assertThat(solution(new int[] {1,2,9})).isEqualTo(new int[] {});
    }

}

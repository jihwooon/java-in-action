package backJun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단어에서 가장 많이 사용된 알파벳을 대문자로 출력
 * ## 자료
 * - 알파벳 대문자 소문자
 * -
 * <p>
 * ## 조건
 * - 단, 대문자와 소문자를 구분하지 않는다.
 * - 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * <p>
 * ## 계획
 * - 문자열을 받는다.
 * - 알파벳 수만큼 배열을 만든다.
 * -
 * <p>
 * ## 반성
 * -
 * -
 */
public class 단어공부 {

    public char solution(String str) {

        String s = str.toUpperCase();

        int [] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A';
            System.out.println("num = " + num);
            System.out.println("coung++ = " + count[num]++);
        }

        int max = 0;
        char answer = '?';
        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                System.out.println("max = " + max);
                answer = (char) (i + 'A');
                System.out.println("answer = " + answer);
            } else if( max == count[i]) {
                answer = '?';
            }
        }
        return answer;
    }


    @Test
    void result() {
//        assertThat(solution("a")).isEqualTo('A');
//        assertThat(solution("b")).isEqualTo('B');
        assertThat(solution("ccb")).isEqualTo('C');
//        assertThat(solution("Mississipi")).isEqualTo('?');
    }
}

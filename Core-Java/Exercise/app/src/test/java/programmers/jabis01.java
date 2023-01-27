package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * - 각 학생의 출석 여부가 담긴 배열이 매개변수 students로 주어질 때, 각 학생의 출석 점수를 구해 점수가 높은 순서대로 학생 번호를 나열한 결과를 return 하는 함수를 구하라.
 * ## 자료
 * - 출석 'A'
 * - 지각 'L'
 * - 결석 'P'
 * -
 * ## 조건
 * - 출석(A)하면 1점을 얻는다.
 * - 결석하면 1점이 깍인다. 단 3번 결석하면 Fail 처리 총점 0이 된다.
 * - 지각하면 점수를 못 얻는다. 지각 2번 하면 결석 1회 처리
 * - 수업 일수 10일
 * - 'A','L','P' 외에 다른 문자는 주어지지 않는다.
 *
 * ## 계획
 *  - 문자열의 총합을 구한다.
 *  - 점수가 높은 순서대로 학생 번호를 나열한다.
 *  -

 * ## 반성
 * -
 * -
 *
 */

public class jabis01 {

    public int[] solution(String[] students) {
        int[] answer = {};

        //문자열의 총 합을 구한다.
        int result = 10;
        for(String s : students) {

        }

        return answer;
    }



    @Test
    void result() {
        assertThat(solution(new String[]{"AAALLLAPAA","AAAAAAAPP", "ALAAAAPAAA" })).isEqualTo(new int[]{3,1,2});
    }
}

package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


// 문자열 배열이 주어지는데, 거기서 빈도수가 높은 순으로 반환하는 함수를 작성하라. 빈도수가 같으면 사전순서대로 반환한다.
// 자료
//  문자열 배열
//  빈도수: 일이 반복 되어 있는 수
//  각 배열 자리에 같은 문자가 얼마나 반복 되어 있는지

// 계획
// 1. 문자열 배열을 받는다.
// 2. 받은 문자열의 빈도수를 확인한다.
//    2.1
//    2.2
// 3. 빈도수 높은 순서대로 반환한다.
// 4. 동일한 빈도수의 문자는 사전순으로 정렬한다.

// 문자열 배열이 주워졌는데, 특정만 들어 있는지 없는지 확인한다.

class Example1Test {

    public String[] solution(String[] str) {

        return null;
    }

    @Test
    void result() {


        // ['a', 'b', 'c', 'd', 'a', 'c', 'b', 'e', 'f', 'e', 'c', 'd']
        // ['c', 'a', 'b', 'c', 'd', 'e' ,'f']
//        assertThat(solution(new String[]{})).isEqualTo(new String[]{});
//        assertThat(solution(new String[]{null})).isEqualTo(new String[] {});
        assertThat(solution(new String[]{"a", "b", "a"})).isEqualTo(new String[]{"c","a","b","c", "d", "f"});
//        assertThat(solution(new String[]{"a", "b","a","b","c"})).isEqualTo("a","b","c");
    }

}

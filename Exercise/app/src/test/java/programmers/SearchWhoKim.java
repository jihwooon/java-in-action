package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchWhoKim {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) { //배열의 크기 만큼 for문 돌기
            if(seoul[i].equals("Kim")) { // Kim의 위치찾기
                answer = "김서방은 " + i+ "에 있다";
            }
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new String[] {"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
    }
}

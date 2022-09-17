package example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Example09Test {

    public int solution(String[] str) {
        List<String> list = Arrays.asList(str);
        int answer = 0;

        for(int i = 0; i< list.size(); i++) {
            if(!list.contains(i)) {
                String tep = list.get(i);
                answer = Collections.frequency(list, tep);
            }
        }

        return answer;
    }

    @Test
    void result() {

        assertThat(solution(new String[]{"a","b","c","a"})).isEqualTo(2);
        assertThat(solution(new String[]{"a","b","c","a","a"})).isEqualTo(3);
        assertThat(solution(new String[]{"a","b","c","a","b"})).isEqualTo(2);
        assertThat(solution(new String[]{"a","b","c","a","b","b"})).isEqualTo(3);
    }
}

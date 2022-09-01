package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Recursive {

    // 반복적으로 n!
    public int solution(int n) {

        if (n < 1) return 1;

        return n * solution(n - 1);
    }

    public int solution1(String str) {

        int result = str.charAt(0) - '0';
        
        if(result == 0) {
            return solution1(str.substring(1));
        }

        return result;

    }


    @Test
    void result() {

//        assertThat(solution1("10")).isEqualTo(1);
        assertThat(solution1("101")).isEqualTo(9);

    }
}

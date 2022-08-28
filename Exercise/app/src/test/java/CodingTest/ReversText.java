package CodingTest;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */

public class ReversText {

    public static void main(String[] args) throws IOException {
        ReversText T = new ReversText();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        for (String x : T.solution(N, str)) {
            System.out.println("x = " + x);
        }

    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;

    }

    @Test
    void result() {
        assertThat(solution(3, new String[]{"good", "Time", "Big"})).isEqualTo(Arrays.asList("doog", "emiT", "giB"));
//        assertThat(solution(3, new String[]{"good", "Time", "Big"})).isEqualTo("");
    }
}

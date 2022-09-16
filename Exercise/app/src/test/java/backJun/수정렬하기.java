package backJun;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 수정렬하기 {

    public static int[] solution(int... n) {

        Arrays.sort(n);
        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    @Test
    void result() {
        assertThat(solution(5, 2, 3, 4, 1)).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }
}

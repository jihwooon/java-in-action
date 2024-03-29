package example;

// ## 총합 구하기

/*
 * 숫자 배열이 주어져 있습니다. 모든 숫자의 합을 구하는 프로그램을 작성해주세요.
 * */

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.System.exit;
import static org.assertj.core.api.Assertions.assertThat;

public class Sum {

    public int solution(int... arr) {

        int sum = 0;

//        List<Integer> list = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toList());

//        for (int i = 0; i <= list.size() - 1; i++) {
//            sum += list.get(i);
//            System.out.println("sum : " + sum);
//        }


//        for (int num : list) {
//            sum += num;
//        }

        return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        exit(0);
    }

    @Test
    void result() {
        assertThat(solution(1, 4, 6, 8, 4, 3, 12, 5, 9)).isEqualTo(52);
    }
}

package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionTest {

    public int sumRange(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + sumRange(n - 1);
    }

    // 4! = 1 x 2 x 3 x 4
    public int factorial(int num) {
        int total = 1;
        for(int i = num; i > 1; i--) {
            total *= i;
        }
        return  total;
    }

    public int[] outer (int num) {
        int [] outerScopedVariable = {};

        helper(num);

        return outerScopedVariable;

    }

    public int helper (int helperInput) {

        return helper(helperInput--);
    }


    // 4! = 1 x 2 x 3 x 4
//    public int factorial(int num) {
//
//        if(num == 1) {
//            return 1;
//        }
//        return  num * factorial(num - 1);
//    }

    @Test
    void result() {
        assertThat(sumRange(3)).isEqualTo(6);
        assertThat(factorial(3)).isEqualTo(6);
    }

}

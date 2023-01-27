package Ch1;

import java.math.BigInteger;

/*
 * BigInteger를 사용해 팩토리얼 n! = 1 x 2 x ... x n을 계산하는 프로그램을 작성하라.
 * 그리고 프로그램을 이용해 1,000!을 계산하라.
 */
public class Ch1_6 {

    public BigInteger solution(int n) {

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        return solution(n - 1).multiply(BigInteger.valueOf(n));
    }
}

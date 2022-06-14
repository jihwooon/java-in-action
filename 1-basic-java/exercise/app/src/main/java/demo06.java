/**
 * 1. 문제에 대한 이해
 *     - 우리가 풀어야 할 문제는 무엇인가?
 *          BigInteger를 사용해 팩토리얼 n! = 1 X 2 X ... X n을 계산하는 프로그램을 작성하라. 그리고 프로그램을 이용해 10,000!을 계산하라
 *     - 주어진 자료는 무엇인가?
 *         - BigInteger은 큰 정수이다.
 *         - 팩토리얼은 n! = 1 x 2 x 3 ... n!
 *     - 조건은 무엇인가
 *         - BigInteger
 *         - 팩토리얼
 *         - 1,000!
 * 2. 계획
 *     - 이 문제를 푸는데 있어서 유용하게 쓸 수 있는 지식은 무엇인가?
 *         - 팩토리얼 식을 사용하면 된다.
 *         - BigInteger은 객체 형태이다.
 *
 *     **계획 실행**
 *
 *     1. BigInteger 객체를 호출한다.
 *     2. for문을 사용해 팩토리얼 식을 구한다.
 *     3. 1000! 팩토리얼 값을 넣고 구합니다.
 *
 * 4. 반성
 * 문제를 다른 방식으로 해결할 수 있는가?
 * Integer.toBinaryString 변환을 다른 방법으로 사용해서 바꿀 수 있는지 고민 해봐야겠습니다.
 * */
import java.math.BigInteger;

public class demo06 {
    public static void main(String[] args) {
        int number = 1;
        int fac = 1000;

        for (int i = fac; i > 0; i--) {

            fac = number * i;
            System.out.println("fac : " + fac);
        }
    }
}

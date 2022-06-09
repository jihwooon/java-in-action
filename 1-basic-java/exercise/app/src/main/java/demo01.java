/**
 * 1. 문제에 대한 이해
 *     - 우리가 풀어야 할 문제는 무엇인가?
 *         - 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라. 읽어 온 정수의 역수를 16진 부동소수점 수로 출력하라.
 *     - 주어진 자료는 무엇인가?
 *         - 2진수는 0과 1로만 이루어져 있다.
 *             - 만약 101 이면 2^2 * 1 + 2^1 * 0 + 2^0 * 1로 10진수로 변환할 수 있다.
 *         - 8진수는 0~7로만 표현된다
 *             - 자릿수 하나가 0부터 7까지 표현할 수 있다. 8부터는 10, 9는 11, 10은 12...하는 식으로 표기한다
 *         - 16진수는 0~f까지로 표현된다.
 *             - 1 ~ 9 까지 숫자로 표기하고 A ~ F 까지 로마 숫자로 표기한다.
 *     - 조건은 무엇인가
 *         - 정수
 *         - 2진수, 8진수,16 진수
 *         - 정수의 역수
 *         - 16진 부동소수점 수
 * 2. 계획
 *     - 이 문제를 푸는데 있어서 유용하게 쓸 수 있는 지식은 무엇인가?
 *         - 정수 표현은 Int로 사용한다.
 *         - 정수 표현 입력은 Scanner 객체를 호출해서 nextInt로 정수를 입력 받는다.
 *         - 2진수, 8진수, 16진수는 Integer 클래스의 메소드를 호출해서 변환 한다.
 *
 *     **계획 실행**
 *
 *     1. 정수를 default  = 0으로 설정 해 놓은다.
 *     2. Scanner 객체를 호출해서 정수를 입력 한다.
 *     3. 입력 받는 정수는 2진수, 8진수, 16진수 에 맞게 변환 시켜준다.
 *         1.toString(int n , 진수);
 *     4. 받아온 정수를 16진 부동소수점(double or float)으로 둘 중 고려해서 바꿔줍니다.
 *     5. `System.out.println` 통해 값을 출력합니다.
 *
 * 4. 반성
 * 문제를 다른 방식으로 해결할 수 있는가?
 * Integer.toBinaryString 변환을 다른 방법으로 사용해서 바꿀 수 있는지 고민 해봐야겠습니다.
 * */

import java.util.Scanner;

public class demo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String binaryString = Integer.toString(number, 2); // 2진수
        String octalString = Integer.toString(number, 8); // 8진수
        String hexString = Integer.toString(number, 16); // 16진수

        System.out.println("2진수 : " + binaryString);
        System.out.println("8진수 : " + octalString);
        System.out.println("16진수 : " + hexString);

        double reciprocal = Double.parseDouble(hexString);
        System.out.println("정수의 역수 : " + reciprocal);

    }

}

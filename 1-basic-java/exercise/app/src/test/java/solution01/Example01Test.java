package solution01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 어떤 문제를 풀 것인가?
// 정수의 값을 이진법으로 표현하기

// 주어진 자료은 무엇인가?
// 2진수는 0과 1로 이루어져 있습니다.
//    * 101 이면  2^2 * 1 + 2^1 * 0 + 2^0 *1 로 10진수를 표현한다.
// 정수는 10진법입니다.

// 조건은 무엇인가?
// 정수
// 이진법
// Math.pow() 제곱수 표현

// 계획
// 1. int 정수가 5 입력한다.
// 2. 정수값 5는 이진법 101으로 변환한다.
// 2-1 Math.pow(x,y)은 제곱수를 표현한다.
// 2-2 배열의 3자리까지 표현한다.
// 2-3 charAt() 특정 문자 char 타입으로 변환
// 2-4 1인 경우에만 반환하기

class Example01Test {
    //이진법 -> 십진법
    private int decimalFromBinary(String number) {

        // 자기 자신을 포함해서 하기
        int sum = 0;
        // String -> Int 변환
        Integer change = Integer.parseInt(number);

        // number 길이만큼 for 문 돌기
        for (int i = 0; i < number.length(); i++) {
            int spot = change.toString().charAt(i) - '0';

            // spot == 1인 경우 2의 제곱순의 합 반환
            if (spot == 1) {
                sum += Math.pow(2, number.length() - i - 1);
            }
        }

        return sum;
    }

//십진법 -> 이진법
// 1. 어떤 문제를 풀 것인가?
// 십진법을 이진법으로 표현하기

// 2. 주어진 자료은 무엇인가?
// 십진법은 이진법으로 나누기

// 3. 조건은 무엇인가?
// 십진법의 수를 몫이 0이 될 때까지 2로 계속 나누기

    // 4. 계획
//1. number 정수 값을 입력합니다.
//2. answer 값을 이진법으로 반환합니다.
//3. while 조건이 수행 할 때까지 게속 실행 합니다.
//4. number % 2 연산자를 통해 나머지를 구합니다.
//5. 나머지를 /2로 계속해서 1일 될 때까지 나눕니다.
    private String decimalToBinary(int number) {

        String answer = "";

        int d = number % 2;
        System.out.println("d : " + d);

        while (number > 0) {
            answer = number % 2 + answer;
            number /= 2;
            System.out.println("number /= " + number);
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(decimalFromBinary("11101")).isEqualTo(29);
        assertThat(decimalFromBinary("1011")).isEqualTo(11);
        assertThat(decimalToBinary(5)).isEqualTo("101");
        assertThat(decimalToBinary(10)).isEqualTo("1010");
        assertThat(decimalToBinary(11)).isEqualTo("1011");

    }
}

// 이진법 101 을 10진법으로 표현 하면 5
// 101을 분리 1,0,1로 분리한다.
// 101 = 배열의 자릿수로 표현
// 2^0 * (1) + 2^1 * (0) + 2^2 * (1) = 5
// 2^i = Math.pow(2,i);


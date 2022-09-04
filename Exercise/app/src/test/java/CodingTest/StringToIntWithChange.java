package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문자열은 문자들을 차례로 나열한 것과 같다. 종종 "123"과 같은 정수형 숫자를 문자열 형태로 나타내기도 한다. <br>
 * 정수형 숫자(음의 정수를 포함)값이 문자열로 주어졌을 때, 이를 정수형 숫자로 바꾸는 프로그램을 작성하라. <br>
 * 정수형 숫자가 입력으로 주어진다면 반대로 문자열로 출력한다. 이때 Java의 parseInt와 같은 라이브러리 함수를 사용하면 안 된다. <br>
 * 예를 들어 첫 번째 함수에 대한 입력이 정수 314이면 문자열 "314"를 반환해야 한며, 두 번째 함수에 대한 입력이 문자열 "314"이면 정수 314를 반환해야 한다.
 */

public class StringToIntWithChange {

    public String intToString(int n) {
        //Int형을 문자열로 반환 시킨다.
        String answer = "";
        int i = n % 10;
        n /= 10;
        System.out.println("i = " + n);

        return answer;
    }

    public int StringToInt(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if (ch != '+')
                result = result * 10 + (ch - '0');
        }
        return Sign ? 1 : -1 * result;

    }

    public int stringToInt(String str) {
        int answer = 0;

        for (int i = str.charAt(0) == '-' ? 1 : 0; i < str.length(); i++) {
            int result = str.charAt(i);
            answer = answer * 10 + (result - '0');
        }

        return str.charAt(0) == '-' ? -answer : answer;
    }


    @Test
    void result() {
        assertThat(stringToInt("123")).isEqualTo(123);
        assertThat(StringToInt("-123")).isEqualTo(-123);

    }
}

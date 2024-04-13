package modern;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * ## 미지의 것
 * 주어진 String 객체를 int나 long, float, double로 변환하는 프로그램을 작성하라
 * ## 자료
 * String 객체
 * int, float, double
 * ## 조건
 * String 객체를 원시 타입으로 변환
 *
 * ## 계획
 * 1. 문자열을 입력 받는다.
 * 2. 문자열 중 숫자가 아닌 경우 NumberFormatException를 발생시킨다.
 * 3. 문자열 크기 만큼 for문을 사용해서 탐색한다.
 * 4. ASCII를 빼서 문자열의 숫자를 Int형의 숫자로 똑같이 뺀다.
 * 5. digitValue 수를 multiplier에 곱한다.
 * 6. multiplier *= 해서 앞의 자리로 이동 시킨다.
 * 7. 결과값을 반환한다.
 *
 * ## 반성
 * 숫자를 나열하기 하려고 이것저것을 고민해봤는데 수를 온전히 합칠려면
 * multiplier 변수를 생성하고 for 문을 돌 때마다 자리숫를 채워가는 식으로 문제를 해결해야 헸다.
 * 이 식을 한번에 떠올리가 쉽지 않다.
 */

public class 문자열을변환 {

    private int stringToInt(String str) {
        ArrayList arrayList = new ArrayList<String>();

        int answer = 0;
        if (!str.matches("\\d+")) {
            throw new NumberFormatException();
        }

        int multiplier = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char digitChar = str.charAt(i);
            int digitValue = digitChar - '0';
            answer += digitValue * multiplier;
            multiplier *= 10;
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(stringToInt("12")).isEqualTo(12);
        assertThat(stringToInt("123")).isEqualTo(123);
        assertThat(stringToInt("1234")).isEqualTo(1234);
        assertThat(stringToInt("12345")).isEqualTo(12345);
    }
}

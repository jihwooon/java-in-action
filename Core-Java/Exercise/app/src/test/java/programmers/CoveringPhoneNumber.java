package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 핸드폰 번호 가리기
 * 미지의 것: 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수
 * <p>
 * ## 자료
 * - 문자열 뒷 4자리 빼고 "*" 처리
 *
 * <p>
 * ## 조건
 * -  phone_number는 길이 4 이상, 20이하인 문자열입니다.
 *
 *
 * <p>
 * ## 계획
 * - phone_number 문자열을 받는다.
 * - 문자열의 뒷자리 4 빼고 앞자리 전부를 "*"로 채운다.
 * - "*" 마스킹 된 문자열을 반환한다.
 *
 * <p>
 * ## 반성
 * - 자릿수를 맞추기 위해서 억지로 만든 기분이다.
 * - 좀더 효율적으로 코드로 풀어봐야겟다.
 */

public class CoveringPhoneNumber {

    public String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*").toString();
        }

        String str = phone_number.substring(phone_number.length() - 4);

        return sb.append(str).toString();
    }

    @Test
    void result() {

        assertThat(solution("01033334444")).isEqualTo("*******4444");
        assertThat(solution("027778888")).isEqualTo("*****8888");
    }

}

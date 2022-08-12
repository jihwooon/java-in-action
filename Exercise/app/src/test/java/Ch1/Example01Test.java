package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Example01Test {
    //이진법 -> 십진법
    private int decimalFromBinary(String number) {

        // 자기 자신을 포함해서 하기
        int sum = 0;
        // String -> Int 변환
//        Integer change = Integer.parseInt(number);
//        System.out.println("change : " + change);

        // number 길이만큼 for 문 돌기
        // basecase
        for (int i = 0; i < number.length(); i++) { // 0 부터 number 길이만큼
            int spot = number.charAt(i) - '0'; // 아스키 코드 '0' = 48
            System.out.print("spot : " + spot);
            // spot == 1인 경우 2의 제곱순의 합 반환
            if (spot == 1) {
                sum += Math.pow(2, number.length() - i - 1);
            }
        }

        return sum;
    }

    private int bineary_search(String str, int spread) {

        return str.charAt(spread) - '0';
    }

    @Test
    void answer() {
        assertThat(bineary_search("0", 0)).isEqualTo(0);
        assertThat(bineary_search("1", 0)).isEqualTo(1);
        assertThat(bineary_search("10", 1)).isEqualTo(2);
//        assertThat(decimalFromBinary("101", 3)).isEqualTo(10);
//        assertThat(decimalFromBinary("1", 1)).isEqualTo(2);
//        assertThat(decimalFromBinary("10", 2)).isEqualTo(4);

    }

    //이진법 -> 십진법(재귀)
    private int test(int number, int sum) {
        if (number == 0) {
            return 0;
        } else {
            sum += Math.pow(2, number);
            return sum;
        }

    }


//        int length1 = seg.length;
//        String rest1 = seg[0];
//        String rest2 = seg[1];
//        int length = seg.length;
//
//        System.out.println("rest1 : " + rest1);
//        System.out.println("rest2 : " + rest2);
//        System.out.println("length : " + length);


//            int spot = number.charAt(0) - '0';
//            System.out.println("=-=-=-=-= : " + spot);
//
//
//            if (spot == 1) {
//                pow = (int) Math.pow(2, number.length() - 1) + decimalFromBinary_recursive(number.substring(0, number.length() - 1));
//            }
//        int spot = number.length();

//        String substring = number.substring(0, spot);
//        System.out.println("substring : " + substring);
//
//
//        return pow;
    // 자릿수만큼 (int)Math.pow(2,number.length() - 1) * 1 늘어나야 한다.


//        return number.length() + decimalFromBinary_recursive(number.substring(0, number.length() - 6));
    // 1 인 경우
    // (int) Math.pow(2, number.length() - 1) + decimalFromBinary_recursive(number.length - 1);
//        return (int) Math.pow(2, number.length() - 1) + (int) Math.pow(2, number.length() - 2) + (int) Math.pow(2, number.length() - 3) + (int) Math.pow(2, number.length() - 4);// 1011
//        return (int)Math.pow(2,number.length() - 2) * 0 + (int)Math.pow(2, number.length() - 3) * 1 + (int)Math.pow(2, number.length() - 4) * 1; // 1101
//        return (int)Math.pow(2,number.length() - 1) * 1 + (int)Math.pow(2,number.length() - 2) * 1 + (int)Math.pow(2, number.length() - 3) * 1 + (int)Math.pow(2, number.length() - 4) * 1; // 1111
//        return (int)Math.pow(2,number.length() - 1) * 1+ (int)Math.pow(2,number.length() - 2) * 1 + (int)Math.pow(2,number.length() - 3) * 1 + (int)Math.pow(2, number.length() - 4) * 1 + (int)Math.pow(2, number.length() - 5) * 1; // 11111
//        return (int)Math.pow(2,number.length() - 1) * 1 + decimalFromBinary_recursive(number) - 1 ;


    // main에서 ~recursive(문자열 길이, 문자열);

//    // 이제 재귀 안에서
//    if(문자열 길이가 1이 되면)
//        return sum;
//    else {
//        if(문자열[문자열 길이-1] == 1이면) {
//            return sum + recursive(문자열길이 -1, 문자열);
//        }
//        else {
//            return recursive(문자열길이 -1, 문자열);
//        }
//    }

    private String decimalToBinary(int number) {

        String answer = "";

        while (number > 0) {
            answer = number % 2 + answer;
            number /= 2;
            System.out.print(number);
        }
        return answer;
    }


//    private int countSegments(String s) {
//        int answer = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') answer++;
//            System.out.println(" answer++ : " + answer);
//        }
//
//        if (s.length() != 0) {
//            return answer + 1;
//        } else {
//            return 0;
//        }
//    }

    @Test
    void result() {
//        assertThat(decimalFromBinary("11101")).isEqualTo(29);
//        assertThat(decimalFromBinary("1011")).isEqualTo(11);
//        assertThat(decimalFromBinary("")).isEqualTo(0);
//        assertThat(decimalToBinary(5)).isEqualTo("101");
//        assertThat(decimalToBinary(10)).isEqualTo("1010");
//        assertThat(decimalToBinary(11)).isEqualTo("1011");
//        assertThat(decimalToBinary(0)).isEqualTo("");
//        assertThat(decimalToBinary(11)).isEqualTo("1011");

//        assertThat(countSegments("Hello, my name is Argo")).isEqualTo(5);
//        assertThat(decimalFromBinary_recursive("1010", 4)).isEqualTo(15);

//        assertThat(decimalFromBinary_recursive("11111")).isEqualTo(31);
//        assertThat(decimalFromBinary_recursive("110")).isEqualTo(6);
//        assertThat(decimalFromBinary_recursive("1011", 4)).isEqualTo(11);
//        assertThat(decimalFromBinary_recurstion("0")).isEqualTo(0);
//        assertThat(decimalFromBinary_recurstion("1")).isEqualTo(1);
//        assertThat(decimalFromBinary_recurstion("10")).isEqualTo(2);
//        assertThat(decimalFromBinary_recurstion("11")).isEqualTo(3);
//        assertThat(decimalFromBinary_recurstion("100")).isEqualTo(4);
//        assertThat(decimalFromBinary_recurstion("101")).isEqualTo(5);
//        assertThat(decimalFromBinary_recurstion("110")).isEqualTo(6);
//        assertThat(decimalFromBinary_recurstion("123", 4)).isEqualTo(-1);
//        assertThat(decimalFromBinary_recursive("1010", 0, 4)).isEqualTo(15);
//        assertThat(star(5)).isEqualTo(11);
//        assertThat(star(new int[]{1, 2, 3, 4}, 3)).isEqualTo(6);
//        assertThat(decimalFromBinary_recursive("")).isEqualTo(0);


    }
}

package solution01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Example03Test {

    private int decimalFromBinary(String str) {

        int spot = str.charAt(0) - '0';

        if (str.length() > 1) {
            if (spot == 1) {
                return (int) Math.pow(2, str.length() - 1) + decimalFromBinary(str.substring(1));
            } else if (spot == 0) {
                return decimalFromBinary(str.substring(1));
            }
        }
        return spot;
    }

    private String decimalToBinary(int num) {

        String answer = "";

        if (num >= 1) {

            String str = num % 2 + answer;
            System.out.println("str : " +str);
            num /= 2;

            return "10";
        }

        return answer;
    }

    private int maxProgramme(int a, int b, int c) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if(a <= b) {
            return a;
        } else if (b <= c) {
            return b;
        } else if(a <= c){
            return c;
        } else {
            return a;
        }

    }

    @Test
    void solution() {
        assertThat(maxProgramme(2,3,5)).isEqualTo(5);
    }


    @Test
    void result() {
        assertThat(decimalFromBinary("0")).isEqualTo(0);
        assertThat(decimalFromBinary("1")).isEqualTo(1);
        assertThat(decimalFromBinary("10")).isEqualTo(2);
        assertThat(decimalFromBinary("11")).isEqualTo(3);
        assertThat(decimalFromBinary("100")).isEqualTo(4);
        assertThat(decimalFromBinary("101")).isEqualTo(5);
        assertThat(decimalFromBinary("110")).isEqualTo(6);
        assertThat(decimalFromBinary("111")).isEqualTo(7);
        assertThat(decimalFromBinary("1000")).isEqualTo(8);
        assertThat(decimalFromBinary("1001")).isEqualTo(9);
        assertThat(decimalFromBinary("1010")).isEqualTo(10);
        assertThat(decimalFromBinary("1011")).isEqualTo(11);
        assertThat(decimalFromBinary("1100")).isEqualTo(12);
        assertThat(decimalFromBinary("11100")).isEqualTo(28);
    }

    @Test
    void answer() {
//        assertThat(decimalToBinary(0)).isEqualTo("");
//        assertThat(decimalToBinary(1)).isEqualTo("1");
//        assertThat(decimalToBinary(2)).isEqualTo("10");
//        assertThat(decimalToBinary(2)).isEqualTo("10");
    }
}

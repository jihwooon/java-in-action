package solution01;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static org.assertj.core.api.Assertions.assertThat;

public class Example04Test {

    private int decimalFromBinary(String str) {
        int spot = str.charAt(0) - '0';

        if (str.length() <= 1) {
            return spot;
        }

        if (spot == 1) {
            return (int) Math.pow(2, str.length() - 1) + decimalFromBinary(str.substring(1));
        } else {
            return decimalFromBinary(str.substring(1));
        }
    }

    private String decimalToBinary(int num) {

        String answer = "";

        if (num >= 1) {
            answer = num % 2 + answer;
            return decimalToBinary(num / 2) + answer;
        }

        return answer;
    }

    private String DecimalToBinaryByTail(int num, String answer) {
        if (num < 1) { //baseCase
            return answer;
        }

        return DecimalToBinaryByTail(num / 2, num % 2 + answer); //
    }

    private String DecimalToBinaryBeforeTail(int num) {
        return DecimalToBinaryByTail(num, "");
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
    }

    @Test
    void answer() {
        assertThat(decimalToBinary(0)).isEqualTo("");
        assertThat(decimalToBinary(1)).isEqualTo("1");
        assertThat(decimalToBinary(2)).isEqualTo("10");
        assertThat(decimalToBinary(3)).isEqualTo("11");
        assertThat(decimalToBinary(4)).isEqualTo("100");
        assertThat(decimalToBinary(5)).isEqualTo("101");
        assertThat(decimalToBinary(6)).isEqualTo("110");
        assertThat(decimalToBinary(7)).isEqualTo("111");
        assertThat(decimalToBinary(8)).isEqualTo("1000");
        assertThat(decimalToBinary(9)).isEqualTo("1001");
        assertThat(decimalToBinary(10)).isEqualTo("1010");
        assertThat(decimalToBinary(11)).isEqualTo("1011");
        assertThat(decimalToBinary(12)).isEqualTo("1100");
        assertThat(decimalToBinary(13)).isEqualTo("1101");
        assertThat(decimalToBinary(28)).isEqualTo("11100");
    }

    @Test
    void create() {
        assertThat(DecimalToBinaryBeforeTail(0)).isEqualTo("");
        assertThat(DecimalToBinaryBeforeTail(1)).isEqualTo("1");
        assertThat(DecimalToBinaryBeforeTail(2)).isEqualTo("10");
        assertThat(DecimalToBinaryBeforeTail(3)).isEqualTo("11");
        assertThat(DecimalToBinaryBeforeTail(4)).isEqualTo("100");
        assertThat(DecimalToBinaryBeforeTail(5)).isEqualTo("101");
        assertThat(DecimalToBinaryBeforeTail(6)).isEqualTo("110");
        assertThat(DecimalToBinaryBeforeTail(7)).isEqualTo("111");
        assertThat(DecimalToBinaryBeforeTail(8)).isEqualTo("1000");
        assertThat(DecimalToBinaryBeforeTail(9)).isEqualTo("1001");
        assertThat(DecimalToBinaryBeforeTail(10)).isEqualTo("1010");
        assertThat(DecimalToBinaryBeforeTail(11)).isEqualTo("1011");
        assertThat(DecimalToBinaryBeforeTail(12)).isEqualTo("1100");
        assertThat(DecimalToBinaryBeforeTail(13)).isEqualTo("1101");
        assertThat(DecimalToBinaryBeforeTail(28)).isEqualTo("11100");

    }
}

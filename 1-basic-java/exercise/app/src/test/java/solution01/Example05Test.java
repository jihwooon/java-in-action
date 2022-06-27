package solution01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * int의 최대값보다 큰 double을 int 타입으로 변환하면 무슨 일이 일어나는가? 직접 시도해 보라.
 *
 * error: integer number too large
 * */
public class Example05Test {

    private double castDoubleToInt(double number) {
        double change = number;

        System.out.println("int change : "+ change);

        return change;
    }

    @Test
    void result() {

        assertThat(castDoubleToInt(2147483647.5)).isEqualTo(2147483647);
        assertThat(castDoubleToInt(2147483647.6)).isEqualTo(2147483647);
        assertThat(castDoubleToInt(2147483647.7)).isEqualTo(2147483647);
        assertThat(castDoubleToInt(2147483647.8)).isEqualTo(2147483647);
        assertThat(castDoubleToInt(2147483647.9)).isEqualTo(2147483647);
//        assertThat(castDoubleToInt(2147483648)).isEqualTo(2147483648);
//        assertThat(castDoubleToInt(2.0)).isEqualTo(2.0);
    }
}

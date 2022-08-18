package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// power(2,0) // 1
// power(2,2) // 4
// power(2,4) // 16

public class power {

    private int power(int number, int square) {
        if (square == 0) {
            return 1;
        }

        return number * power(number, square - 1);
    }

    @Test
    void result() {
        assertThat(power(2, 1)).isEqualTo(2);
        assertThat(power(2, 2)).isEqualTo(4);
        assertThat(power(2, 4)).isEqualTo(16);
    }
}

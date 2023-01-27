package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_5_Test {


    @Test
    void result() {
        Ch1_5 ch1_5 = new Ch1_5();

        assertThat(ch1_5.solution(1.0)).isEqualTo(2.147483648E9);
        assertThat(ch1_5.solution1(1.0)).isEqualTo(4.147483647E9);

    }
}

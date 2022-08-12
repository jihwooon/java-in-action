package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_3Test {

    @Test
    void Max_value_loop() {

        Ch1_3 ch1_3 = new Ch1_3();

        assertThat(ch1_3.solution(3,5, 10)).isEqualTo(10);
        assertThat(ch1_3.solution(11,2, 10)).isEqualTo(11);
        assertThat(ch1_3.solution(11,12, 10)).isEqualTo(12);

    }

    @Test
    void Max_value_Math_max() {

        Ch1_3 ch1_3 = new Ch1_3();

        assertThat(ch1_3.solution1(3,5, 10)).isEqualTo(10);
        assertThat(ch1_3.solution1(11,2, 10)).isEqualTo(11);
        assertThat(ch1_3.solution1(11,12, 10)).isEqualTo(12);
    }

}


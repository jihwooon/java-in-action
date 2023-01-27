package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_6_Test {

    @Test
    void result() {

        Ch1_6 ch1_6 = new Ch1_6();

        assertThat(ch1_6.solution(0)).isEqualTo(0);
        assertThat(ch1_6.solution(1)).isEqualTo(1);
        assertThat(ch1_6.solution(2)).isEqualTo(2);
        assertThat(ch1_6.solution(3)).isEqualTo(6);

    }

}

package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_4Test {

    @Test
    void result() {
        Ch1_4 ch1_4 = new Ch1_4();

        assertThat(ch1_4.MIN_VALUE()).isEqualTo(1.0E-323);
        assertThat(ch1_4.MAX_VALUE()).isEqualTo(1.7976931348623157E308);

    }
}

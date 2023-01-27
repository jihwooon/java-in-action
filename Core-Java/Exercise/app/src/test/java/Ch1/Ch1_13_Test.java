package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ch1_13_Test {

    @Test
    void result() {

        Ch1_13 ch1_13 = new Ch1_13();

        assertThat(ch1_13.solution().length).isEqualTo(6);
    }
}

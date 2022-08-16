package Ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_9Test {

    private Ch1_9 ch1_9;

    @BeforeEach
    void setUp() {
        ch1_9 = new Ch1_9();
    }


    @Test
    void result() {
        assertThat(ch1_9.solution("Hello", "Hello")).isTrue();
        assertThat(ch1_9.solution("Hello", "hello")).isFalse();
        assertThat(ch1_9.solution1("Hello", "Hello")).isTrue();
        assertThat(ch1_9.solution1("Hello", "hello")).isFalse();
    }

}

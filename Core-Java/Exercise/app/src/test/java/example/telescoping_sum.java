package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class telescoping_sum {

    public int sum(int n) {

        if(n <= 1) {
            return 1;
        }

        return sum(n -1) + n;
    }

    public int sum_1(int n) {


        return 1;
    }

    @Test
    void result() {
        assertThat(sum(1)).isEqualTo(1);
        assertThat(sum(2)).isEqualTo(3);
        assertThat(sum(3)).isEqualTo(6);
        assertThat(sum(4)).isEqualTo(10);
        assertThat(sum_1(1)).isEqualTo(1);
//        assertThat(sum(4)).isEqualTo(10);
    }
}

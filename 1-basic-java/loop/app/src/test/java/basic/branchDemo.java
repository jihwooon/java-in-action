package basic;

import org.assertj.core.api.NotThrownAssert;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class branchDemo {

    private double soultion(int count) {
        double average = 0;
        int sum = 10;

        if(count > 0) {
            average = sum / count;
        } else if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println("Hum?");
        }
        return average;
    }

    @Test
    void result() {

        assertThat(soultion(0)).isEqualTo(0 );
        assertThat(soultion(1)).isEqualTo(10);
        assertThat(soultion(2)).isEqualTo(5.0);
        assertThat(soultion(-1)).isEqualTo("Hum?");
    }
}

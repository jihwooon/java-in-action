package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Parity {

    public short parity(long x){
        short result = 0;

        while (x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }

        return result;
    }


    @Test
    void result() {

        assertThat(parity(1)).isEqualTo((short)1);
    }
}

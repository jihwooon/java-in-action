package basic.java.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ParityTest {

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

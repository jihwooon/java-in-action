package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyNumberTest {
    @Test
    void result() {
        int number = 3;

        MyNumber myNumber = new MyNumber(number);
//        assertThat(myNumber.isPrime()).isFalse();
        assertThat(myNumber.isPrime()).isTrue();

    }

}

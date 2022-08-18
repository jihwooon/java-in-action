package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 정수(양의 정수 또는 음의 정수)로 된 각도를 읽고 0~359도 사이의 값으로 정규화하는 프로그램을 작성하라.
 * (먼저 % 연산자를 사용한 후 floorMod 메서드를 이용해 작성한다.)
 * 정규화는 입력된 x 값들을 모두 0과 1사이의 값으로 변환하는 방식이다.
 * */
public class Example02Test {

    private int angleNormalization(int x, int y) {

        int answer = x % y;

        System.out.println("answer : " + answer);

        return answer;
    }

    private int angleNormalization_method(int x, int y) {

        int answer = Math.floorMod(x + y, 360);

        System.out.println("answer : " + answer);

        return answer;
    }

    @Test
    void result() {
        assertThat(angleNormalization(0,359)).isEqualTo(359);
        assertThat(angleNormalization(1,359)).isEqualTo(0);
        assertThat(angleNormalization(2,359)).isEqualTo(1);
        assertThat(angleNormalization(3,359)).isEqualTo(2);
        assertThat(angleNormalization(3,359)).isEqualTo(2);
        assertThat(angleNormalization(4,359)).isEqualTo(3);
        assertThat(angleNormalization(5,359)).isEqualTo(4);
        assertThat(angleNormalization(6,359)).isEqualTo(5);
        assertThat(angleNormalization(7,359)).isEqualTo(6);

    }
}

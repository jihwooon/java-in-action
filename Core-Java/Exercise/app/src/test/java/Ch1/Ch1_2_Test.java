package Ch1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ch1_2_Test {


    @Nested
    @DisplayName("solution 메서드는")
    class Describe_of {

        @Nested
        @DisplayName("0 ~ 359도 사이의 값으로 정규화")
        class Context_with_real {
            Ch1_2 ch1_2 = new Ch1_2();

            @Test
            @DisplayName("359 이하이면 % 연산자 양수 반환한다.")
            void it_returns_a_valid_positive_number() {
                assertThat(ch1_2.solution(10)).isEqualTo(10);
                assertThat(ch1_2.solution(11)).isEqualTo(11);
                assertThat(ch1_2.solution(12)).isEqualTo(12);
                assertThat(ch1_2.solution(13)).isEqualTo(13);

            }

            @Test
            @DisplayName("360 이상이면 % 연산자 음수를 반환한다.")
            void it_returns_a_valid_negative_number() {
                assertThat(ch1_2.solution(361)).isEqualTo(1);
                assertThat(ch1_2.solution(362)).isEqualTo(2);
                assertThat(ch1_2.solution(363)).isEqualTo(3);

            }
        }
    }

    @Nested
    @DisplayName("solution1 메서드는")
    class Describe1_of {

        @Nested
        @DisplayName("0 ~ 359도 사이의 값으로 정규화")
        class Context_with_real {
            Ch1_2 ch1_2 = new Ch1_2();

            @Test
            @DisplayName("359 이하이면 % 연산자 나머지를 반환한다.")
            void it_returns_a_valid_positive_number() {
                assertThat(ch1_2.solution1(1)).isEqualTo(1);
                assertThat(ch1_2.solution1(2)).isEqualTo(2);
                assertThat(ch1_2.solution1(3)).isEqualTo(3);
                assertThat(ch1_2.solution1(4)).isEqualTo(4);
                assertThat(ch1_2.solution1(5)).isEqualTo(5);

            }

            @Test
            @DisplayName("360 이상이면 % 연산자 나머지를 반환한다.")
            void it_returns_a_valid_negative_number() {
                assertThat(ch1_2.solution(361)).isEqualTo(1);
                assertThat(ch1_2.solution(362)).isEqualTo(2);
                assertThat(ch1_2.solution(363)).isEqualTo(3);

            }
        }
    }
}

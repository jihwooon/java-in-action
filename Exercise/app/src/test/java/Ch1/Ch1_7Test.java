package Ch1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ch1_7 클래스")
class Ch1_7Test {

    @Nested
    @DisplayName("solution 메서드에")
    class Describe_of {

        @Nested
        @DisplayName("정수 두 개를 읽어서 int 변수에 저장한 후")
        class Context_with_real {
            Ch1_7 ch1_7 = new Ch1_7();
          @Test
          @DisplayName("부호 합계를 반한환다.")
          void it_returns_sum() {
              assertThat(ch1_7.solution_sum(1,1)).isEqualTo(2);
              assertThat(ch1_7.solution_sum(1,2)).isEqualTo(3);
              assertThat(ch1_7.solution_sum(2,2)).isEqualTo(4);
              assertThat(ch1_7.solution_sum(3,2)).isEqualTo(5);
              assertThat(ch1_7.solution_sum(3,3)).isEqualTo(6);
              assertThat(ch1_7.solution_sum(0,429496729)).isEqualTo(429496729);

          }

            @Test
            @DisplayName("부호 곱을 반한환다.")
            void it_returns_multiply() {
                assertThat(ch1_7.solution_multiply(1,1)).isEqualTo(1);
                assertThat(ch1_7.solution_multiply(1,1)).isEqualTo(1);
                assertThat(ch1_7.solution_multiply(2,1)).isEqualTo(2);
                assertThat(ch1_7.solution_multiply(2,2)).isEqualTo(4);
                assertThat(ch1_7.solution_multiply(3,1)).isEqualTo(3);
            }

            @Test
            @DisplayName("부호 차이를 반한환다.")
            void it_returns_difference() {
                assertThat(ch1_7.solution_difference(1,1)).isEqualTo(0);
                assertThat(ch1_7.solution_difference(2,1)).isEqualTo(1);
                assertThat(ch1_7.solution_difference(1,2)).isEqualTo(-1);
                assertThat(ch1_7.solution_difference(2,2)).isEqualTo(0);

            }

            @Test
            @DisplayName("부호 몫을 반한환다.")
            void it_returns_quotient() {
                assertThat(ch1_7.solution_quotient(2,3)).isEqualTo(0);

            }

            @Test
            @DisplayName("부호 나머지를 반한환다.")
            void it_returns_remainder() {
                assertThat(ch1_7.solution_remainder(1,3)).isEqualTo(1);

            }
        }
    }

}

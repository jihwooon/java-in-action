package basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MyNumber Class는")
class MyNumberTest {

    @Nested
    @DisplayName("isPrime 메서드는")
    class Describe_of_isPrime {

        @Nested
        @DisplayName("반환하는 값이 홀수이면")
        class Context_with_odd_number {

          @Test
          @DisplayName("True를 반환한다.")
          void it_returns_true() {
              MyNumber myNumber = new MyNumber(9);
              assertThat(myNumber.isPrime()).isTrue();

          }
        }

        @Nested
        @DisplayName("반환하는 값이 짝수이면")
        class Context_with_even_number {

            @Test
            @DisplayName("False를 반환한다.")
            void it_returns_false() {
                MyNumber myNumber = new MyNumber(11);
                assertThat(myNumber.isPrime()).isFalse();

            }
        }

        @Nested
        @DisplayName("파라미터 값 2이하이면")
        class Context_with_below_number_of_two {

            @Test
            @DisplayName("False를 반환한다.")
            void it_returns_false() {
                MyNumber myNumber = new MyNumber(2);
                assertThat(myNumber.isPrime()).isFalse();

            }
        }
    }

    @Nested
    @DisplayName("sumUptoN 메서드는")
    class Describe_of_ {

        @Nested
        @DisplayName("테스트 대상이 놓인 상황을 설명한다.")
        class Context_with_real {
          @Test
          @DisplayName("테스트 대상의 행동을 설명한다.")
          void it_returns_a_valid_complex() {

          }
        }
    }
}

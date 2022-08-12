package Ch1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/*
* 2차원 정수 배열을 읽고 매직 스퀘어(즉, 모든 행과 열, 대각선의 합이 같은 사각형)인지 판별하는 프로그램을 작성하라.
(프로그램은 입력 줄을 받아서 개별 정수로 분리하고,
사용자가 빈 줄을 입력하면 중단한다.
예를 들어 입력이 다음과 같으면 프로그램은 긍정으로 응답해야 한다.)
    16 3 2 13
    5 10 11 8
    9 6 7 12
    4 15 14 1
    (빈 줄)
* */

public class Example14Test {

    public boolean solution(int[][] square) {

        // 입력 받은 줄을 받아서 개별 정수로 분리
        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square.length; j++) {

                if(square[i] == square[j]) {
                    System.out.printf("%4d",square[i][j]);
                    return true;
                }
                // 빈줄이면 중단 반환
            }

            System.out.println();
            //[i][j] 가 같으면 true
        }


        // 정사각형이면 true 아니면 false
        return false;
    }

    @Nested
    @DisplayName("solution 메서드가")
    class Describe_of {

        @Nested
        @DisplayName("매직 스퀘어인 경우에는")
        class Context_with_real {
          @Test
          @DisplayName("true로 반환한다.")
          void it_returns_a_square_true() {
              assertThat(solution(new int[][]{
                      {16, 3, 2, 13},
                      {5, 10, 11, 8},
                      {9, 6, 7, 12},
                      {4, 15, 14, 1},
              })).isTrue();
          }
        }

        @Nested
        @DisplayName("매직 스퀘어 아닌 경우에는")
        class Context_with_real1 {
            @Test
            @DisplayName("false로 반환한다.")
            void it_returns_a_square_false() {
                assertThat(solution(new int[][]{
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},

                })).isFalse();
            }
        }
    }

}

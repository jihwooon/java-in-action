package basic.java.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    @Test
    void result() {
        Solution solution = new Solution();

        assertThat(solution.solution(6, 6, new int[][]{})).isEqualTo(new int[]{8, 10, 25});
    }

}

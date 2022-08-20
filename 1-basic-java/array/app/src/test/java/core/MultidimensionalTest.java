package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultidimensionalTest {

    private Multidimensional multidimensional;

    @BeforeEach
    public void setUp() {
        multidimensional = new Multidimensional();
    }

    @Test
    void makeMultidimensionalArray() {
        assertThat(multidimensional.square).isEqualTo(new int[][]{
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}});

        assertThat(multidimensional.square[1][2]).isEqualTo(11);
        assertThat(multidimensional.square[1]).isEqualTo(new int[]{5, 10, 11, 8});

    }

    @Test
    void changeWithIndex() {
        int[] swapIndexs = multidimensional.swapIndex();
        assertThat(swapIndexs).isEqualTo(new int[]{16, 3, 2, 13});
    }

    @Test
    void makeWithTriangle() {
        int[][] triangle = multidimensional.makeTriangle();
        assertThat(triangle).isEqualTo(new int[][]{
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1}
        });
    }
}

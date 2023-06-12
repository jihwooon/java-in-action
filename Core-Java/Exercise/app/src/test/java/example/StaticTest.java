package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class StaticTest {
    static int classVariable = 1; //클래스 변수

    public int method(int parameter) {
        int localVariable = 0;
        return parameter;
    }

    public static int setClassVariable(final int classVariable) {
        StaticTest.classVariable = classVariable;
        return StaticTest.classVariable;
    }

    @Test
    void result() {
        int x = setClassVariable(10);
        assertThat(x).isEqualTo(10);
        assertThat(StaticTest.classVariable).isEqualTo(10);
    }
}

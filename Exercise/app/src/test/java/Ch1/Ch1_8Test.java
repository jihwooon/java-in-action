package Ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ch1_8Test {


    @Test
    void result() {

        Ch1_8 ch1_8 = new Ch1_8();

        assertThat(ch1_8.solution("code")).isEqualTo("e");
//        assertThat(ch1_8.solution("code")).isEqualTo("e");
        assertThat(ch1_8.solution("i luv code")).isEqualTo("e");
//        assertThat(ch1_8.solution("i luv code")).isEqualTo("lu");
//        assertThat(ch1_8.solution("")).isEqualTo("");


    }

}

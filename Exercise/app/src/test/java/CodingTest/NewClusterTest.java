package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NewClusterTest {

    @Test
    void result() {
        NewCluster newCluster = new NewCluster();

        assertThat(newCluster.solution("FRANCE", "french")).isEqualTo(16384);
    }
}

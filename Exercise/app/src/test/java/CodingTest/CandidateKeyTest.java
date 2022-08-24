package CodingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CandidateKeyTest {


    @Test
    void result() {

        CandidateKey candidateKey = new CandidateKey();

        assertThat(candidateKey.solution(new String[][]{
                {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"}

        })).isEqualTo(0);
    }

}

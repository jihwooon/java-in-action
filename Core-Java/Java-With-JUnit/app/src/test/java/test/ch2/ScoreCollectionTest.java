package test.ch2;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {

    @Test
    public void answersArithemticMeanOfTwoNumbers() {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(6));

    }

}

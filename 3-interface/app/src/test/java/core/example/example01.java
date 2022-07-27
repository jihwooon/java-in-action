package core.example;

import core.IntSequence;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * 먼저 객체를 어떤 방법으로 측정하는 double getMeasureO 메서드를 가진 Measurable 인터페이스를 만든다.
 * 그다음 Employee가 Measurable을 구현하게 한다.
 * 마지막으로 평균 측정치를 계산하는 double average(Measurable[] objects) 메서드를 만들어 직원 배열의 평균 급여를 계산하는데 사용하라.
 * */

public class example01 {
    interface Measurable {
        double getMeasure();
    }

    public class Employee implements Measurable {
        private int number;

        @Override
        public double getMeasure() {
            int result = number % 10;
            number /= 10;
            return result;
        }
    }

    class MeasurableDemo {

        double average(Measurable measurable, int n) {
            int count = 0;
            double sum = 0;
            while (measurable.getMeasure()) {
                count++;
                sum += measurable.getMeasure();
            }

            return count == 0 ? 0 : sum / count;
        }
    }

    @Test
    void test() {

    }

}

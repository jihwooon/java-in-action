package core.example;

import org.junit.jupiter.api.Test;

/*
 * 먼저 객체를 어떤 방법으로 측정하는 double getMeasureO 메서드를 가진 Measurable 인터페이스를 만든다.
 * 그다음 Employee가 Measurable을 구현하게 한다.
 * 마지막으로 평균 측정치를 계산하는 double average(Measurable[] objects) 메서드를 만들어 직원 배열의 평균 급여를 계산하는데 사용하라.
 * */

public class ch3_1 {
    interface Measurable {
        double getMeasure();
    }

    public class Employee implements Measurable {
        int sum;
        int count;

        @Override
        public double getMeasure() {
            return sum/count;
        }
    }

    @Test
    void test() {

    }

}

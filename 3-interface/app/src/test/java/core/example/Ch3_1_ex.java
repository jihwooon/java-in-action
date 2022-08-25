package core.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ch3_1_ex {

    interface Measurable {
        double getMeasure();
    }

    static class Employee implements Measurable {

        private double salary;

        public Employee(double salary) {
            this.salary = salary;
        }

        @Override
        public double getMeasure() {
            return this.salary;
        }

        static double average(Measurable[] objects) {

            var result = Arrays.asList(objects)
                    .parallelStream()
                    .mapToDouble((o) -> o.getMeasure())
                    .average();
            return result.getAsDouble();
        }
    }

    @ParameterizedTest
    @CsvSource({"'0.0,20.0', 10.0,",
            "'10.0,20.0,30.0', 20.0",
            "'1.0,1.0,1.0,3.0,3.0,3.0', 2.0"})
    public void testEmployeeAverageSalary(String data, double average) {
        var input = Arrays.stream(data.split(","))
                .map(s -> new Ch3_1_ex.Employee(Double.parseDouble(s)))
                .toArray(Ch3_1_ex.Measurable[]::new);
        assertEquals(average, Ch3_1_ex.Employee.average(input), 0.0001);
    }
}

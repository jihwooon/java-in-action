package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Employee1Test {

    private Employee1 employee1;
    private String NAME = "철수";
    private double SALARY = 50000;
    private int id = 1;

    private String path = "/task/";

    @BeforeEach
    void setUp() {
        employee1 = new Employee1(NAME, SALARY);
        employee1.raiseSalary(10);
//        employee.getId();
        path.substring("/task/".length());
        System.out.println(path);
//        System.out.println(employee.getName());
//        System.out.println(employee.getSalary());

    }

    @Test
    void creation() {
        assertThat(employee1.getName()).isEqualTo(NAME);
        assertThat(employee1.getSalary()).isEqualTo(55000.0);
//        assertThat(employee.getId()).isEqualTo(id);
        assertThat(path.length()).isEqualTo(0);
    }

    @Test
    void EvilManagerCreation() {
        EvilManager evilManager = new EvilManager();
//        evilManager.giveRandomRaise(employee);
        System.out.println(evilManager);

    }
}

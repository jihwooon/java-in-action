package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;
    private String NAME = "철수";
    private double SALARY = 50000;
    private int id = 1;

    private String path = "/task/";

    @BeforeEach
    void setUp() {
        employee = new Employee(NAME, SALARY);
        employee.raiseSalary(10);
//        employee.getId();
        path.substring("/task/".length());
        System.out.println(path);
//        System.out.println(employee.getName());
//        System.out.println(employee.getSalary());

    }

    @Test
    void creation() {
        assertThat(employee.getName()).isEqualTo(NAME);
        assertThat(employee.getSalary()).isEqualTo(55000.0);
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

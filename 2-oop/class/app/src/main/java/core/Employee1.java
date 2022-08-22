package core;

import java.util.Random;

public class Employee1 {

    private static int lastId = 0;
    private int id;
    private String name;
    private double salary;
    private String path = "/task/";

    private static final Random generator = new Random();

    public Employee1() {
        id = 1 + generator.nextInt(1_00_000);
    }


    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        Employee1 employee1 = new Employee1();
        int id1 = employee1.getId();

        System.out.println("id1 : " + id1);
    }
}

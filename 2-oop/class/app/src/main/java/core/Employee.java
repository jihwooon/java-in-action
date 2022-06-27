package core;

import java.util.Random;

public class Employee {

    private static int lastId = 0;
    private int id;
    private String name;
    private double salary;
    private String path = "/task/";

    private static final Random generator = new Random();

    public Employee() {
//        lastId++;
//        id = lastId;
        id = 1 + generator.nextInt(1_000_000);
    }

//    private int generateId() {
//        id += 1;
//        return id;
//    }

    public Employee(String name, double salary) {
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

    public void setId(int id) {
        this.id = id;
    }
}

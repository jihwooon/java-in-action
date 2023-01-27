package core;

import java.util.Random;

public class EvilManager {

    private Random generator;

    public EvilManager() {
        generator = new Random();
    }

    public void giveRandomRaise(Employee1 employee1) {
        double percentage = 10 * generator.nextDouble();
        employee1.raiseSalary(percentage);
    }

    public void increaseRandomly(double x) { // 의도한 대로 작동하지 않는다.
        double amount = x * generator.nextDouble();
        x += amount;
    }

    public void replaceWithZombie(Employee1 employee1) {
        employee1 = new Employee1("", 0);
    }

}

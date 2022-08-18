import java.util.Random;

public class EvilManager {

    private Random generator;

    public EvilManager() {
        this.generator = new Random();
    }

    public void giveRandomRaise(Employee e) {
        double percentage = 10 * generator.nextGaussian();
        e.raiseSalary(percentage);
    }

    public void replaceWithZombie(Employee e) {
        e = new Employee("", 0);
    }

    public static void main(String[] args) {
        EvilManager boss = new EvilManager();
        Employee fred = new Employee("Fred", 50000);

        System.out.println("Salary before : " + fred.getSalary());
        boss.giveRandomRaise(fred);
        System.out.println("Salary after : " + fred.getSalary());


        System.out.println("Employee before : " + fred.getName());
        boss.replaceWithZombie(fred);
        System.out.println("Employee after : " + fred.getName());

    }
}

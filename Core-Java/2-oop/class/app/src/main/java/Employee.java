public class Employee {

    private static int lastId = 0;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
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

    public void generated() {
        lastId++;
        id = lastId;
    }

    public static void main(String[] args) {
        Employee fred = new Employee("Fred", 50000);
        fred.raiseSalary(10);
        fred.generated();
        System.out.println(fred.getId()); // 1
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());


        Employee fred1 = new Employee("Fred", 50000);
        fred1.raiseSalary(10);
        fred1.generated();
        System.out.println(fred1.getId());// 2
        System.out.println(fred1.getName());
        System.out.println(fred1.getSalary());

        Employee fred2 = new Employee("Fred", 50000);
        fred2.raiseSalary(10);
        fred2.generated();
        System.out.println(fred2.getId());// 2
        System.out.println(fred2.getName());
        System.out.println(fred2.getSalary());
    }
}

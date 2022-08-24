package example;

public class EmployeeVO {

    private int id;
    private String name;
    private String phoneNumber;
    private String department;
    private String position;

    protected EmployeeVO() {
    }

    public EmployeeVO(int id, String name, String phoneNumber, String department, String position) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void output() {
        System.out.printf("%4d %6s %15s %6s %6s/n", id, name, phoneNumber, department, position);
    }
}

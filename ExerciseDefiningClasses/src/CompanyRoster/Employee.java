package CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n\\a";
        this.age = -1;
    }

    public Employee(String name, double salary, String position, String department, String emAge) {
        this(name, salary, position, department);
        if (emAge.contains("@")) this.email = email;
        else this.age = Integer.parseInt(emAge);
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this(name, salary, position, department, email);
        this.age = age;
    }
}

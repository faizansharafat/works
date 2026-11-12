
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Task7 {
    public static void main(String[] args) {

        Employee e = new Employee("Ali", 50000);

        System.out.println("Before Salary Change:");
        e.show();

        e.setSalary(65000);

        System.out.println(" After Salary Change:");
        e.show();
    }
}

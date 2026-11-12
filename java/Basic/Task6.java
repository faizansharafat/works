
final class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Task6{
    public static void main(String[] args) {

        Student s = new Student(101, "Ali");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());

        // Compile-time error:
        // s.name = "Bilal";
    }
}

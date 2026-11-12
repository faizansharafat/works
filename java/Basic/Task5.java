
public class Task5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println("First Reference: " + sb1);
        StringBuilder sb2 = sb1;
        sb2.append(" Java");
        System.out.println("First Reference Again: " + sb1);
        System.out.println("Second Reference: " + sb2);
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;
        int value = obj;

        System.out.println("Primitive Value: " + num);
        System.out.println("Integer Object: " + obj);
        System.out.println("Unboxed Value: " + value);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int sum = 0;
        for (Integer n : list) {
            sum += n;
        }
        System.out.println("List: " + list);
        System.out.println("Sum: " + sum);
        Integer x = null;
        System.out.println("Null Value: " + x);
    }
}

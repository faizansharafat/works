public class task02 {
    public static void main(String[] args) {
        String s1 = "250";
        int num = Integer.parseInt(s1);
        num = num + 50;
        System.out.println("Integer Result: " + num);
        String s2 = "3.14";
        double d = Double.parseDouble(s2);
        d = d * 2;
        System.out.println("Double Result: " + d);
        System.out.println("Is Digit: " + Character.isDigit('7'));
        System.out.println("Is Letter: " + Character.isLetter('A'));
        System.out.println("Uppercase: " + Character.toUpperCase('a'));
        System.out.println("MAX VALUE: " + Integer.MAX_VALUE);
        System.out.println("MIN VALUE: " + Integer.MIN_VALUE);
    }
}

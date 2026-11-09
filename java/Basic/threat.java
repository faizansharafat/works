
class cooking extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("she is cooking with him.");
            i++;
        }
    }
}

class chating extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("she is chating ... chating with him.");
            i++;
        }
    }
}

class faizan implements Runnable {
    public void run() {
        System.out.println("i am good in commedy:");
    }
}

class faran implements Runnable {
    public void run() {
        System.out.println("l am food in reading urdu");
    }
}

public class threat extends Thread {

    threat(Runnable r) {
        super(r);
    }

    public static void main(String[] args) {

        faizan f1 = new faizan();
        faran f2 = new faran();

        threat t1 = new threat(f1);
        threat t2 = new threat(f2);

        t1.start();
        t2.start();
    }
}

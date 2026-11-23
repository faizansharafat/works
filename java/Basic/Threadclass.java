class chating extends Thread {
    public void run() {
        for (int j = 0; j <= 19; j++) {
            System.out.println(" ..........l am doing chat with her ..........");
        }
    }
}

class cooking extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("l was cook good food in past");
        }
    }
}

public class Threadclass {
    public static void main(String[] args) {
        chating ch = new chating();
        cooking co = new cooking();
        ch.start();
        co.start();

    }
}
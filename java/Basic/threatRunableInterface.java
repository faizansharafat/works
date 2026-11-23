
class faizan implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i am good in commedy ................:");
        }
    }
}

class faran implements Runnable {
    public void run() {
        int j=1;
        do{
        System.out.println("l am food in reading urdu");
        j++;
    }
    while(j<=10);
      
    }

    public static void main(String[] args) {

        faizan f1 = new faizan();
        Thread t1 = new Thread(f1);
        faran f2 = new faran();
        Thread t2 = new Thread(f2);

        t1.start();
        t2.start();
    }
}

class bankacc{
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    private double balance;
   public void deposit (double amount){
       if ( amount>0) {
           balance += amount;
       }
       else {
           System.out.println("enter valid amount ");
       }
    }
    public void withddraw(double amount){
        if ( amount>0){
            balance-=amount;
        }
        else {
            System.out.println("enter valid amount ");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        bankacc b1=new bankacc();
        b1.setBalance(50000);
        System.out.println(b1.getBalance());
        b1.withddraw(-10000); // not work
        b1.deposit(500);
        System.out.println(b1.getBalance());
    }
}

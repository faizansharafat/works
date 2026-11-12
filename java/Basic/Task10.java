
final class BankAccount {

    private final String accountNo;
    private final String holderName;

    public BankAccount(String accountNo, String holderName) {
        this.accountNo = accountNo;
        this.holderName = holderName;
    }
    public String getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }
}

class Transaction {

    private double balance;
    public Transaction(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Main Class
public class Task10{

    public static void main(String[] args) {

        // BankAccount Object
        BankAccount account = new BankAccount("123456789", "Ali");
        System.out.println("Bank Account Details:");
        System.out.println("Account No: " + account.getAccountNo());
        System.out.println("Holder Name: " + account.getHolderName());
        Transaction transaction = new Transaction(50000);
        System.out.println(" Transaction Details:");
        System.out.println("Initial Balance: " + transaction.getBalance());
        transaction.setBalance(75000);
        System.out.println("Updated Balance: " + transaction.getBalance());
    }
}


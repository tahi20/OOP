import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }
    public void deposit(double amount){
        Amount a1 = new Amount(amount, TransactionType.DEPOSIT);
        this.transactions.add(a1);
        this.balance += amount;
    }
    public void withdraw(double amount){
        Amount a1 = new Amount(amount, TransactionType.Withdrawal);
        this.transactions.add(a1);
        this.balance -= amount;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + " " + transaction.getAmount());
        }
    }

    public int getAccountNumber(){

        return this.accountNumber;
    }
    public String getAccountHolder(){

        return this.accountHolder;
    }
    public double getBalance(){

        return this.balance;
    }

}

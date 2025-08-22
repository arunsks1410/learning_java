package privateaccessmodifiers;

public class BankAccount {
    private double balance;

    private void updateBalance(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            updateBalance(amount);
            System.out.println("Amount deposited successfully " + balance);
        }

    }

    public double getBalance() {
        return balance;
    }
}

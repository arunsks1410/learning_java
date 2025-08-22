package accessmodifiers;

public class BankAccount {
    private double balance = 1702;

    protected double calculateInterest() {
        return balance * 0.05;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

}

class Main extends BankAccount {
    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        System.out.println("current balance : " + ba.getBalance());
        ba.deposit(1410);
        System.out.println("Amount deposited successfully !!! " + 1410);
        System.out.println("current balance : " + ba.getBalance());
    }
}

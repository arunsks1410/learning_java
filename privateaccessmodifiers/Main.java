package privateaccessmodifiers;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(2300);
        System.out.println("Balance : " + account.getBalance());

        // account.balance = 5000;
        // account.updateBalance(5000);

    }
}

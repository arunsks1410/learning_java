// Assignment

// package accessmodifiers;

class BankAccount {
    private double balance; // Only the BankAccount itself can directly access

    protected double calculateInterest() {
        double rate = 0.05; // 5% interest
        return balance * rate;
    }

    public void displayAccountDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}
